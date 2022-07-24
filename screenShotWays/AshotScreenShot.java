package screenShotWays;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AshotScreenShot {

	static ChromeDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		// ChromeDriver driver = new ChromeDriver();
	}

	public static void takeScreenshotPage() throws IOException {
		
		AShot shot  = new AShot();
				
		Screenshot screenShot =  shot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		File destFile = new File("C:\\CountersignTechnology\\CoreJavaProgram\\Screenshots\\AshotClassScreenShot.png");
		
		ImageIO.write(screenShot.getImage(), "png", destFile);

	}

	public static void main(String[] args) throws AWTException, IOException {

		launchBrowser();
		takeScreenshotPage();
	}

}
