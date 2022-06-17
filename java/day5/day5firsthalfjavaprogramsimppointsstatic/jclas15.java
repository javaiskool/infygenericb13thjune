// static keyword demo

class Emp
{
	private int empNo;
	private String empName;
	private float salary;
	private static int companyId;

	public int getEmpNo(){return this.empNo;}
	public void setEmpNo(int empNo){this.empNo=empNo;}

	public String getEmpName(){return this.empName;}
	public void setEmpName(String empName){this.empName=empName;}

	public float getSalary(){return this.salary;}
	public void setSalary(float salary){this.salary=salary;}

	static
	{
		companyId=1004;
	}
	public static int getCompanyId(){return companyId;}
	public static void setCompanyId(int companyId)
	{Emp.companyId=companyId; }

	public Emp(int empNo,String empName,float salary)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
		
	}
	
	public void displayEmpInfo()
	{
		System.out.println("Company ID : "+Emp.companyId);
		System.out.println("Employee Number : "+this.empNo);
		System.out.println("Employee Name : "+this.empName);
		System.out.println("Salary : "+this.salary);
	}
	
}

class Tester
{
	public static void main(String s[])
	{
		 
		System.out.println("company id "+Emp.getCompanyId());
		Emp.setCompanyId(1005);
		Emp e1=new Emp(1,"Pooja",27000.00f);
		e1.displayEmpInfo();
		System.out.println(e1.getCompanyId());// not good practice
		
	}
}