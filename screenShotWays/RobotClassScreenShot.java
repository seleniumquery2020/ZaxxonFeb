package screenShotWays;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassScreenShot {


		
		static ChromeDriver driver;

		public static void launchBrowser() {

			System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
	        //ChromeDriver driver = new ChromeDriver();
		}

		
		public static void takeScreenshotPage() throws AWTException, IOException{
			
			Robot robot = new Robot();
			BufferedImage buffImage =  robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			
			File destFile = new File("C:\\CountersignTechnology\\CoreJavaProgram\\Screenshots\\RobotClassScreenShot.png");

			ImageIO.write(buffImage, "png", destFile);
			
		}
		
		public static void main(String[] args) throws AWTException, IOException {
			
			launchBrowser();
			takeScreenshotPage();
	}

}
