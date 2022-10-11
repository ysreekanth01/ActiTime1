package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAlignment {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@role='button' and @rel='async']")).click();
		Thread.sleep(2000);
		
	int x=driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).getLocation().getY();
	int y=driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).getLocation().getY();
	int z=driver.findElement(By.xpath("//input[@type='radio' and @value='-1']")).getLocation().getY();
		
if(x==y&&y==z)
{
	System.out.println("In alligned");
}
else
{
	System.out.println("Not alligned");
}
driver.close();
}
}
