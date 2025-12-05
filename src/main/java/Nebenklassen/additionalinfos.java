package Nebenklassen;

import javax.xml.bind.annotation.XmlElement;

public class additionalinfos {

	info i;
	info i2;
	
	public additionalinfos() {};

	public info getI() {
		return i;
	}
	@XmlElement(name = "info")
	public void setI(info i) {
		this.i = i;
	}
	
	public info getI2() {
		return i2;
	}
	@XmlElement(name = "info")
	public void setI2(info i2) {
		this.i2 = i2;
	}
}
