import java.util.*;

class Tester
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("enter a number");
		x=sc.nextInt();
		if (x>0)
		{
			System.out.println("x is positive");
		}
		else
		{
			if(x<0)
			{
				System.out.println("x is negative");
			}
			else
			{
				System.out.println("x is zero");
			}
		}


	}

}