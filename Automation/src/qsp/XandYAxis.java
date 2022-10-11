package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XandYAxis {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement g1=driver.findElement(By.name("email"));
		int loc1=g1.getLocation().getX();
		int loc2=g1.getLocation().getY();
		System.out.println(loc1);
		System.out.println(loc2);
		driver.close();
		}
}
