import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Listfieldpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/vikaskumar/Documents/Seleniumjar's/drivers/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver bo = new ChromeDriver(options);
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
	
		
	Select obj = new Select(bo.findElement(By.xpath("//body[1]/form[1]/div[3]/div[1]/select[1]")));
	//obj.selectByIndex(3);
	//obj.selectByValue("C++");
	obj.selectByVisibleText("C++");
	
	
	}

}
