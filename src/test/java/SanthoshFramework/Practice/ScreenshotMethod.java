package SanthoshFramework.Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotMethod {
	
	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("C://Users//Santhosh//eclipse-workspace//Practice//ss.png"));
		
		
		File src1 = driver.findElement(By.cssSelector(".lnXdpd")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C://Users//Santhosh//eclipse-workspace//Practice//ss1.png"));
		
		
		
	}
}