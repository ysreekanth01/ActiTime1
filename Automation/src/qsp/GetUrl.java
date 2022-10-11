package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Wipro Jobs" + Keys.ENTER);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for( WebElement lk:links)
		{
		String url = lk.getAttribute("href");
		System.out.println(url);
		}

	
		

	}

}
