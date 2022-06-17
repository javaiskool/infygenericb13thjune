// static keyword for auto generation of emplyee id alphanumeric

class Emp
{
	private String empNo;
	private String empName;
	private float salary;
	private String dname;
	private static int companyId;
	private static int counter;

	public String getEmpNo(){return this.empNo;}

	public String getEmpName(){return this.empName;}
	public void setEmpName(String empName){this.empName=empName;}

	public String getDname(){return this.dname;}
	public void setDname(String dname){this.dname=dname;}

	public float getSalary(){return this.salary;}
	public void setSalary(float salary){this.salary=salary;}

	static
	{
		companyId=1004;
		counter=101;
	}
	public static int getCompanyId(){return companyId;}
	public static void setCompanyId(int companyId)
	{Emp.companyId=companyId; }

	public Emp(String dname, String empName,float salary)
	{
		this.dname=dname;
		this.empNo=dname.substring(0,1)+(counter++);
		this.empName=empName;
		this.salary=salary;
		
	}
	
	public void displayEmpInfo()
	{
		System.out.println("Company ID : "+Emp.companyId);
		System.out.println("Department Name : "+this.dname);
		System.out.println("Employee Number : "+this.empNo);
		System.out.println("Employee Name : "+this.empName);
		System.out.println("Salary : "+this.salary);
	}
	
}

class Tester
{
	public static void main(String s[])
	{
		 
		Emp e1=new Emp("Accounts","Pooja",27000.00f);
		e1.displayEmpInfo();
		Emp e2=new Emp("Marketing","Pooja",27000.00f);
		e2.displayEmpInfo();
		
	}
}