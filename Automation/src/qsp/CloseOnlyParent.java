package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyParent {static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
	String parent = driver.getWindowHandle();
	Set<String> wh = driver.getWindowHandles();
	for(String ss:wh)
	{
		driver.switchTo().window(ss);
		if(parent.equals(ss))
		{
			driver.close();
		}
	}		
	
}
}

