
public class Employee {
	
	private int empId;
	private double salary;
	private String empName;
	private String companyName;
	
	public Employee() {
		
		this(12, 200, "120d");
		empId = 10;
		empName = "city";
		salary = 1000;
		companyName = "city LIT";
		
	}
	
	public Employee(int empId, double salary, String empName) {
		
//		this();
		this.empId = empId;
		this.salary = salary;
		this.empName = empName;
//		this.companyName = companyName;
	}
	
	public void Display() {
		
		System.out.println(empName + "\t" + empId + "\t" + salary + "\t" + companyName);
		
	}
	
}