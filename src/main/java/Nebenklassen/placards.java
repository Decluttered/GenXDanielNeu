package Nebenklassen;

import javax.xml.bind.annotation.XmlElement;

public class placards {

	placard p;
	
	public placards() {};

	public placard getP() {
		return p;
	}
	@XmlElement(name = "placard")
	public void setP(placard p) {
		this.p = p;
	}
	
	
}
