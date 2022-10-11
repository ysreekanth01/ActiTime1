/*Automate the following scenarios
Step1:Open the browser
Step2:Go to google.com
Step3:Type java in the search test box
Step4:Capture all the auto suggestions, print the count of auto suggestions, printthe text of auto suggestions.
Step5:Select the first auto suggestions.
*/
package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		 int count = allSugg.size();
		 System.out.println(count);
		/* for(int i=0;i<count;i++)
		 {
			 System.out.println(allSugg.get(i).getText()); 
		 }
		 */
		 for(WebElement i: allSugg)
		 {
			 System.out.println(i.getText());
		 }
		
		driver.close();
		}
}
