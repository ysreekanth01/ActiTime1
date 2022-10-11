package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionNaukri {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter your active Email ID / Username']")).sendKeys("asathishkumarece2016@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9842842719");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("attachCV")).sendKeys("D:\\Shruthi Madam\\Automation\\Data\\S1.docx");
}
}
