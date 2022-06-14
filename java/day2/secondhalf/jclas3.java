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
	void updateSalary(float bonus)
	{
		salary=salary+bonus;
	}
	String returnName()
	{

		return employeeName;
	}
	String concatName(String lname)
	{
		return employeeName+lname;
	}
	
}

class Tester
{
	public static void main(String s[])
	{
		Employee e1=new Employee();
		Employee e2;
		e1.salary=75000.00f; 
		e1.displayEmpinfo();
		e1.updateSalary(5000.00f);
		e1.displayEmpinfo();

		e1.employeeName="Harry";
		String sname=e1.returnName();
		System.out.println(sname);
		System.out.println(e1.returnName());

		System.out.println(e1.concatName(" Potter"));

	}
}

