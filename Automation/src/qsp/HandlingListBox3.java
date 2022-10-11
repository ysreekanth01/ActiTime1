package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@role='button' and @rel='async']")).click();
		Thread.sleep(3000);
		WebElement day1 = driver.findElement(By.id("day"));
		Select s1=new Select(day1);
		s1.selectByValue("15");
		
		WebElement month1 = driver.findElement(By.id("month"));
		Select s2=new Select(month1);
		s2.selectByValue("7");
		
		WebElement year1 = driver.findElement(By.id("year"));
		Select s3=new Select(year1+++);
		s3.selectByValue("1947");
}
}
