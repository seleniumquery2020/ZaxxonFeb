package actionClassPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethods {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}

	public static void searchProduct() throws InterruptedException {
		Actions actions = new Actions(driver);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		WebElement fashionSection = driver.findElement(By.xpath("//div[text()='Fashion']"));
		 
		//actions.click(fashionSection).perform();
		//actions.contextClick(fashionSection).perform(); //rightClick Action
		
		//actions.moveToElement(driver.findElement(By.xpath("//span[text()='Gift Cards']"))).perform();
		
		//actions.moveToElement(driver.findElement(By.partialLinkText("Return Policy"))).perform();
		
		//actions.clickAndHold(driver.findElement(By.partialLinkText("Return Policy"))).perform();
		
		//actions.moveToElement(driver.findElement(By.partialLinkText("Terms Of Use"))).contextClick().perform();
		
		
		//actions.moveToElement(driver.findElement(By.xpath("//span[text()='Gift Cards']"))).
		//contextClick(driver.findElement(By.partialLinkText("Terms Of Use"))).perform();
		
		WebElement searchField = driver.findElement(By.name("q"));
		
		actions.sendKeys(searchField, "samsung").pause(3000).keyDown(searchField , Keys.SHIFT)
		.sendKeys(searchField, "mobile").keyUp(Keys.SHIFT).perform();
		
		actions.keyDown(fashionSection,Keys.CONTROL).sendKeys("a").perform();
		
		
	}

	public static void main(String[] args) throws InterruptedException {

		launchBrowser();
		searchProduct();

	}

}
