//multiple if demo 
class Tester
{
	public static void main(String s[])
	{
		
		int x=12,y=6,ch=5,r;
		
		switch(ch)
		{
			
			case 1:r=x+y;
				System.out.println(x+" + "+y+" = "+r);
				break;
		 	case 2 :
				r=x-y;
				System.out.println(x+" - "+y+" = "+r);
				break;
		 	case 3 :
				r=x*y;
				System.out.println(x+" * "+y+" = "+r);
				break;
			case 4 :
				r=x/y;
				System.out.println(x+" / "+y+" = "+r);
				break;
			default : 
				System.out.println("invalid choice");
		}

	}
}