package seleniumProgram;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdown {

	
	
	static WebDriver driver;
	
	
	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public static void clickOnCreateNewAccount() throws InterruptedException {
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		//Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.attributeContains(By.id("day"), "title", "Day"));
		
		
		WebElement dateDropdown = driver.findElement(By.id("day"));
		Select select = new Select(dateDropdown);	
		System.out.println("Dropdown is support to multiple selection = "+select.isMultiple());
		System.out.println("Default date value = "+select.getFirstSelectedOption().getText());		
		select.selectByVisibleText("1");
		System.out.println("Selected date value = "+select.getFirstSelectedOption().getText());	
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select select1 = new Select(monthDropdown);
		System.out.println("Default month value = "+select1.getFirstSelectedOption().getText());
		select1.selectByIndex(0);
		System.out.println("Selected month value = "+select1.getFirstSelectedOption().getText());	
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select select2 = new Select(yearDropdown);
		System.out.println("Default year value = "+select2.getFirstSelectedOption().getText());
		select2.selectByValue("2021");
		System.out.println("Selected year value = "+select2.getFirstSelectedOption().getText());	
		
		System.out.println("All options from Month");
		List<WebElement>  months =select1.getOptions();
		for(WebElement month : months) {
			System.out.print(month.getText()+" ");
		}
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser();
		clickOnCreateNewAccount();
	}
}
