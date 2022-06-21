class A
{
	int dispMsg()
	{
		System.out.println("Good Morning");
		return 0;
	}


}
class B extends A
{


	public long dispMsg()
	{
		System.out.println("Happy new year");
		return 1;
	}

}
class Tester
{
	public static void main(String s[])
	{
		
		B b1=new B();
		b1.dispMsg();
		
	}
}

	
