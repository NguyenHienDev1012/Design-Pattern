package compositedemo;

import java.util.List;

public class HtmlElement extends HtmlTag{
	private String tagName;
	private String startTag;
	private String endtag;
	private String tagBody;
	public HtmlElement(String tagName){
		this.tagName=tagName;
	}

	@Override
	public String getName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag=tag;
		
	}

	@Override
	public void setEndTag(String tag) {
		this.endtag=tag;
	}

	@Override
	public void setTagBody(String tagbody) {
		this.tagBody=tagbody;
	};

	@Override
	public void generateHtml() {
		System.out.println(startTag +""+tagBody+""+endtag);
		
	}

}
