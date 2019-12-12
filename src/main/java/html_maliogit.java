import com.github.manliogit.javatags.element.Element;
import com.github.manliogit.javatags.element.Text;

import java.io.*;
import java.util.Arrays;

import static com.github.manliogit.javatags.lang.HtmlHelper.*;
import static java.util.Arrays.asList;

public class html_maliogit {
	
	public static void main(String[] args) throws IOException {
		
		//System.out.println(strona1.toString());
		/*String strona2 = strona1.replaceAll("<li>a</li>", "<li>b</li>");
		System.out.println(strona2);*/
		Element ul = ul();
		for (String component : asList("a", "b", "c")) {
			ul.add(li(text(component)));
		}
		
		String strona1 = html5(attr("lang -> pl"),
				head(
						meta(attr("http-equiv -> Content-Type", "content -> text/html; charset=UTF-8")),
						title("Witaj Andrzej"),
						link(attr("href -> xxx.css", "rel -> stylesheet"))
				),
				body(br(),
						br(),
						br(),
						p("Zawartość strony z Java"),
						ul)
		).render();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("index.html"));
		bw.write(strona1);
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("index.html"));
		String readedStrona1 = org.apache.commons.io.IOUtils.toString(br);
		br.close();
		
		Element aaa = (text(readedStrona1));
		Element stronaHtml = html5(aaa);
		
		
		
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("index2.html"));
		bw2.write(stronaHtml.toString().replaceAll("<!DOCTYPE html><html>",""));
		bw2.close();
		
	}

}
