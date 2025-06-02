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
		//To find number of links present in page footer
		WebElement driver2 = driver.findElement(By.cssSelector(".navFooterVerticalColumn"));
		System.out.println(driver2.findElements(By.tagName("a")).size());
		
		//To find no.of links present in one column
		WebElement driver3 = driver.findElement(By.xpath("//div[@class=\"navFooterLinkCol navAccessibility\"][1]"));
		System.out.println(driver3.findElements(By.tagName("a")).size());

	}

}
