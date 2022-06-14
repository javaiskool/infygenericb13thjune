// multiple main methods

class Tester
{
	public static void main(String s[])
	{
		System.out.println("main method called by JVM");
		Tester.main(1);
		Tester.main('*');


	}
	public static void main(int x)
	{
		System.out.println("x = " +x);
	}
	public static void main(char ch)
	{
		System.out.println("ch = " +ch);
	}
}