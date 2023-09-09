package newphase;

import java.util.Scanner;

public class weekDay {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(2));
		System.out.println(determineNameOfMonth(3));
		System.out.println(isWeekDay(4));
	}

	public static String determineNameOfDay(int dayNumber) {
		String result = "";

		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Mon";
		case 2:
			return "Tues";
		case 3:
			return "Wed";
		case 4:
			return "Thr";
		case 5:
			return "fri";
		case 6:
			return "sat";
		}
		return "Invalid_Day";

	}
	public static String determineNameOfMonth(int monthNumber) {
		String result="";
		
		switch (monthNumber) {
		case 1:return "Jan";
		case 2:return "Feb";
		case 3:return "Mar";
		case 4:return "April";
		case 5:return "May";
		case 6:return "June";
		case 7:return "July";
		case 8:return "Aug";
		case 9:return "Sept";
		case 10:return "Oct";
		case 11:return "Nov";
		case 12:return "Dec";
		}
		return "invalid";
	}
	public static boolean isWeekDay(int dayNumber) {
	
		
		switch(dayNumber) {
		case 0: 
		case 6: return false;
		case 1: 
		case 2: 
		case 3:
		case 4: 
		case 5: return true;
		}
		return false;
		
		
	}
}
