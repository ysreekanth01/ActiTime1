package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchOptions {static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the option");
	String option=sc.nextLine();

	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ysree/Desktop/hotel.html");
	WebElement mtrListBox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListBox);
	List<WebElement> allOptions = s.getOptions();
	int count=allOptions.size();
	int counter=0;
	for(int i=0;i<count;i++)
	{
		String text=allOptions.get(i).getText();
		if(option.equals(text))
		{
			counter++;
		}
	}
	if(counter==0)
	{
		System.out.println(option+ " is not present");
	}
	else if(counter==1)
	{
		System.out.println(option+ " is not duplicated ");
	}
	else if(counter>1)
	{
		System.out.println(option+ " is duplicated");
	}
	driver.close();
}
}
