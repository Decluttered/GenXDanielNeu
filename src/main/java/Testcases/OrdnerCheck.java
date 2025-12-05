package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrdnerCheck {

    public static WebDriver driver = new ChromeDriver();
	public static Actions action = new Actions(driver);

    public static void main(String[] args)
    {

    }

    public static void Test()
	{
		org.junit.Assert.assertEquals("Hallo", type());
	}
	
	public static String type()
	{
		return "Hallo";
	}
}
