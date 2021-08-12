package facebookloginfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FB_004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/vikaskumar/Documents/Seleniumjar's/drivers/chromedriver");
		WebDriver bo = new ChromeDriver();
		
		bo.get("https://www.facebook.com/");
		bo.manage().deleteAllCookies();
		bo.findElement(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		bo.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("123456bjh-=");
		bo.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("697698jhjdgq;/'");
		bo.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		
		
	}

}
