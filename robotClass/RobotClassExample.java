package robotClass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.eclipse.jetty.io.ByteBufferPool.Bucket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassExample {
	
	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		launchBrowser();

		//driver.findElement(By.tagName("body")).click();
		Thread.sleep(5000);
		Robot rob = new Robot();
	    //rob.mousePress(KeyEvent.BUTTON3_DOWN_MASK);
		//rob.mouseRelease(KeyEvent.BUTTON3_DOWN_MASK);
		
		//Rectangle rect =  new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		
		BufferedImage src =  rob.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		
		File dest = new File("C:\\CountersignTechnology\\CoreJavaProgram\\Screenshots\\robotClassScreenshot.png");
	
		
		ImageIO.write(src, "png", dest);
		
		rob.mouseWheel(5000);
	}

}