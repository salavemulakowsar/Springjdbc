package Assignment2;

public class EmpMain {

	public static void main(String[] args) {
		EmployeeInterface employeeD = new EmployeeImpl();
		//Employee employee = new Employee(2,"pinky","hyderabad");
		//Employee employee = new Employee(3,"sweety","chennai");
		//employeeD.insert(employee);
         employeeD.delRecordById(2);
	}

}
