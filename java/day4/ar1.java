class Tester
{
	public static void main(String args[])
	{
		int ar[]={4,-700,50,0,1000};
		//System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
		for(int i=0;i<ar.length;i++)
			System.out.println("index "+i+" value "+ar[i]);
		System.out.println("reverse order array printing");
		for(int i=ar.length-1;i>=0;i--)
			System.out.println("index "+i+" value "+ar[i]);
	}
}
