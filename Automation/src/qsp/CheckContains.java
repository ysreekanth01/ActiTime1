package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckContains {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com/");
	String url=driver.getCurrentUrl();
	if(url.contains("google"))
	{
		System.out.println("navigated to google successfully");
	}
	else
	{
		System.out.println("not navigated to google, failed");
	}
	driver.close();
	}
}
