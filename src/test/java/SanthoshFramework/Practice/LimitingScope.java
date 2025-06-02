package SanthoshFramework.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LimitingScope {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement driver2 = driver.findElement(By.cssSelector(".navFooterVerticalColumn"));
		System.out.println(driver2.findElements(By.tagName("a")).size());
		
		
		

	}

}
