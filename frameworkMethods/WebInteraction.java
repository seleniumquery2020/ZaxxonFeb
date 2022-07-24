package frameworkMethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebInteraction {

	static WebDriver driver = BaseClass.driver;

	public static WebElement findElement(String locatorType, String locatorValue) {

		WebElement ele = null;

		if (locatorType.equals("id"))
			ele = driver.findElement(By.id(locatorValue));
		else if (locatorType.equals("xpath"))
			ele = driver.findElement(By.xpath(locatorValue));
		else if (locatorType.equals("name"))
			ele = driver.findElement(By.name(locatorValue));

		return ele;
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void sendText(WebElement element, String text) {

		element.sendKeys(text);

	}

	public static String getCurrentSystemDate() {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		return simpleDateFormat.format(new Date());
	}

	public static Date getDateInDateClass(String source) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date date;
		try {
			date = simpleDateFormat.parse(source);
		} catch (ParseException e) {
			date = null;
		}
		return date;
	}

}
