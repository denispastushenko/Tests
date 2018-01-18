import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebScrap_ {

    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("https://www.instagram.com/kimkardashian/?hl=en").userAgent("Mozilla/5.0").get();
            Elements elements = document.select("src");

            int i = 1;
            for (Element info: elements){
                System.out.println(i + "  " + info.text() + " ;");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
