package Nebenklassen;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"type","text"})
public class info {

	String type;
	String text;
	
	public info(String type, String text) {
		super();
		this.type = type;
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public String getText() {
		return text;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
