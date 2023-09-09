package newphase;

import java.math.BigDecimal;

public class Students {


	public static void main(String[] args) {
		int[] marks = {99,89,78};
		Student stud = new Student("Tushar ",marks);
		
//		int number = stud.getNumbOfMarks();
//		System.out.println("Sum of marks "+number);
		int sum = stud.getTotalSumOfMarks();
		System.out.println("Sum name is "+sum);
		 
		int maximumMark = stud.getMaximumMark();
		System.out.println("The maximum marks are:"+maximumMark);
		
		int minimumMark = stud.getMinimumMark();
		System.out.println("The Minimum marks are:"+minimumMark);
		
		BigDecimal average = stud.getAverageMarks();
		System.out.println("The Average of Number:"+average);
		
		System.out.println(stud);

		stud.addNewMark(85);
		
		System.out.println(stud);
		
		stud.removeMarkAtIndex(1);
		
		System.out.println(stud);


				

	}

}
