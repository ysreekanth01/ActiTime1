package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RashPotty {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_5_E0")).click();
		Thread.sleep(2000);
		/*int x=driver.findElement(By.id("u_h_4_lx")).getLocation().getY();
		int y=driver.findElement(By.id("u_h_5_w+")).getLocation().getY();
		int z=driver.findElement(By.id("u_h_6_F/")).getLocation().getY();
		if(x==y && x==z) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}*/
		driver.close();
	}

}
