package Assignment2;

public class EmpMain {

	public static void main(String[] args) {
		EmployeeInterface employeeD = new EmployeeImpl();
		Employee employee = new Employee(2,"pinky","hyderabad");
		employeeD.insert(employee);

	}

}
