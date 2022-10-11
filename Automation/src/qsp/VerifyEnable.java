package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEnable {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		if(logo==true)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
		

	}

}
