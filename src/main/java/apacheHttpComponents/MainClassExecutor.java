package apacheHttpComponents;

import apacheHttpComponents.jsonfiles.Node;
import apacheHttpComponents.jsonfiles.ResultData;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.http.client.fluent.Request;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainClassExecutor {
    private static List<String> stringList = new ArrayList<>();
    public static final String FILE_WAY_FOR_VIDEO = "E:\\InstgramDownloadedSource\\videosOnly";
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        ResultData resultData = gson.fromJson(executeRequest("https://www.instagram.com/virusvideo/?__a=1")
                , ResultData.class);
        if (resultData != null) {
            resultData.getUser()
                    .getMedia()
                    .getNodes()
                    .stream()
                    .filter(Node::getIsVideo)
                    .map(Node::getCode).forEach(item -> {
                String string = executeRequest(
                        String.format("https://www.instagram.com/p/%s?__a=1", item));
                JsonObject jsonObject = gson.fromJson(string, JsonObject.class);
                String result = jsonObject
                        .get("graphql")
                        .getAsJsonObject()
                        .get("shortcode_media")
                        .getAsJsonObject()
                        .get("video_url")
                        .toString();
                stringList.add(result.replace("\"",""));
            });
        }
       new HashSet<>(stringList).
                forEach(video ->
                        downloadVideo(video, FILE_WAY_FOR_VIDEO));
        System.out.println(stringList);
        System.out.println(stringList.size());
    }

    private static String executeRequest(String url) {
        try {
            return Request.Get(url).execute().returnContent().asString();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    private static Path downloadVideo(String sourceURL, String targetDirectory) {
        URL url = null;
        try {
            url = new URL( sourceURL);
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
