package videoSaver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class VideoSaver {

    public static void main(String[] args) throws MalformedURLException {
        try {
            download("https://scontent-waw1-1.cdninstagram.com/t50.2886-16/17940938_1882947585281702_1613622344138358784_n.mp4",
                    "E:\\InstgramDownloadedSource");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Path download(String sourceURL, String targetDirectory) throws IOException
    {
        URL url = new URL(sourceURL);
        String fileName = sourceURL.substring(sourceURL.lastIndexOf('/') + 1, sourceURL.length());
        Path targetPath = new File(targetDirectory + File.separator + fileName).toPath();
        Files.copy(url.openStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);

        return targetPath;
    }
}
