class Item
{
	private String category;
	private String iname;
	
	
	public Item(String category,String iname)
	{
		this.category=category;
		this.iname=iname;
	}
	public void dispItemInfo()
	{
		System.out.println("Item Category : "+category);
		System.out.println("Item Name : "+iname);
	}
	public String toString()
	{
		return iname;
	}
	
}

class Tester
{
	public static void main(String s[])
	{
		//Item i1;
		Item i2=null;
		Item i3=new Item("fruit","apple");
		Item i4=new Item("fruit","mango");
		//System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);

		
	}
}
