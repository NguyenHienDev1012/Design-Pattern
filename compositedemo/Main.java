package compositedemo;

public class Main {
	public static void main(String[] args) {
		HtmlTag pTag=new HtmlParent("Html");
		pTag.setStartTag("Html");
		pTag.setEndTag("Html");
		
		HtmlTag p1=new HtmlParent("body");
	    p1.setStartTag("body");
	    p1.setEndTag("body");
	    pTag.addChildTag(p1);
	    
	    HtmlTag child=new HtmlElement("p");
	    child.setStartTag("p");
	    child.setEndTag("p");
	    child.setTagBody("Test");
	    p1.addChildTag(child);
	    
		pTag.generateHtml();
	}
	

}
