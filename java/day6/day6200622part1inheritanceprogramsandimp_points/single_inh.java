class Employee
{
	private int empNo;
	private String empName;
	private float salary;
	
	public Employee(int empNo,String empName,float salary)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
	}
	
	public int getEmpNo(){return this.empNo;}
	public void setEmpNo(int empNo){this.empNo=empNo;}

	public String getEmpName(){return this.empName;}
	public void setEmpName(String empName){this.empName=empName;}

	public float getSalary(){return this.salary;}
	public void setSalary(float salary){this.salary=salary;}
	
	public void displayEmpInfo()
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name : "+empName);
		System.out.println("Salary : "+salary);
	}
}
class Programmer extends Employee
{
	private String skill;
	
	public Programmer(int empId,String empName,float salary,String skill)
	{
		super(empId,empName,salary);
		this.skill=skill;
	}
	
	public String getSkill(){return skill;}
	public void setskill(String skill)
	{this.skill=skill;}
	public void displaySkill()
	{
		System.out.println("skill : "+skill);
	}
	public void displayProgrammerInfo()
	{
		displayEmpInfo();
		displaySkill();
	}
}

class Tester
{
	public static void main(String s[])
	{
		Programmer p1=new Programmer(101,"Seema",70000.00f,"Java-Spring");
	p1.displayEmpInfo();
	p1.displaySkill();
	//p1.displayProgrammerInfo();
		
	}
}