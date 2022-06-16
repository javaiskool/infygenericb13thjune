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
		long contact1[]={1234567,645778,2324345};
		Emp e1=new Emp(1,"Alpa",60000.00f,contact1);
		e1.displayEmpInfo();
		long contact2[]={947375,25275,83892379,3843284};
		Emp e2=new Emp(2,"Raghav",70000.00f,contact2);
		e2.displayEmpInfo();
		long contact3[]={947375,25275,83892379,3843284,2398197};
		e2.setContactNos(contact3);
		System.out.println("contact list modified for "+e2.getEno());
		long contact5[]=e2.getContactNos();
		for(long cno:contact5)
			System.out.println(cno);

		
	}
}
