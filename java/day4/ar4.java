import java.util.*;
class Emp
{
	private int eno;
	private String ename;
	private Float sal;
	private long contactNos[];

	public Emp(int eno,String ename, float sal,long contactNos[])
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		this.contactNos=contactNos;
	}
	public int getEno(){return eno;}
	public void setEno(int eno){this.eno=eno;}
	public String getEname(){return ename;}
	public void setEname(String ename){this.ename=ename;}
	public float getSal(){return sal;}
	public void setSal(float sal){this.sal=sal;}

	public long[] getContactNos(){return contactNos;}
	public void setContactNos(long contactNos[])
{this.contactNos=contactNos;}

	public void displayEmpInfo()
	{
		System.out.println("employee number : "+eno);
		System.out.println("employee name : "+ename);
		System.out.println("employee salary : "+sal);
		System.out.println("employee contact list");

		for(int i=0;i<contactNos.length;i++)
			System.out.println(contactNos[i]);
		System.out.println("*****************************");
	}
}

class Tester
{
	public static void main(String args[])
	{
		
		Emp e1=new Emp(1,"Alpa",60000.00f,new long[]{1234567,645778,2324345});
		e1.displayEmpInfo();

		Scanner sc=new Scanner(System.in); 
		long contacts[];
		System.out.println("how many contact numbers ?");
		int n=sc.nextInt();
		contacts=new long[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter contactno "+(i+1));
			contacts[i]=sc.nextLong();
		} 
		Emp e2=new Emp(2,"Raghav",70000.00f,contacts);
		e2.displayEmpInfo();
		 
		
	}
}
