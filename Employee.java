public class Employee {
	
	int empid;
	String empName;
	int empSalary;
	
	public Employee() {}
	
	public Employee(int empid, String empName, int empSalary) {
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public void showEmployee() {
		System.out.println("Employee id is: "+ empid);
		System.out.println("Employee Name: "+ empName);
		System.out.println("Employee Salary: "+ empSalary);
		
	}
	
	public String toString() {
		return empid + "	" + empName + "		" + empSalary ;
	}
}