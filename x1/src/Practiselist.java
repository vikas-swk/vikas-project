import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practiselist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/vikaskumar/Documents/Seleniumjar's/Drivers/chromedriver");
		WebDriver br = new ChromeDriver();
		
		br.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
Select obj = new Select(br.findElement(By.id("selenium_suite")));
		//obj.selectByVisibleText("Selenium IDE");
		//obj.selectByVisibleText("Selenium WebDriver");
		obj.selectByIndex(0);
		obj.selectByIndex(2);
		obj.selectByIndex(3);
		
		Thread.sleep(3000);
		obj.deselectByIndex(0);
		
		
		
		
		
	}

}
