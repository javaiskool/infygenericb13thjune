class Employee
{
	private int empNo;
	private String empName;
	private float salary;
	
	public Employee()
	{
		this.empNo=0;
		this.empName="";
		this.salary=0.0f;
	}
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
	private int projectId;
	private String projectName;
	
	public Programmer(int empId,String empName,float salary,int projectId,String projectName)
	{
		super(empId,empName,salary);
		this.projectId=projectId;
		this.projectName=projectName;
	}
	public int getProjectId(){return projectId;}
	public void setProjectId(int projectId){this.projectId=projectId;}
	public String getProjectName(){return projectName;}
	public void setProjectName(String projectName)
	{this.projectName=projectName;}
	public void displayProjectInfo()
	{
		System.out.println("Project ID : "+projectId);
		System.out.println("Project Name : "+projectName);
	}
	public void displayProgrammerInfo()
	{
		displayEmpInfo();
		displayProjectInfo();
	}
}

class Tester
{
	public static void main(String s[])
	{
		/*Employee e1=new Employee(101,"Seema",70000.00f);*/
		Programmer p1=new Programmer(101,"Seema",70000.00f,1001,"javaproject");
	p1.displayProgrammerInfo();
		
	}
}