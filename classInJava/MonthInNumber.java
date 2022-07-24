package classInJava;

public class MonthInNumber {

	
	public static int monthInNum(String month) {
		int mon = 0;
		switch (month) {
		case "January":
			mon = 1;
			break;
		case "February":
			mon = 2;
			break;
		case "March":
			mon = 3;
			break;
		case "April":
			mon = 4;
			break;
		case "May":
			mon = 5;
			break;
		case "June":
			mon = 6;
			break;
		case "July":
			mon = 7;
			break;
		case "August":
			mon = 8;
			break;
		case "September":
			mon = 9;
			break;
		case "October":
			mon = 10;
			break;
		case "November":
			mon = 11;
			break;
		case "December":
			mon = 12;
			break;
		default:
			System.out.println("No matching case found");
		}

		return mon;

	}
}
