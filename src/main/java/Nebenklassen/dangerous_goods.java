package Nebenklassen;

import javax.xml.bind.annotation.XmlElement;

public class dangerous_goods {
	
	
	dangerousgood dg1;
	dangerousgood dg2;
	dangerousgood dg3;
	
	public dangerous_goods() {};

	public dangerousgood getDg1() {
		return dg1;
	}
	@XmlElement(name = "dangerousgood")
	public void setDg1(dangerousgood dg1) {
		this.dg1 = dg1;
	}

	public dangerousgood getDg2() {
		return dg2;
	}
	
	@XmlElement(name = "dangerousgood")
	public void setDg2(dangerousgood dg2) {
		this.dg2 = dg2;
	}

	public dangerousgood getDg3() {
		return dg3;
	}
	
	@XmlElement(name = "dangerousgood")
	public void setDg3(dangerousgood dg3) {
		this.dg3 = dg3;
	}
	
	
	
	

}
