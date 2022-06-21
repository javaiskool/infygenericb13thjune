
class Tester
{
	public static void main(String s[])
	{
		int x=10;
		Integer y=new Integer(7);

		System.out.println("int value x = "+(x+y));
		System.out.println("Integer object y = "+(y+x));

		System.out.println("\n*** comparing value and object ***\n");
		Integer z=new Integer(7);
		System.out.println("compare  objects y==z "+(y==z));
		System.out.println("compare  objects y equals z "+(y.equals(z)));
		System.out.println("compare  objects y hashcode z "+(y.hashCode()==z.hashCode()));

		System.out.println("\n*** wrapping and unwrapping ***\n");
		Integer a=new Integer(x);
		int b=Integer.valueOf(y);
		System.out.println("Integer object a = "+a);
		System.out.println("int value b = "+b);

		System.out.println("\n*** instanceof operator ***\n");
		System.out.println("check if a is Integer object  "+(a instanceof Integer));

		System.out.println("\n*** converting numeric string to number ***\n");
		String st="346";
		int p=Integer.parseInt(st);
		Integer q=new Integer(p);
		System.out.println("numeric string = "+st);
		System.out.println("int value p = "+p);
		System.out.println("Integer object q = "+q);

		System.out.println("\n*** datatype conversion   ***\n");
		Integer i1=98765434;
		Long l1=45678998L;
		Long l2=i1.longValue();
		Integer i2=l1.intValue();
		System.out.println("Integer object value i1 "+i1);
		System.out.println("Long object value l1 "+l1);
		System.out.println("Integer to Long object "+l2);
		System.out.println("Long to Integer object  "+i2);
		System.out.println("\n** conversion of Integer object to string & binary-string  **\n");
		String str1=Integer.toString(54);
		String str2=Integer.toBinaryString(54);
		System.out.println("Integer object as  string: "+str1);
		System.out.println("Integer object as binary-string: "+str2);
		
	}

}
