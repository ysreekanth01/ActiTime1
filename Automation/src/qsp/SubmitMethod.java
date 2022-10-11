//Write a script to click on the submit button present in opensourcebilling website without using click method.6 
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/");
		driver.findElement(By.xpath(" //button[text()='Submit']")).submit();
		
		

	}

}
