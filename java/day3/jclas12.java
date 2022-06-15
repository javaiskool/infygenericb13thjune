// access modifiers private & public 

class Employee
{
	public int empNo;
	public String empName;
	public float salary;

	public Employee(int empNo,String empName,float salary)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
		
	}
	
	public void displayEmpInfo()
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
		 
		Employee e1=new Employee(1,"Pooja",27000.00f);
		e1.displayEmpInfo();
		System.out.println(e1.empNo);
		e1.salary=25000.00f;
 		e1.displayEmpInfo();
	}
}