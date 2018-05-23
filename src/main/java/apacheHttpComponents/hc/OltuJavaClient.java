package apacheHttpComponents.hc;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.testng.Assert;

import java.io.IOException;

import static org.apache.http.client.fluent.Form.*;

public class OltuJavaClient {

    private static final String TOKEN_REQUEST_URL = "https://perf-hyb.aldoshoes.com/authorizationserver/oauth/token";

    private static final String CLIENT_ID = "client_composer";

    private static final String CLIENT_SECRET = "yng4bUAD";

    private static final String USER_NAME = "ssatest@gmail.com";

    private static final String PASS = "Test123";

    private static final String DOMAIN = "https://perf-hyb.aldoshoes.com";

    private static final String LOCALE = "usAldo";

    private static final String EMAIL = generateEmail();


    public static void main(String[] args) throws IOException, OAuthProblemException, OAuthSystemException {

        //Generate tokens
        String user_token = getUserToken();
        String server_token = getServerToken();
        System.out.println("Server Token: " + user_token);
        System.out.println("User Token: " + server_token);

        // Create User
        HttpResponse response_POST = Request.Post(DOMAIN + "/aldowebservices/vcomp/" + LOCALE + "/users?isEmailSignedUp=false")
                .addHeader("Authorization", "Bearer " + server_token)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .bodyForm(form().add("login", EMAIL)
                        .add("password", PASS)
                        .add("firstName", "Diego")
                        .add("lastName", "Aristizabal")
                        .add("titleCode", "mr")
                        .add("isEmailSignedUp", "true").build())
                .execute().returnResponse();

        Assert.assertEquals(response_POST.getStatusLine().getStatusCode(), 201);
        System.out.println("User was created: " + response_POST.getStatusLine().getStatusCode());

        //Is User Exists
        HttpResponse response_Get = Request.Get(DOMAIN + "/aldowebservices/vcomp/" + LOCALE + "/users?login=" + EMAIL)
                .addHeader("Authorization", "Bearer " + server_token)
                .execute().returnResponse();

        Assert.assertEquals(response_Get.getStatusLine().getStatusCode(), 200);
        System.out.println("Get is user exists: " + response_Get.getStatusLine().getStatusCode());

        // Get Profile
        HttpResponse response_Get_Profile = Request.Get(DOMAIN + "/aldowebservices/v2/" + LOCALE + "/users/" + EMAIL)
                .addHeader("Authorization", "Bearer " + server_token)
                .addHeader("Authorization", "Bearer " + user_token)
                .execute().returnResponse();

        Assert.assertEquals(response_Get_Profile.getStatusLine().getStatusCode(), 200);
        System.out.println("Get profile: " + response_Get_Profile.getStatusLine().getStatusCode());

        // Update email
        HttpResponse response_PUT =  Request.Put(DOMAIN + "/aldowebservices/v2" + LOCALE + "/users/" + EMAIL + "/login")
                .addHeader("Authorization", "Bearer " + server_token)
                .addHeader("Authorization", "Bearer " + user_token)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .bodyForm(form().add("newLogin", "1234" + EMAIL)
                        .add("password", "Test123").build())
                .execute().returnResponse();

        Assert.assertEquals(response_PUT.getStatusLine().getStatusCode(), 200);
        System.out.println("Update email: " + response_PUT.getStatusLine().getStatusCode());
    }

    private static String generateEmail() {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        return "ssatesters" + RandomStringUtils.random(10, characters) + "@gmail.com";
    }

    private static OAuthClientRequest.TokenRequestBuilder getTokenRequestBuilder(GrantType password) {
        return OAuthClientRequest.tokenLocation(TOKEN_REQUEST_URL)
                .setGrantType(password);
    }

    private static OAuthClient getOAuthClient() {
        return new OAuthClient(new URLConnectionClient());
    }

    private static String getServerToken() throws OAuthSystemException, OAuthProblemException {
        OAuthClientRequest request_Server =
                getTokenRequestBuilder(GrantType.CLIENT_CREDENTIALS)
                        .setClientId(CLIENT_ID)
                        .setClientSecret(CLIENT_SECRET)
                        .buildQueryMessage();
        return getAccessToken(request_Server);
    }

    private static String getUserToken() throws OAuthSystemException, OAuthProblemException {
        OAuthClientRequest request_User =
                getTokenRequestBuilder(GrantType.PASSWORD)
                        .setUsername(USER_NAME)
                        .setPassword(PASS)
                        .setClientId(CLIENT_ID)
                        .setClientSecret(CLIENT_SECRET)
                        .setParameter("sitename", "usAldo")
                        .buildQueryMessage();
        return getAccessToken(request_User);
    }

    private static String getAccessToken(OAuthClientRequest request_User) throws OAuthSystemException, OAuthProblemException {
        return getOAuthClient().accessToken(request_User, OAuthJSONAccessTokenResponse.class)
                .getAccessToken();
    }

}
