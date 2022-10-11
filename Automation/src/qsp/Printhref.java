//Write a script to print the value of the href attribute for forget your password link present in actitime.
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printhref {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String hrefname = driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getAttribute("href");
		System.out.println(hrefname);	
	}
}
