package classInJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calender {

	static SimpleDateFormat simple = new SimpleDateFormat("MMMM dd yyyy");

	public Calender getTodaysDate() {

		System.out.println("Todays Date = " + simple.format(new Date()));		
		return new Calender();
	}

	public void getMonth() {

		String s = simple.format(new Date());
		System.out.println("s = " + s);
		String month = s.split(" ")[0];
		System.out.println("month = " + month);
		int numberOfMonth = MonthInNumber.monthInNum(month);
		System.out.println(numberOfMonth);

	}

	public static void main(String[] args) {
		
		Calender calender = new Calender();
		calender.getTodaysDate().getMonth();
	
	}
}
