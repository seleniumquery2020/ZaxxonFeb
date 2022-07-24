package screenShotWays;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreentShotUsingInterface {
	
	static ChromeDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
        //ChromeDriver driver = new ChromeDriver();
	}

	
	public static void takeScreenshotPage(){
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		TakesScreenshot shot =  driver;
		
		File  srcFile = shot.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\CountersignTechnology\\CoreJavaProgram\\Screenshots\\TakeScreentShotUsingInterface.png");
	
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		launchBrowser();
		takeScreenshotPage();
	}

}
