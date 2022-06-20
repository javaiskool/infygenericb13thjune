class Base //superclass
{
	private int x;
		
	public Base()
	{
		x=0;
		System.out.println("parameterless constructor in superclass");
	}
	public Base(int x)
	{
		this.x=x;
		System.out.println("parameterized constructor in superclass");
	}
	public int getX(){return x;}
	public void setX(int x){this.x=x;}
	public void dispX()
	{System.out.println("x = "+x);}
}
class Derive extends Base //subclass
{
	private int y;
	public Derive(int y)
	{
		this.y=y;
		System.out.println("1 parameter constructor in subclass");
	}
	public Derive(int x,int y)
	{
		super(x);
		this.y=y;
		System.out.println("2 parameter constructor in subclass");
	}

	public void dispY()
	{System.out.println("y = "+y);}
	public void dispXY()
	{
		System.out.println("x = "+getX());
		System.out.println("y = "+y);
	}
		
}
class Demo
{
	public static void main(String s[])
	{
		Base b1=new Base(10);
		b1.dispX();
		//b1.dispY(); // not accessible


		Derive d1=new Derive(20); //object of subclass
		Derive d2=new Derive(100,200);
		d1.dispY();
		d1.dispX();
		d1.dispXY();
		System.out.println("\n************************\n");
		d2.dispX();
		d2.dispY();

	}
}
	