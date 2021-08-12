package facebookloginfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_FB_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/vikaskumar/Documents/Seleniumjar's/drivers/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver bo = new ChromeDriver(options);
		
		bo.get("https://www.facebook.com/");
		bo.manage().deleteAllCookies();
		bo.findElement(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		bo.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("vikas_kumar_swk@yahoo.co.uk");
		bo.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Victorindiakilo4");
		bo.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		
		bo.findElement(By.className("//body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
	}

}
