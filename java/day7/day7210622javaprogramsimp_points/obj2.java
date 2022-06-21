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
	public boolean equals(Object obj)
	{
		Item i=(Item)obj;
		if(this.category.equals(i.category))
			return true;
		else
			return false;
	}
	
}
class Tester
{
	public static void main(String s[])
	{
		Item i1=new Item("fruit","green apple");
		Item i2=new Item("food","red apple");
		Item i3=new Item("stationary","sketch pen");
		Item i4=new Item("fruit","apple");
		Item i5=new Item("fruit","mango");
		Item i6=new Item("fruit","mango");
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));
		System.out.println(i1.equals(i4));
		System.out.println(i1.equals(i5));
		System.out.println(i5.equals(i6));

		
	}
}
