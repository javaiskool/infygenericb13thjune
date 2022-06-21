final class A
{
	public void dispMsg()
	{
		System.out.println("good morning");
	}
	public void dispA()
	{
		System.out.println("display method in A");
	}
}
//class B extends A // cannot inherit class which is final
{
	 
	public void dispMsg()
	{
		System.out.println("happy new year");
	}
	public void dispB()
	{
		System.out.println("display method in B");
	}
}

class Tester
{
	public static void main(String s[])
	{
		A a1=new A();
		a1.dispMsg();
		a1.dispA();
		B b1=new B();
		b1.dispMsg();
		b1.dispA();
		b1.dispB();
	}
}
