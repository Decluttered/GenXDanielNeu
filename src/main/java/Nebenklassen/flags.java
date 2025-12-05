package Nebenklassen;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"f","f2","f3"})
public class flags {

	flag f;
	flag f2;
	flag f3;

	public flag getF() {
		return f;
	}
	@XmlElement(name = "flag")
	public void setF(flag f) {
		this.f = f;
	}
	public flag getF2() {
		return f2;
	}
	@XmlElement(name = "flag")
	public void setF2(flag f2) {
		this.f2 = f2;
	}
	public flag getF3() {
		return f3;
	}
	@XmlElement(name = "flag")
	public void setF3(flag f3) {
		this.f3 = f3;
	}
}
