package Nebenklassen;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "un_number", "packing_group", "adr_amount", "density","pls","fl","ai","pt"})
public class dangerousgood {

	
	String un_number;
	String packing_group;
	String adr_amount;
	String density;
	placards pls;
	flags fl;
	additionalinfos ai;
	package_types pt;
	
	public dangerousgood(String un_number, String packing_group, String adr_amount, String density) {
		super();
		this.un_number = un_number;
		this.packing_group = packing_group;
		this.adr_amount = adr_amount;
		this.density = density;
	}
	
	public String getUn_number() {
		return un_number;
	}
	public void setUn_number(String un_number) {
		this.un_number = un_number;
	}
	public String getPacking_group() {
		return packing_group;
	}
	public void setPacking_group(String packing_group) {
		this.packing_group = packing_group;
	}
	public String getAdr_amount() {
		return adr_amount;
	}
	public void setAdr_amount(String adr_amount) {
		this.adr_amount = adr_amount;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}

	public placards getPls() {
		return pls;
	}
	@XmlElement(name = "placards")
	public void setPls(placards pls) {
		this.pls = pls;
	}

	public flags getFl() {
		return fl;
	}
	@XmlElement(name = "flags")
	public void setFl(flags fl) {
		this.fl = fl;
	}

	public additionalinfos getAi() {
		return ai;
	}
	@XmlElement(name = "additionalinfos")
	public void setAi(additionalinfos ai) {
		this.ai = ai;
	}

	public package_types getPt() {
		return pt;
	}
	@XmlElement(name = "package_types")
	public void setPt(package_types pt) {
		this.pt = pt;
	}
	
	
}
