// agreegation
class Gadget
{
	private String gname;
	public Gadget(String gname)
	{this.gname=gname;}
	public String getGname()
	{return gname;}
	public void setGname(String gname){this.gname=gname;}
}

class Employee
{
	private int empNo;
	private String empName;
	private float salary;
	private Gadget egadget;

	public int getEmpNo(){return this.empNo;}
	public void setEmpNo(int empNo){this.empNo=empNo;}

	public String getEmpName(){return this.empName;}
	public void setEmpName(String empName){this.empName=empName;}

	public float getSalary(){return this.salary;}
	public void setSalary(float salary){this.salary=salary;}
	
	public Gadget getEgadget(){return egadget;}
	public void setEgadget(Gadget egadget){this.egadget=egadget;}


	public Employee(int empNo,String empName,float salary,Gadget egadget)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
		this.egadget=egadget;
		
	}
	
	public void displayEmpInfo()
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name : "+empName);
		System.out.println("Salary : "+salary);
		System.out.println("Gadget : "+egadget.getGname());
	}
	
}

class Tester
{
	public static void main(String s[])
	{
		Gadget eg1=new Gadget("Laptop"); 
		Employee e1=new Employee(1,"Pooja",27000.00f,eg1);
		e1.displayEmpInfo();
		System.out.println("Employee no "+e1.getEmpNo());
		System.out.println("Gadget "+e1.getEgadget().getGname());
		
		 
	}
}