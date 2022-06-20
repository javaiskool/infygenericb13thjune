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

class TeamHead extends Programmer
{
	private int teamSize;
	
	public TeamHead(int empId,String empName,float salary,String skill,int teamSize)
	{
		super(empId,empName,salary,skill);
		this.teamSize=teamSize;
	}
	
	public int getTeamSize(){return teamSize;}
	public void setTeamSize(int teamSize)
	{this.teamSize=teamSize;}
	public void displayTeamSize()
	{
		System.out.println("TeamSize : "+teamSize);
	}
	public void displayTeamHeadInfo()
	{
		displayEmpInfo();
		displaySkill();
		System.out.println("TeamSize : "+teamSize);
	}
	 
}

class Tester
{
	public static void main(String s[])
	{
		TeamHead t1=new TeamHead(108,"Krishna",120000.00f,"Java-Spring",9);
	t1.displayEmpInfo();
	t1.displaySkill();
	t1.displayTeamSize();
	//t1.displayTeamHeadInfo();
	 
		
	}
}