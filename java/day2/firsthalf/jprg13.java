//multiple if demo 
class Tester
{
	public static void main(String s[])
	{
		
		int x=12,y=6,z=8;
		
		if (x>=y)
		{
			if(x>=z)
				System.out.println("x is maximum");
			else
				System.out.println("z is maximum");
		}
		else
		{
			if (y>=z)
				System.out.println("y is maximum");
			else
				System.out.println("z is maximum");
		}
	}

}