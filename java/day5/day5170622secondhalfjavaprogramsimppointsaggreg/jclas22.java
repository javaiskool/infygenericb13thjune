// agreegation with static execution sequence
class Gadget
{
	private String gname;
	public Gadget(String gname)
	{this.gname=gname;}
	public String getGname()
	{return gname;}
	public void setGname(String gname){this.gname=gname;}
	static
	{
		System.out.println("static block in Gadget class");
	}
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
	static
	{
		System.out.println("static block in Emp class");
	}
}

class Tester
{
	static
	{
		System.out.println("static block in tester class");
	}
	public static void main(String s[])
	{
		//Gadget eg1=new Gadget("Laptop"); 
		Employee e1=new Employee(1,"Pooja",27000.00f,new Gadget("Laptop"));
		e1.displayEmpInfo();
		 
	}
}