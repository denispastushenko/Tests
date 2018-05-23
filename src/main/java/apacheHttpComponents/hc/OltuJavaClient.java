package apacheHttpComponents.hc;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Form;
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
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Random;

import static org.apache.http.client.fluent.Form.*;

public class OltuJavaClient {

    private static final String TOKEN_REQUEST_URL = "https://perf-hyb.aldoshoes.com/authorizationserver/oauth/token";

    private static final String CLIENT_ID = "client_composer";

    private static final String CLIENT_SECRET = "yng4bUAD";

    private static final String USER_NAME = "ssatest@gmail.com";

    private static final String PASS = "Test123";

    private static String generateEmail(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return RandomStringUtils.random(10, characters) + "@gmail.com";
    }


    public static void main(String[] args) throws IOException {

          HttpResponse response_POST = Request.Post("https://perf-hyb.aldoshoes.com/aldowebservices/vcomp/usAldo/users?isEmailSignedUp=false")
                .addHeader("Authorization", server_token)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .bodyForm(form().add("login", "ssatest@gmail.com")
                        .add("password", "Test123")
                        .add("firstName", "Diego").add("lastName", "Aristizabal")
                        .add("titleCode", "mr").add("isEmailSignedUp", "true").build())
                .execute().returnResponse();

        System.out.println(response_POST.getStatusLine().getStatusCode());
        System.out.println(response_POST);
        Assert.assertEquals(response_POST.getStatusLine().getStatusCode(), 200);



      /*  HttpResponse response_PUT =  Request.Put("https://perf-hyb.aldoshoes.com/aldowebservices/v2/usAldo/users/ssatest@gmail.com/login")
                .addHeader("Authorization", "Bearer " + user_token)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .bodyForm(form().add("newLogin", "ssatest@gmail.com")
                        .add("password", "Test123").build())
                .execute().returnResponse();

        System.out.println(response_PUT.getStatusLine().getStatusCode());
        System.out.println(response_PUT);
        Assert.assertEquals(response_PUT.getStatusLine().getStatusCode(), 200);

        HttpResponse response_Get = (Request.Get("https://perf-hyb.aldoshoes.com/aldowebservices/v2/usAldo/users/ssatest@gmail.com")
                .execute().returnResponse());

        System.out.println(response_Get.getStatusLine().getStatusCode());
        System.out.println(response_Get);
        Assert.assertEquals(response_Get.getStatusLine().getStatusCode(), 200);*/



*/
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
        System.out.println("Server Token: " + getAccessToken(request_Server));

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
        System.out.println("User Token: " + getAccessToken(request_User));
        return getAccessToken(request_User);
    }

    private static String getAccessToken(OAuthClientRequest request_User) throws OAuthSystemException, OAuthProblemException {
        return getOAuthClient().accessToken(request_User, OAuthJSONAccessTokenResponse.class)
                .getAccessToken();
    }

}
