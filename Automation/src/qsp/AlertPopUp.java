package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//Alert a = driver.switchTo().alert();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//a.accept();
		
		//driver.close();
	}
}
