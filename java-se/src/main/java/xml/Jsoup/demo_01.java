package xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class demo_01 {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        File file = new File("src/XML/user.xml");
        Document document = Jsoup.parse(file, "utf-8");
        Elements elements = document.getElementsByTag("name");
        String name = elements.text();
        System.out.println(name);
    }
}
