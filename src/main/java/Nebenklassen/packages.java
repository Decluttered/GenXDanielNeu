package Nebenklassen;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "packages")
public class packages {

	Package package1;
	Package package2;
	Package package3;
	Package package4;
	Package package5;
	
	Package package6;
	Package package7;
	Package package8;
	Package package9;
	Package package10;

	public Package getPackage1() {
		return package1;
	}

	@XmlElement(name = "package")
	public void setPackage1(Package package1) {
		this.package1 = package1;
	}

	public Package getPackage2() {
		return package2;
	}

	@XmlElement(name = "package")
	public void setPackage2(Package package2) {
		this.package2 = package2;
	}

	public Package getPackage3() {
		return package3;
	}

	@XmlElement(name = "package")
	public void setPackage3(Package pa3) {
		this.package3 = package3;
	}

	public Package getPackage4() {
		return package4;
	}

	@XmlElement(name = "package")
	public void setPackage4(Package package4) {
		this.package4 = package4;
	}

	public Package getPackage5() {
		return package5;
	}

	@XmlElement(name = "package")
	public void setPackage5(Package package5) {
		this.package5 = package5;
	}

	public Package getPackage6() {
		return package6;
	}

	@XmlElement(name = "package")
	public void setPackage6(Package package6) {
		this.package6 = package6;
	}

	public Package getPackage7() {
		return package7;
	}

	@XmlElement(name = "package")
	public void setPackage7(Package package7) {
		this.package7 = package7;
	}

	public Package getPackage8() {
		return package8;
	}

	@XmlElement(name = "package")
	public void setPackage8(Package package8) {
		this.package8 = package8;
	}

	public Package getPackage9() {
		return package9;
	}

	@XmlElement(name = "package")
	public void setPackage9(Package package9) {
		this.package9 = package9;
	}

	public Package getPackage10() {
		return package10;
	}

	@XmlElement(name = "package")
	public void setPackage10(Package package10) {
		this.package10 = package10;
	}
	
	
}
