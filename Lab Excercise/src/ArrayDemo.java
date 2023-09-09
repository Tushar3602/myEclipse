import java.util.ArrayList;
import java.util.List;

class Patient {
	private String name;

	public Patient(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class ArrayDemo {
	public static void main(String[] args) {
		List<Patient> patients = new ArrayList<>();
		patients.add(new Patient("Hasrish"));
		patients.add(new Patient("Ram"));
		patients.add(new Patient("Aanand"));
		patients.add(new Patient("Akash"));
		patients.add(new Patient("Avinash"));
		for (Patient patient : patients) {
			if (patient.getName().startsWith("A")) {
				System.out.println(patient.getName());
			}
		}
	}
}