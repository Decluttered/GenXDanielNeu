package Hauptklassen;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "aviso")
@XmlType(propOrder = { "version", "originfile", "shipments" })
public class aviso {

	private String version;
	private origin_file originfile;
	private shipments shipments;
	
	public aviso(){}
	
	public aviso(String version)
	{
		this.version = version;
	}

	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public origin_file getOriginfile() {
		return originfile;
	}

	@XmlElement(name = "origin_file")
	public void setOriginfile(origin_file originfile) {
		this.originfile = originfile;
	}

	public shipments getShipments() {
		return shipments;
	}

	@XmlElement(name = "shipments")
	public void setShipments(shipments shipments) {
		this.shipments = shipments;
	}
	
	
	
}



