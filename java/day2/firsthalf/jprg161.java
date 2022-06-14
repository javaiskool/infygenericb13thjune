// 
class Tester
{
	public static void main(String s[])
	{
		int c=0; // initialization
		for(;;)
		{
			System.out.println("hello"+c);
			if (c>=3)//  condition
			break; // stops loop execution and continue execution of statements after the loop.
			c=c+1;  // increment
		}
		System.out.println("statment after loop");
	}
}