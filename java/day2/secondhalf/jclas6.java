// pass by value
class Tester
{
	void interChangeXY(int x,int y)
	{
		int t=x;x=y;y=t;
		System.out.println("interchanged values in interchange method of x & y "+x+"  "+y);
	}

	public static void main(String s[])
	{
		Tester t=new Tester();
		int x=10,y=20;
		System.out.println("origonal values of x & y "+x+"  "+y);
	t.interChangeXY(x,y);
	System.out.println("interchanged values in main method of x & y "+x+"  "+y);
	}
}

	