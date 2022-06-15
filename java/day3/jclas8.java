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
	Employee(int eno,String enm,float sal)
	{
		empNo=eno;
		empName=enm;
		salary=sal;
	}
	Employee(float sal,int eno,String enm)
	{
		empNo=eno;
		empName=enm;
		salary=20000.00f;
	}
	Employee(int empNo,String empName)
	{
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
		Employee e2=new Employee(2,"Pooja",70000.0f);
		Employee e3=new Employee(3,"Ravi");
		e1.displayEmpInfo();
		e2.displayEmpInfo();
		e3.displayEmpInfo();
	}
}