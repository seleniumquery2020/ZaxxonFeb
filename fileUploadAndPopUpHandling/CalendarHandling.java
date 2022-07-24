package fileUploadAndPopUpHandling;

import java.util.Date;
import org.openqa.selenium.WebElement;

import frameworkMethods.BaseClass;
import frameworkMethods.WebInteraction;

public class CalendarHandling extends BaseClass {

	public static void selectDepartureDate(String bookingDate) {

		WebInteraction
				.clickOnElement(WebInteraction.findElement("xpath", "(//div[@class='sc-bkkeKt gAqCbJ fswFld '])[3]"));
		String currentdate = WebInteraction.getCurrentSystemDate();
		Date booking = WebInteraction.getDateInDateClass(bookingDate);
		Date current = WebInteraction.getDateInDateClass(currentdate);

		int bookingMonth = Integer.parseInt(bookingDate.split("/")[1]);
		int currentMonth = Integer.parseInt(currentdate.split("/")[1]);

		int diffInMonth = 0;

		if (bookingMonth > currentMonth)
			diffInMonth = bookingMonth - currentMonth;
		else
			diffInMonth = 12 - (currentMonth - bookingMonth);

		if (booking.after(current)) {
			for (int i = 0; i < diffInMonth; i++) {
				WebElement nextBtn = WebInteraction.findElement("xpath",
						"//span[@class='DayPicker-NavButton DayPicker-NavButton--next']");
				WebInteraction.clickOnElement(nextBtn);
			}
			String selectionDate = bookingDate.split("/")[0];
		    WebElement selectDate =	
		    		WebInteraction.findElement("xpath","//div[@class='DayPicker-Day'][contains(@aria-label,'"+selectionDate+"')]");
			WebInteraction.clickOnElement(selectDate);
			WebElement doneBtn = WebInteraction.findElement("xpath", "//span[@class='fswTrvl__done']");
			WebInteraction.clickOnElement(doneBtn);

		} else {
			System.err.println("Booking Date is Past date so not able to book any flight");
		}
	}

	public static void main(String[] args) {

		setUp();
		startApplication("https://www.goibibo.com/");
		selectDepartureDate("21/05/2023");
	}

}
