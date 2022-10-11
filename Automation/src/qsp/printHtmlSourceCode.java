package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printHtmlSourceCode {

	
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String html=driver.getPageSource();
		System.out.println(html);
		driver.close();
		
		
		}
	}

