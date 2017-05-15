package apacheHttpComponents;

import apacheHttpComponents.jsonfiles.Node;
import apacheHttpComponents.jsonfiles.ResultData;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.http.HttpVersion;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import java.io.File;
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
    public static final String FILE_WAY_FOR_VIDEO = "C:\\Users\\denys.pastushenko\\Downloads\\InstgramDownloadedSource";
    public static void main(String[] args) throws IOException {
    /*    Gson gson = new Gson();
        ResultData resultData = gson.fromJson(executeGetRequest("https://www.instagram.com/virusvideo/?__a=1")
                , ResultData.class);
        if (resultData != null) {
            resultData.getUser()
                    .getMedia()
                    .getNodes()
                    .stream()
                    .filter(Node::getIsVideo)
                    .map(Node::getCode).forEach(item -> {
                String string = executeGetRequest(
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
        System.out.println(stringList.size());*/
        System.out.println(executePostRequest("https://www.instagram.com/virusvideo/"));
    }


    private static String executeGetRequest(String url) {
        try {
            return Request.Get(url).execute().returnContent().asString();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static String executePostRequest(String url) {
        try {
            return Request.Post(url)
                    .useExpectContinue()
                    .version(HttpVersion.HTTP_1_1)
                    .bodyForm(Form.form()
                            .add("ig_user",  "1513656504")
                            .add("media.after",  "AQDEehkRRGwFv5JKWVmkE_qgW9ayk2DN1s7X6pkr6ftO_43kJE92t7xZ9D8i6zeTTp7EtCRFbL2E77Kdtejc1i7gbBP_cCaESoWUwjH_5dB3Jg")
                            .build())
                    .execute()
                    .returnContent()
                    .asString();
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
