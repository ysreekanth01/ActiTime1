//Write a script to print the tagname of forgot your password link present in actitime.
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTag {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String tagname = driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getTagName();
		System.out.println(tagname);
	}
}
 