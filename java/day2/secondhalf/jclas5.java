// pass by reference
class Tester
{
	int x,y;
	void interChangeXY()
	{
		int t=x;x=y;y=t;
		System.out.println("interchanged values in interchange method of x & y "+x+"  "+y);
	}

	public static void main(String s[])
	{
		Tester t=new Tester();
		t.x=10;
		t.y=20;
		System.out.println("origonal values of x & y "+t.x+"  "+t.y);
	t.interChangeXY();
	System.out.println("interchanged values in main method of x & y "+t.x+"  "+t.y);
	}
}

	