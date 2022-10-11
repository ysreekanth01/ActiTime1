package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTab3 {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	String parent = driver.getWindowHandle();
	Set<String> allWh = driver.getWindowHandles();
	 
	Iterator<String> itr=allWh.iterator();
	while(itr.hasNext())
	{
		String s = itr.next();
		if(!(s.equals(parent)))
		{
			driver.close();
		}
	}
	Thread.sleep(3000);
	driver.switchTo().window(parent);
	driver.close();
	
		
	}
	
	

}
