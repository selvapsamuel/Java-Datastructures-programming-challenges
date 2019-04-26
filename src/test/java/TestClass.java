
public class TestClass {
	public static void main(String[] args) {
		Employee employee = new Employee("Steve", 123, "IT");

		inspectEmployee(employee);
		System.out.println(employee.toString());

	}

	private static void inspectEmployee(Employee employee) {
		System.out.println(employee.toString());
		employee = null;
	}
}

class Employee {
	private String name;
	private int empId;
	private String dept;

	public Employee(String name, int empId, String dept) {
		super();
		this.name = name;
		this.empId = empId;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", dept=" + dept + "]";
	}

}