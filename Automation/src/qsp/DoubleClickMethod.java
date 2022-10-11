package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/customers/");
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		Thread.sleep(10000);
		JavascriptExecutor j=(JavascriptExecutor) driver;
	//int y=	driver.findElement(By.xpath("//a[text()='READ FULL STORY']")).getLocation().getY();
		int y=	driver.findElement(By.linkText("READ FULL STORY")).getLocation().getY();
	Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,100)");
		System.out.println(y);
		Thread.sleep(3000);
		//WebElement readArticle = driver.findElement(By.xpath("//a[text()='READ FULL STORY']"));
		Thread.sleep(3000);
		WebElement readArticle = driver.findElement(By.linkText("READ FULL STORY"));
		Thread.sleep(3000);
		a.doubleClick(readArticle).perform();
		Thread.sleep(3000);
		String title=driver.getTitle();
		if(title.contains("HackerEarth"))
		{System.out.println("pass");}
		else
			{System.out.println("fail");}
		driver.close();

	}

}
