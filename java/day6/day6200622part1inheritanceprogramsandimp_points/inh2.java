class Base //superclass
{
	static
	{
		System.out.println("static block in superclass");
	}
		
	public Base()
	{
		System.out.println("parameterless constructor in superclass");
	}
	public Base(int x)
	{
		System.out.println("parameterized constructor in superclass");
	}
	 
	public void dispBaseMsg()
	{System.out.println("welcome in superclass");}
}
class Derive extends Base //subclass
{
	 static
	{
		System.out.println("static in subclass");
	}
	public Derive()
	{
		super(10);
		System.out.println("parameterless constructor in subclass");
	}
	public Derive(int y)
	{
		super();
		System.out.println("1 parameter constructor in subclass");
	}
	public Derive(int x,int y)
	{
		super(20);
		System.out.println("2 parameter constructor in subclass");
	}

	public void displayDeriveMsg()
	{System.out.println("Hello in subclass");}
	public void displayBothMsg()
	{
		dispBaseMsg();
		displayDeriveMsg();
	}
		
}
class Demo
{
	public static void main(String s[])
	{
	//object of superclass
	/*	Base b1=new Base();
		Base b2=new Base(10);
		b1.dispBaseMsg();
		//b1.displayDeriveMsg(); // not accessible
		//b1.displayBothMsg();   // not accessible
		System.out.println("\n************************\n");*/
	// object of subclass
		Derive d1=new Derive();
		Derive d2=new Derive(20); 
		Derive d3=new Derive(100,200);
		d1.dispBaseMsg();
		d1.displayDeriveMsg();
		d2.displayBothMsg();
		 
	}
}
	