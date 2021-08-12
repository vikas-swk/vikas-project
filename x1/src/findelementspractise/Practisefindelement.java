package findelementspractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practisefindelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/vikaskumar/Documents/Seleniumjar's/Drivers/chromedriver");
		WebDriver br = new ChromeDriver();
		
		br.get("https://www.redbus.in");
		List<WebElement> nol = br.findElements(By.tagName("a"));
		System.out.println(nol.size());
		
		

	}

}
