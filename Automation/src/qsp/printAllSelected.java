package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAllSelected {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ysree/Desktop/hotel.html");
		WebElement cpListBox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListBox);
		List<WebElement> allOption = s.getAllSelectedOptions();
		int count= allOption.size();
		for(int i=0;i<count;i++)
		{
			String text=allOption.get(i).getText();
			System.out.println(text);
		}
}
}
