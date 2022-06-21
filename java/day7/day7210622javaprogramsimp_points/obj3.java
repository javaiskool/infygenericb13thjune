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
	public int hashCode() {
		int result = 1;
		result = result + (category.hashCode());
		return result;
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
		Item i7=i6;
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i3.hashCode());
		System.out.println(i4.hashCode());
		System.out.println(i5.hashCode());
		System.out.println(i6.hashCode());
		System.out.println(i7.hashCode());
		
	}
}
