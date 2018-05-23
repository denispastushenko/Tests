package apacheHttpComponents.hc;

import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.Collections;

import static org.apache.http.client.fluent.Form.form;

public class HCTest {

    public static void main(String[] args) throws IOException {
        /*HttpResponse response = Request.Post("https://perf-hyb.aldoshoes.com/authorizationserver/oauth/token").addHeader("Content-Type", "application/x-www-form-urlencoded")
                       .bodyForm(form().add("grant_type", "client_credentials")
                           *//*    .add("username", "ssatest@gmail.com")
                               .add("password", "Test123")*//*
                               .add("client_id", "client_composer").add("clientsecret", "yng4bUAD")
                                    *//*   add("siteId", "usAldo")*//*.build()).execute().returnResponse();
         *//*Request.Get("https://perf-hyb.aldoshoes.com/aldowebservices/v2/usAldo/stores?query=montreal").execute()
                .returnContent().asString();*//*

        System.out.println(response);
        System.out.println("\n" + "Status: " + response.getStatusLine().getStatusCode() + "\n");
        Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);*/

    }
}
