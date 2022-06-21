class A
{
	private int x;
	final private int y;
	public A(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getX(){return x;}
	public void setX(int x){this.x=x;}
	public int getY(){return y;}
	//public void setY(int y){this.y=y;} //cannot assign to final variable

	public void dispXY()
	{
		//this.y=this.y+10; //cannot assign to final variable
		this.x=this.x+10;
		System.out.println("x = "+this.x);
		System.out.println("Y = "+this.y);
	}
}

class Tester
{
	public static void main(String s[])
	{
		A a1=new A(10,20);
		A a2=new A(5,4);
		a1.dispXY();
		a2.dispXY();
	}
}
