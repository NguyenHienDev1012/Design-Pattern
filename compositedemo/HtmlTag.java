package compositedemo;

import java.util.List;

public abstract class HtmlTag {
	public abstract String getName();

	public abstract void setStartTag(String tag);

	public abstract void setEndTag(String tag);

	public void setTagBody(String tagbody) {
		throw new UnsupportedOperationException();
	}

	public void addChildTag(HtmlTag Htmltag) {
		throw new UnsupportedOperationException();
	};

	public void removeChildTag(HtmlTag htmlTag) {
		throw new UnsupportedOperationException();
	};

	public List<HtmlTag> getChldren() {
		throw new UnsupportedOperationException();
	};

	public abstract void generateHtml();

}
