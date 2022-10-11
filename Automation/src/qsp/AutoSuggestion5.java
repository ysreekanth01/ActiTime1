package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion5 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone 13 pro max "+Keys.ENTER);
	Thread.sleep(15000);
	List<WebElement> allProductName = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max ')]"));
	List<WebElement> allProductPrices = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max ')]/../../div[2]/div[1]/div[1]/div"));
	int count=allProductName.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String product=allProductName.get(i).getText();
		String price=allProductPrices.get(i).getText(); 
		System.out.println(product + "--->" + price);
	}
	
driver.close();
	}

}
