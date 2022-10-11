package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHtWt {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailTbx=driver.findElement(By.id("email"));
		int ht= emailTbx.getSize().getHeight();
		int wt = emailTbx.getSize().getWidth();
		System.out.println("The height is "+ht);
		System.out.println("The width is "+wt);
		
		

	}

}
