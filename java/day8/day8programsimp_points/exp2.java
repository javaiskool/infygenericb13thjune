class Tester
{
	public static void main(String s[])
	{
		int a=6,b=0;
		System.out.println(a+" , "+b);
		try
		{
			System.out.println("before division");
			System.out.println("a/b = "+(a/b));
			System.out.println("after division");
		}
		catch(Exception e)
		{
			//System.out.println("cannot divide a number by zero");
			System.out.println(e);
		}
		int ar[]={1,5,7};
		try
		{
			for(int i=0;i<3;i++)
			{System.out.println(ar[i]);}
			System.out.println(ar[4]);
			for(int i=0;i<3;i++)
			{System.out.println(ar[i]*2);}
		}
		catch(Exception e)
		{
			System.out.println("beyond array limit");
		}
		System.out.println("continue execution");
	}
}