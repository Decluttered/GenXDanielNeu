package Nebenklassen;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addresses")
public class addresses {

	
	address address;

	public address getAddress() {
		return address;
	}

	@XmlElement(name = "address")
	public void setAddress(address address) {
		this.address = address;
	}
	
	
	
}
