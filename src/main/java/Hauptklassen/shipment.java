package Hauptklassen;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import Nebenklassen.*;

@XmlRootElement(name = "shipment")
@XmlType(propOrder = {"customer", "date", "palletcount","collicount","weight","type","references","addresses","packages"})
public class shipment {

	String customer;
	String date;
	String palletcount;
	String collicount;
	String weight;
	String type;
	references references;
	addresses addresses;
	packages packages;
	//dangerous_goods dangerousgoods;
	
	
	public shipment(){}
	
	public shipment(String customer, String date, String palletcount, String collicount, String weight, String type) {
		super();
		this.customer = customer;
		this.date = date;
		this.palletcount = palletcount;
		this.collicount = collicount;
		this.weight = weight;
		this.type = type;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPalletcount() {
		return palletcount;
	}

	public void setPalletcount(String palletcount) {
		this.palletcount = palletcount;
	}

	public String getCollicount() {
		return collicount;
	}

	public void setCollicount(String collicount) {
		this.collicount = collicount;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public references getReferences() {
		return references;
	}

	@XmlElement(name = "references")
	public void setReferences(references references) {
		this.references = references;
	}

	public addresses getAddresses() {
		return addresses;
	}

	@XmlElement(name = "addresses")
	public void setAddresses(addresses addresses) {
		this.addresses = addresses;
	}

	public packages getPackages() {
		return packages;
	}
	
	@XmlElement(name = "packages")
	public void setPackages(packages packages) {
		this.packages = packages;
	}

	/*public dangerous_goods getDangerousgoods() {
		return dangerousgoods;
	}
	@XmlElement(name = "dangerous_goods")
	public void setDangerousgoods(dangerous_goods dangerousgoods) {
		this.dangerousgoods = dangerousgoods;
	}*/
	
}
