package seleniumProgram;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExample {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	}

	public static void applyWait() throws InterruptedException {

		driver.findElement(By.tagName("button")).click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS);

		wait.pollingEvery(300, TimeUnit.MILLISECONDS);

		wait.withMessage("Text is not visible in 10 seconds");

		WebElement ele1 = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				WebElement ele = t.findElement(By.cssSelector("#demo"));
				System.out.println(ele.getText());
				if (ele.getText().equals("WebDriver"))
					return ele;
				else
					return null;
			}
		});

		System.out.println("Final result = :"+ele1.getText());

	}

	public static void main(String[] args) throws InterruptedException {

		launchBrowser();
		applyWait();
		driver.close();
	}
}
