class Tester
{
	public static void main(String s[])
	{
		int a=6,b=2;
		System.out.println(a+" , "+b);
		try
		{
			System.out.println("before division");
			System.out.println("a/b = "+(a/b));
			System.out.println("after division");
		
			int ar[]={1,5,7};
		
			for(int i=0;i<3;i++)
			{System.out.println(ar[i]);}
			System.out.println(ar[4]);
			for(int i=0;i<3;i++)
			{System.out.println(ar[i]*2);}
			String str="a";
			int x=Integer.parseInt(str);
			System.out.println(str);
			System.out.println(x);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException ie)
		{
			System.out.println("beyond array limit");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("continue execution");
	}
}