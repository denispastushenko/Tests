package apacheHttpComponents;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import static org.apache.http.protocol.HTTP.USER_AGENT;

public class MainClassExecutor {
    public static void main(String[] args) {
        String urlForGetRequest = "https://www.instagram.com/valeria_bila/";

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(urlForGetRequest);


        httpGet.addHeader("User-agent", USER_AGENT);
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
            System.out.println("Response-Code:   "  + httpResponse.getStatusLine().getStatusCode());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = bufferedReader.readLine()) != null)
            {
                result.append(line);
            }

            System.out.println(result);
        } catch (IOException e) {e.printStackTrace();
        }

    }


    public static Path downloadVideo(String sourceURL, String targetDirectory)
    {
        URL url = null;
        try {
            url = new URL(sourceURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        String fileName = sourceURL.substring(sourceURL.lastIndexOf('/') + 1, sourceURL.length());
        Path targetPath = new File(targetDirectory + File.separator + fileName).toPath();
        try {
            if (url != null) {
                Files.copy(url.openStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return targetPath;
    }

}
