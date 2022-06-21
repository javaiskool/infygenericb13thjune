abstract class A
{
	public void dispA()
	{
		System.out.println("display method in class A");
	}
	abstract public void dispMsg();
}
/*class B extends A
{
	public void dispB()
	{
		System.out.println("display method in class B");
	}
	 public void dispMsg()
	{System.out.println("abstract method implementation in subclass");}
}*/
class Tester
{
	public static void main(String s[])
	{
		A a1=new A();
		a1.dispA();
		 
	}
}
