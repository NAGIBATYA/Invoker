import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println(Jsoup.connect("https://obrazovaka.ru/sochinenie/geroy-nashego-vremeni/otnosheniya-pechorina-i-vernera.html").get()
                        .select("article > p").toString()
                        .replace("<p>", "")
                        .replace("</p>", "")
                        .replace("<p class=\"article-summary\">", "")
                        .replace("\n" + "\n", "")
                        .replace("\n", "\n" + "\n"));

//        Document doc = Jsoup.connect("https://obrazovaka.ru/sochinenie/geroy-nashego-vremeni/otnosheniya-pechorina-i-vernera.html").get();
//        Elements elements = doc.select("article > p");
//        String str = elements.toString();
//        str = str.replace("<p>", "");
//        str = str.replace("</p>", "");
//        str = str.replace("<p class=\"article-summary\">", "");
//        str = str.replace("\n" + "\n", "");
//        str = str.replace("\n", "\n" + "\n");
//        System.out.println(str);
        }
    }
    //3256
