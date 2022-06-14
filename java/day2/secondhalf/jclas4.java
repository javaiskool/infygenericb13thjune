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
	void compareSalary(Employee e)
	{
		if (salary>e.salary)
		{
			System.out.println(employeeName+" has more salary than "+e.employeeName);
		}
		else
		{
			System.out.println(e.employeeName+" has more salary than "+employeeName);
		}
	}
}

class Tester
{
	public static void main(String s[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.employeeName="Harry";
		e2.employeeName="Anand";

		e1.salary=75000.00f; 
		e2.salary=83000.00f;

		e1.displayEmpinfo();
		e2.displayEmpinfo();

		e1.compareSalary(e2);

	}
}

