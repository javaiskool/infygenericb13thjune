class Employee
{
	int empNo;
	String empName;
	float salary;

	Employee()
	{
		empNo=1;
		empName="Sameer";
		salary=50000.0f;
	}

	void displayEmpInfo()
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name : "+empName);
		System.out.println("Salary : "+salary);
	}	
}

class Tester
{
	public static void main(String s[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.displayEmpInfo();
		e2.displayEmpInfo();
	}
}