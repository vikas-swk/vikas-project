package x1practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikaskumar/Documents/Seleniumjar's/drivers/chromedriver");
		WebDriver bo = new ChromeDriver();
		
		bo.get("https://www.youtube.com/");
		bo.findElement(By.xpath("//body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[2]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("hum pagal ho jayenge");
		bo.findElement(By.xpath("//body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[2]/ytd-searchbox[1]/form[1]/button[1]/yt-icon[1]")).click();
		bo.findElement(By.xpath("//body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-search[1]/div[1]/ytd-two-column-search-results-renderer[1]/div[1]/ytd-section-list-renderer[1]/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-video-renderer[1]/div[1]/div[1]/div[1]/div[1]/h3[1]/a[1]/yt-formatted-string[1]")).click();
		bo.manage().window().maximize();
		bo.manage().deleteAllCookies();
		bo.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		bo.close();
		
	}

}
