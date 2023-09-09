import java.util.TreeSet;

class Employee12 implements Comparable<Employee12> {
	private int age;
	private String name;

	public Employee12(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int compareTo(Employee12 o) {
		return this.age - o.age;
	}

	public String toString() {
		return "Employee12 [age=" + age + ", name=" + name + "]";
	}
}

public class treeDemo {
	public static void main(String[] args) {
		TreeSet<Employee12> Employee12s = new TreeSet<>();
		Employee12s.add(new Employee12(22, "Enumerator"));
		Employee12s.add(new Employee12(25, "Iterator"));
		Employee12s.add(new Employee12(18, "ListIterator"));

		for (Employee12 Employee12 : Employee12s) {
			System.out.println(Employee12);
		}
	}
}