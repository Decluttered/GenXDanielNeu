package Hauptklassen;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "shipments")
public class shipments {
	
	shipment shipment;
	
	public shipments() {}

	public shipment getShipment () {
		return shipment;
	}

	@XmlElement(name = "shipment")
	public void setShipment (shipment shipment) {
		this.shipment = shipment ;
	}

}
