package qsp; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopUp2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1=new Select(month);
		s1.selectByValue("1");
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2=new Select(year);
		s2.selectByValue("1947");
		driver.findElement(By.xpath("//a[text()='15']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[@class='submit-login']")).click();
		String text=driver.findElement(By.id("policynumberError")).getText();		
		if(text.equals("Please enter valid Policy No."))
		{
		System.out.println(text +"printed");
		}
		else
		{
			System.out.println("Not printed");
		}
}
}
