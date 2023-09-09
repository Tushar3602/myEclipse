import java.util.*;

class Employee implements Comparable<Employee> {
	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Employee other) {
		return Integer.compare(this.age, other.age);
	}
}

public class EmployeeTreeSetExample {
	public static void main(String[] args) {
		TreeSet<Employee> employees = new TreeSet<>();

		// Add some employees to the set
		employees.add(new Employee("Salef", 20));
		employees.add(new Employee("Raj", 25));
		employees.add(new Employee("Nitesh", 35));
		employees.add(new Employee("jules", 27));

		// Print the employees in sorted order
		for (Employee employee : employees) {
			System.out.println(employee.getName() + " (" + employee.getAge() + ")");
		}
	}
}

