package Nebenklassen;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "timeservice")
public class timeservice {

	String type;
	
	public timeservice(){}
	
	public timeservice(String type)
	{
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
