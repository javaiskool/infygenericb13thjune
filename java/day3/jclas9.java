class Employee
{
	int empNo;
	String empName;
	float salary;

	Employee()
	{
		System.out.println("default constructor called");
		salary=40000.00f;
	}
	
	Employee(int empNo,String empName)
	{
		//this();
		this.empNo=empNo;
		this.empName=empName;
		
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
		Employee e3=new Employee(3,"Ravi");
		e1.displayEmpInfo();
		e3.displayEmpInfo();
	}
}