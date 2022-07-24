package seleniumProgram;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessDriver {

	public static void main(String[] args) {

		HtmlUnitDriver driver = new HtmlUnitDriver(); //This is headLess driver
		driver.get("https://www.dagdushethganpati.com/"); // Url hit
		System.out.println("Title of webPage : " + driver.getTitle());
		System.out.println("Current Url of webPage : " + driver.getCurrentUrl());
		driver.close(); // browser close

	}
}
