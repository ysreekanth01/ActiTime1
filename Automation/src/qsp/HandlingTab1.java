package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTab1 {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
	String parent = driver.getWindowHandle();
	Set<String> wh = driver.getWindowHandles();
	Iterator<String>itr=wh.iterator();
	while(itr.hasNext())
	{
		
		String s=itr.next();
		Thread.sleep(3000);
		
		if(!(s.equals(parent)))
		{
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(s);
	}
	driver.switchTo().window(parent);
	driver.close();
		
	}
}

}
