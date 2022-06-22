package pkg1;

class A
{
	public void displayA()
	{
		System.out.println("display in class A");
	}
}

public class B
{
	private int pv;
	protected int pt;
	int pk;
	public int pb;

	public B()
	{
		pv=1;
		pt=2;
		pk=3;
		pb=4;
	}
	public void displayB()
	{
		System.out.println("pv = "+pv);
		System.out.println("pt = "+pt);
		System.out.println("pk = "+pk);
		System.out.println("pb = "+pb);
	}
}

