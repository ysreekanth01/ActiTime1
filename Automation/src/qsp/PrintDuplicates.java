package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ysree/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		
		HashSet<String> hs=new HashSet<String>();
		Select s=new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count=allOptions.size();
		for(int i=0;i<count;i++)
		{
			String text=allOptions.get(i).getText();
			if(hs.add(text)==false);
			{
			System.out.println(text);
			Thread.sleep(5000);
			}
		driver.close();
		
		
	}
}
}