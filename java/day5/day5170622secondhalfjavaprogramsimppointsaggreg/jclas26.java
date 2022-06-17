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
	private static Gadget[] egadget=null;

	public int getEmpNo(){return this.empNo;}
	public void setEmpNo(int empNo){this.empNo=empNo;}

	public String getEmpName(){return this.empName;}
	public void setEmpName(String empName){this.empName=empName;}

	public float getSalary(){return this.salary;}
	public void setSalary(float salary){this.salary=salary;}
	
	public static Gadget[] getEgadget(){return egadget;}
	public static void setEgadget(Gadget[] egt){egadget=egt;}

	public Employee(int empNo,String empName,float salary )
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
		System.out.print("  Gadgets : ");
		if(egadget!=null)
		for(Gadget eg : egadget)
			System.out.println(eg.getGname());
		System.out.println("\n********************\n");
	}
}

class Tester
{
	public static void main(String s[])
	{
		Gadget[] eg={new Gadget("Laptop"),new Gadget("Tab"),new Gadget("PC"),new Gadget("Head-phone"),new Gadget("Mobile")}; 
		Employee[] emp={new Employee(1,"Pooja",27000.00f),new Employee(2,"Varsha",87000.00f)};
		for(Employee e:emp)
			e.displayEmpInfo();
		Employee.setEgadget(new Gadget[]{eg[1],eg[3],eg[4]});
		for(Employee e:emp)
			e.displayEmpInfo();
	}
}