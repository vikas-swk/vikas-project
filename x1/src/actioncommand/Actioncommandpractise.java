package actioncommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actioncommandpractise {

	public static void main(String[] args) throws InterruptedException {
		

        System.setProperty("webdriver.chrome.driver", "/Users/vikaskumar/Documents/Seleniumjar's/drivers/chromedriver");
		
	
		WebDriver bo = new ChromeDriver();
		
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.manage().deleteAllCookies();
		
		Actions act = new Actions(bo);
		
		bo.findElement(By.xpath("//body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		bo.findElement(By.xpath("//body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/input[1]")).click();
		
		act.moveToElement(bo.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/a[1]/span[1]"))).perform();
		
		act.moveToElement(bo.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[6]/a[1]/span[1]"))).perform();
	
		act.moveToElement(bo.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[6]/ul[1]/li[1]/a[1]/span[1]"))).perform();
		
		Thread.sleep(3000);
		bo.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[6]/ul[1]/li[1]/a[1]/span[1]")).click();
		
		
		
	}

}
