package Nebenklassen;

import javax.xml.bind.annotation.XmlElement;

public class package_types {

	package_type packagetype;

	public package_type getPackagetype() {
		return packagetype;
	}
	@XmlElement(name = "package_type")
	public void setPackagetype(package_type packagetype) {
		this.packagetype = packagetype;
	}
	
	
}
