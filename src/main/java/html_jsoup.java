import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Arrays;

public class html_jsoup
{
	public static void main(String[] args) throws IOException {
		/*Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Main_Page").get();
		System.out.println(doc.title());
		Elements newsHeadlines = doc.select("#mp-itn b a");
		for (Element headline : newsHeadlines) {
			System.out.println(headline.attr("title")+"\n\t"+ headline.absUrl("href"));
		}*/
		
		
		Document docPP = Jsoup.connect("https://emonitoring.poczta-polska.pl/?numer=testp0").get();
		System.out.println(docPP.title());
		Elements events  = docPP.select("a[href]");
		Elements events2  = docPP.select("#zdarzenia_black");
		for (Element event : events) {
			//System.out.println(event.attr("zdarzenia_black"));
			System.out.println(event.absUrl("href"));
		}
		
	}
}
