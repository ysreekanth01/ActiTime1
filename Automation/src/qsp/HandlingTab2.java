package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTab2 {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.linkText("About your actiTIME")).click();
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> allWh = driver.getWindowHandles();
		
		for(String ss:allWh)
		{
			driver.switchTo().window(ss);
			List<WebElement> text = driver.findElements(By.xpath("//h2"));
			for(WebElement tt:text)
			{
				System.out.println(tt.getText());
			}
			
		}
		 driver.quit();
		
	}
}
