package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathExample {
		

		static WebDriver driver;

		public static void launchBrowser() {

			System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/CountersignTechnology/WebDrivers/HtmlPage/LoginForm.html");

		}

		public static void sendLoginDetails() throws InterruptedException {

			String str = driver.findElement(By.xpath("/html/body/div/h2")).getText();
			System.out.println("Page title = " + str);

			
			  WebElement firstNameTxtField = driver.findElement(By.xpath("/html/body/form/input[@id='fname']"));
			  
			  firstNameTxtField.sendKeys("selenium");
			  
			  
			  
			  WebElement lastNameTxtField = driver.findElement(By.xpath("//label[@for='fname']/following-sibling::input[@name='lname']"));
			  lastNameTxtField.sendKeys("webdriver");
			  
			  System.out.println("First name label = "+driver.findElement(By.xpath("/html/body/form/label[1]")).getText());
			  System.out.println("Last name label = "+driver.findElement(By.xpath("/html/body/form/label[2]")).getText());

			  
			  
				//driver.findElement(By.className("submitclick")).click();
			 

		}

		public static void main(String[] args) throws InterruptedException {
			launchBrowser();
			sendLoginDetails();
		}



}
