class Employee
{
	int employeeNo;
	String employeeName;
	float salary;

	void displayEmpinfo()
	{
		System.out.println("Employee Number : "+employeeNo);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Salary : "+salary);
	}
}

class Tester
{
	public static void main(String s[])
	{
		Employee e1=new Employee();
		float sal;
		sal=e1.salary;
		System.out.println(e1.employeeNo);
		e1.displayEmpinfo();
	}
}

