package compositedemo;

import java.util.ArrayList;

public class HtmlParent  extends HtmlTag{

	private String tagName;
	private String startTag;
	private String endTag;
	ArrayList<HtmlTag> list;
	public HtmlParent(String tagName){
		this.tagName=tagName;
		this.list=new ArrayList<HtmlTag>();
		
	}
	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag=tag;
	}

	@Override
	public void setEndTag(String tag) {
		this.endTag=tag;
	}
    @Override
	 public void addChildTag(HtmlTag htmltag) {
    	list.add(htmltag);
    };
    @Override
     public void removeChildTag(HtmlTag htmlTag) {
    	list.remove(htmlTag);
    };
	@Override
	public java.util.List<HtmlTag> getChldren() {
		return list;
	};
	@Override
	
	public void generateHtml() {
		System.out.println(startTag);
		for(HtmlTag x: list){
			x.generateHtml();
		}
		System.out.println(endTag);
		
		
	}

}
