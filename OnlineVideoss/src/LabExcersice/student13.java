package LabExcersice;

class Student {
    int roll;
    String name;
    String city;
    
    public Student(int roll, String name, String city) {
        this.roll = roll;
        this.name = name;
        this.city = city;
    }
}
public class student13 {

	public static void main(String[] args) {
		
		Student[] students = new Student[]{
			    new Student(51, "Manish", "Delhi"),
			    new Student(52, "Rahul", "Mumbai"),
			    new Student(53, "Yash", "Nagpur"),
			    new Student(53, "Rohan", "Pune")
			};
		
		for (Student student : students) {
		    if (student.city.equals("Mumbai")) {
		        System.out.println("Roll: " + student.roll);
		        System.out.println("Name: " + student.name);
		        System.out.println("City: " + student.city);
		    }
		}
		// TODO Auto-generated method stub

	}

}
