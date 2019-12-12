import com.webfirmframework.wffweb.tag.html.*;
import com.webfirmframework.wffweb.tag.html.attribute.global.ClassAttribute;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Div;
import com.webfirmframework.wffweb.tag.repository.TagRepository;

import java.io.*;

public class html_wffweb {
	public static void main(String[] args) throws IOException {
		Html html = new Html(null) {{
			new Head(this);
			new Body(this,
					new ClassAttribute("body-styles-cls"));
		}};
		
		Body body = TagRepository.findOneTagAssignableToTag(Body.class, html);
		body.appendChild(new Div(null));
		
		System.out.println(html.toHtmlString());
		//directly writes to file
		html.toOutputStream(new FileOutputStream("wff_index.html"), "UTF-8");

	
	}
}
