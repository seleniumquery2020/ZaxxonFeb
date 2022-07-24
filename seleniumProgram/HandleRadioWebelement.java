package seleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioWebelement {
	
	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

	}

	
	public static void clickOnRadioBtn(){
		
		List<WebElement>  radioBtns = driver.findElements(By.xpath("//input[@name='lang'][@type='radio']"));
		
		for(WebElement radioBtn : radioBtns) {
			if(radioBtn.getAttribute("id").equalsIgnoreCase("python")) {
				radioBtn.click();
			}
		}
		
		for(WebElement radioBtn : radioBtns) {
			
			System.out.println(radioBtn.getAttribute("id")+" Radio button is selected : "+radioBtn.isSelected());
			
		}
	}
	
	
	public static void handleCheckBox() {
		
		List<WebElement> checkboxs = driver.findElements(By.cssSelector("[type='checkbox']"));
		
		for(WebElement checkbox : checkboxs) {
			checkbox.click();
			System.out.println("Checkbox is selected : "+checkbox.isSelected());
		}
	}
	public static void main(String[] args) {
		
		launchBrowser();
		handleCheckBox();
	}

}
