class Obj
{
	private String objName;
	
	public Obj(String objName)
	{this.objName=objName;}
	public String getObjName(){return objName;}
	public void setObjName(String objName)	{this.objName=objName;}
	public void paint(String colour) //overloaded
	{
		System.out.println("painting "+objName+" with colourname "+colour);
	}
	public void paint(int r,int g, int b) //overloaded
	{
		System.out.println("painting "+objName+" with RGB"+r+" "+g+" "+b);
	}
	public void paint(String code,int dummy) //overloaded
	{
		System.out.println("painting "+objName+" with colourcode "+code);
	}
}
class Tester
{
	public static void main(String s[])
	{
		Obj o1=new Obj("Circle");
		o1.paint("violet");
		o1.paint(100,150,220);
		o1.paint("##ff0000",0);
	}
}
