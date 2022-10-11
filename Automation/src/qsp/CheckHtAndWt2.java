package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHtAndWt2 {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement x1=driver.findElement(By.id("username"));
		int h1= x1.getSize().getHeight();
		int w1=x1.getSize().getWidth();
		
		WebElement x2=driver.findElement(By.name("pwd"));
		int h2= x2.getSize().getHeight();
		int w2=x2.getSize().getWidth();
		
		if(h1==h2&&w1==w2)
		{
			System.out.println("height and width equal");
		}
		else
		{
			System.out.println("height and width not equal");
		}
		driver.close();

	}

}
