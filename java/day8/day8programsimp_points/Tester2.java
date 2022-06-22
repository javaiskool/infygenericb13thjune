package pkg2;
//import pkg1.*;

class T  extends pkg1.B
{
	public void display()
	{
		//System.out.println("pv = "+pv);
		//System.out.println("pk = "+pk);
		System.out.println("pt = "+pt);
		System.out.println("pb = "+pb);
	}
}

public class Tester2
{
	 public static void main(String args[])
	{
		T t=new T();
		 t.display();

	}
}