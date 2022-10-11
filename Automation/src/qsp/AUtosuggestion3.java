package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUtosuggestion3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		int count = allSugg.size();
		/*
		for(int i=0;i<count;i++)
		{
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		*/
		for(WebElement i:allSugg)
		{
			System.out.println(i.getText());
		}
		allSugg.get(count-1).click();
		

	}

}
