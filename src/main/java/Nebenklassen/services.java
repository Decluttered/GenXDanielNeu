package Nebenklassen;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "services")
public class services {

	
	service service;
	timeservice timeservice;
	String Service;

//	public service getS() {
//		return s;
//	}
//
//	@XmlElement(name = "service")
//	public void setS(service s) {
//		this.s = s;
//	}
	public timeservice getTimeservice() {
		return timeservice;
	}

	@XmlElement(name = "timeservice")
	public void setTimeservice(timeservice timeservice) {
		this.timeservice = timeservice;
	}
	
	public String getService() {
		return Service;
	}

	public void setService(String Service) {
		this.Service = Service;
	}

	
}
