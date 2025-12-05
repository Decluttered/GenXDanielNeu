package Hauptklassen;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "origin_file")
@XmlType(propOrder = { "name", "date", "type"})
public class origin_file {

	
	String name;
	String date;
	String type;
	
	public origin_file() {}
	
	public origin_file(String name, String date, String type) {
		super();
		this.name = name;
		this.date = date;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
