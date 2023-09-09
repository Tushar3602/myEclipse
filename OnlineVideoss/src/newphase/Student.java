package newphase;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		// TODO Auto-generated constructor stub
		this.name=name;
		
		for(int mark: marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum=0;
		for (int mark:marks) {
			sum +=mark;
		}
		return sum;
	}

	public int getMaximumMark() {
//		int maximumMark=Integer.MIN_VALUE;
//		for(int mark:marks) {
//			if(mark>maximumMark) {
//				maximumMark=mark;
//			}
//		}
//		return maximumMark;
		return Collections.max(marks);
	}

	public int getMinimumMark() {
//		int minimumMark=Integer.MAX_VALUE;
//		for(int mark:marks) {
//			if(mark<minimumMark) {
//				minimumMark=mark;
//			}
//		}
//		return minimumMark;
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number),3,RoundingMode.UP);
	}
	
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
		
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
		
	}

}
