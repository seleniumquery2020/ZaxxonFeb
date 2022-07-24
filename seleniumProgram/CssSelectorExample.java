package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		
	}

	public static void cssExample() {

		driver.findElement(By.cssSelector("#email")).sendKeys("qwerty"); // id value with #

		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("Password@123");
		// tagName[attribute = 'value'] or [attribute = 'value']

		System.out.println(driver.findElement(By.cssSelector("div[class='_8esl'] h2")).getText());
		// ParenttagName[attribute = 'value'] childTagName or [attribute = 'value'] childTagName
		
		// driver.findElement(By.cssSelector("._8esh")).click(); 
		//class value with . dot
		
		WebElement element = driver.findElement(By.cssSelector("._8esh"));
		
		String href = element.getAttribute("href");
		System.out.println("Create a new page element href = "+href);
		
		System.out.println("Font-Family = "+element.getCssValue("font-family"));
		
		System.out.println("TagName = "+element.getTagName());
		
		System.out.println("Present or not = "+element.isDisplayed());
		
		
	}

	public static void main(String arg[]) {
		launchBrowser();
		cssExample();
		driver.close();
	}

}
