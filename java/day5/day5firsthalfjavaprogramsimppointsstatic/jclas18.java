// static keyword  

class Emp
{
	private String empNo;
	private static int counter=1;
	public Emp()
	{
		 System.out.println("constructor of Emp");
		this.empNo= "A"+counter++;
	
	}
	static
	{
		System.out.println("static block of Emp");
	}
	public void displayEmpInfo()
	{
		System.out.println("Counter : "+Emp.counter);
		System.out.println("Employee Number : "+this.empNo);
	}
	public static void msg()
	{
		System.out.println("hello message in Emp class static method");
	}
}

class Tester
{
	public static int var=101;
	static
	{
		System.out.println("static block in Tester class");
	}
	public static void main(String s[])
	{
		Emp e1=new Emp();
		e1.displayEmpInfo();
		//Emp.msg();
		
		 
		
	}
}