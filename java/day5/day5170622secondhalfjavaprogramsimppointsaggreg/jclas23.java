// agreegation with  object reference array of one class as member of another class
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
	private Gadget[] egadget;

	public int getEmpNo(){return this.empNo;}
	public void setEmpNo(int empNo){this.empNo=empNo;}

	public String getEmpName(){return this.empName;}
	public void setEmpName(String empName){this.empName=empName;}

	public float getSalary(){return this.salary;}
	public void setSalary(float salary){this.salary=salary;}
	
	public Gadget[] getEgadget(){return egadget;}
	public void setEgadget(Gadget[] egadget){this.egadget=egadget;}


	public Employee(int empNo,String empName,float salary,Gadget[] egadget)
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
		System.out.print("  Gadgets : ");
		for(Gadget eg : egadget)
			System.out.print(eg.getGname()+"  ");
		System.out.println("\n**********************\n");
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
		Gadget[] eg1={new Gadget("Laptop"),new Gadget("Tab")}; 
		Employee e1=new Employee(1,"Pooja",27000.00f,eg1);
		e1.displayEmpInfo();
		
		 Gadget[] eg2={new Gadget("PC"),new Gadget("Head-phone"),new Gadget("Mobile")}; 
		Employee e2=new Employee(2,"Varsha",87000.00f,eg2);
		e2.displayEmpInfo();
	}
}