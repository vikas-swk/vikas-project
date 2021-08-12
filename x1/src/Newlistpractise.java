import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Newlistpractise {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver", "/Users/vikaskumar/Documents/Seleniumjar's/drivers/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
	
		WebDriver bo = new ChromeDriver(options);
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.manage().deleteAllCookies();
		
		bo.findElement(By.xpath("//body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		bo.findElement(By.xpath("//body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/input[1]")).click();
		
		// Clicking on change password
		bo.findElement(By.xpath("//body[1]/div[3]/ul[1]/li[2]/a[1]")).click(); 
		
		bo.switchTo().frame("rightMenu");
		bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/form[1]/div[1]/input[1]")).click();
		
		//Entering old and new Password
		bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/form[1]/input[4]")).sendKeys("lab1");
		bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/form[1]/input[5]")).sendKeys("lab2");
		bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/form[1]/input[6]")).sendKeys("lab2");
		
		//Clicking on BACK button
		bo.findElement(By.xpath("//body[1]/div[1]/div[1]/input[1]")).click();
		
		//Clicking on ADD button
		bo.findElement(By.xpath("//body[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).click();
		
		

	}

}
