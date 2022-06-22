interface ifc
{
	int C=100;
	void display();
	int getNumber();
}
abstract class A implements ifc
{
	int x=C;
	public void displayA()
	{
		System.out.println("display in class A");
	}
	public int getNumber(){return x;}
}
class B extends A
{
	public void display()
	{
		System.out.println("overridden method display from interface");
	}
}

class Tester
{
	public static void main(String s[])
	{
		B b1=new B();
		b1.display();
		b1.displayA();
		System.out.println(b1.getNumber());
	}
}

	
	