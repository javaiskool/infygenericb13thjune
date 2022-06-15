// access modifiers private  

class Employee
{
	private int empNo;
	private String empName;
	private float salary;

	public int getEmpNo(){return this.empNo;}
	public void setEmpNo(int empNo){this.empNo=empNo;}

	public String getEmpName(){return this.empName;}
	public void setEmpName(String empName){this.empName=empName;}

	public float getSalary(){return this.salary;}
	public void setSalary(float salary){this.salary=salary;}


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
		System.out.println(e1.getEmpNo());
		e1.setSalary(29000.00f);
 		e1.displayEmpInfo();
	}
}