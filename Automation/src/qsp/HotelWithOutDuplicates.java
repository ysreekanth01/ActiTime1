package qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelWithOutDuplicates {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ysree/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		HashSet<String> al=new HashSet<String>();
		int count=allOptions.size();
		for(int i=0;i<count;i++)
		{
			String text=allOptions.get(i).getText();
			al.add(text);
		}
		/*
		 for(WebElement wb:allOptions)
		 
		{
			al.add(wb.getText());
		}
		*/
		
		 for(String st:al)
		 
		{
			System.out.println(st);
		}
		
		driver.close();
	}
}
