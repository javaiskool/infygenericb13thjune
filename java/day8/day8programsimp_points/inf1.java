interface ifc
{
	int C=100;
	void display();
	int getNumber();
}
class A implements ifc
{
	int x=C;
	public void display()
	{
		System.out.println("overridden method display from interface");
	}
	public int getNumber(){return x;}
}

class Tester
{
	public static void main(String s[])
	{
		A a1=new A();
		a1.display();
		System.out.println(a1.getNumber());
	}
}

	
	