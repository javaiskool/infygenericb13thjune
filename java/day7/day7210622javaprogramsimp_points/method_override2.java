class A
{
	public void dispMsg()
	{
		System.out.println("Good Morning");
	}
	public void dispA()
	{
		System.out.println("class A");
	}


}
class B extends A
{


	public void dispMsg() //overridden method
	{
		System.out.println("Happy new year");
	}
	public void dispB()
	{
		System.out.println("class B");
	}

}
class Tester
{
	public static void main(String s[])
	{
		// object reference of superclass and instance of superclass
	System.out.println("\n********* Case 1 *********\n");
		A a1=new A();
		a1.dispMsg(); // calls superclass method
		a1.dispA();
		//a1.dispB(); // not accessible
		

		//object reference of subclass and instance of subclass
	System.out.println("\n********* Case 2 *********\n");
		B b1=new B();
		b1.dispMsg(); // calls subclass method
		b1.dispA();
		b1.dispB();

		// object reference of superclass and instance of subclass
System.out.println("\n********* Case 3  *********\n");
		A a2=new B();
		a2.dispMsg(); // calls subclass method
		a2.dispA();
		//a2.dispB(); //not accessible

		
	}
}

	
