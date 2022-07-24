package seleniumProgram;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElement {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		//driver = new HtmlUnitDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

	public static void getLabelsText() {
		
		
		List<WebElement> labels = driver.findElements(By.tagName("label"));
		
		System.out.println(labels.size());
		
		//We can handle list of element using iterator
		Iterator<WebElement> itr = labels.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next().getText());

		}
		 
		//We handle particular element of list
		System.out.println(labels.get(1).getText());
	}
	
	public static void handleLinks() {
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("password")).click();
		
		System.out.println(driver.getTitle());
	}
	
	public static void main(String[] args) {
		launchBrowser();
		handleLinks();
		
	}
}
