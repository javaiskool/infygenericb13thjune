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
	
}

class Tester
{
	
	public static void main(String s[])
	{
		Gadget[] eg={new Gadget("Laptop"),new Gadget("Tab"),new Gadget("PC"),new Gadget("Head-phone"),new Gadget("Mobile")}; 
		Employee[] emp={new Employee(1,"Pooja",27000.00f,new Gadget[]{eg[0],eg[2]}),new Employee(2,"Varsha",87000.00f,new Gadget[]{eg[1],eg[2],eg[3]})};
		for(Employee e:emp)
			e.displayEmpInfo();
	}
}