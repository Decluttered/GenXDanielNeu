package Nebenklassen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name = "package")
@XmlType(propOrder = { "type", "weight", "barcodes"})
//@XmlAccessorOrder(AccessorOrder.ALPHABETICAL)

public class Package {

	String type;
	String weight;
	barcodes barcodes;
	
	public Package(){}
	
	public Package(String type, String weight) {
		super();
		this.type = type;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public barcodes getBarcodes() {
		return barcodes;
	}

	@XmlElement(name = "barcodes")
	public void setBarcodes(barcodes barcodes) {
		this.barcodes = barcodes;
	}


	
	
}
