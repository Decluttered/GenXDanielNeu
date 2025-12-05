package Nebenklassen;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "references")
public class references {

	reference reference;

	public reference getReference() {
		return reference;
	}

	@XmlElement(name = "reference")
	public void setReference(reference reference) {
		this.reference = reference;
	}
	
	
}
