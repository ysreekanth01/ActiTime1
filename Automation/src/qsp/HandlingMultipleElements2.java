package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements2 {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ysree/Desktop/Demo2.html");
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		int count = allLink.size();
		System.out.println(count);
		WebElement link = allLink.get(0);
		String text=link.getText();
		System.out.println(text);


	}

}
