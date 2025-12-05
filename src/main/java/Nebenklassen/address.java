package Nebenklassen;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name = "address")
@XmlType(propOrder = { "type", "name1", "name2","street","number","country","code","city","services"})
public class address {

	
	String type;
	String name1;
	String name2;
	String street;
	String number;
	String country;
	String code;
	String city;
	
	services services;
	
	public address(){}
	
	public address(String type, String name1, String name2, String street, String number, String country, String code,
			String city) {
		super();
		this.type = type;
		this.name1 = name1;
		this.name2 = name2;
		this.street = street;
		this.number = number;
		this.country = country;
		this.code = code;
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public services getServices() {
		return services;
	}

	@XmlElement(name = "services")
	public void setServices(services services) {
		this.services = services;
	}
	
	
}
