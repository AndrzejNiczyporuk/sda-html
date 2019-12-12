import htmlflow.HtmlView;
import htmlflow.StaticHtml;

import java.io.*;
import java.net.URI;

public class html_flow {
	
	
	public static void main(String[] args) throws IOException {
		
		String html = StaticHtml
				.view()
				.html()
				.head()
				.title().text("HtmlFlow").__()
				.__() //head
				.body()
				.div().attrClass("container")
				.h1().text("My first page with HtmlFlow").__()
				.img().attrSrc("https://avatars1.githubusercontent.com/u/35267172").__()
				.p().text("Typesafe is awesome! :-)").__()
				.__()
				.__() //body
				.__() //html
				.render();
		BufferedWriter bw = new BufferedWriter(new FileWriter("flow_index.html"));
		bw.write(html);
		bw.close();
	}
}
