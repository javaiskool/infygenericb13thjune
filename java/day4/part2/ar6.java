
class Emp
{
	private int eno;
	private String ename;
	private Float sal;
	
	public Emp()
	{
		this.eno=0;
		this.ename=null;
		this.sal=0.0f;
	}
	public Emp(int eno,String ename, float sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
	public int getEno(){return eno;}
	public void setEno(int eno){this.eno=eno;}
	public String getEname(){return ename;}
	public void setEname(String ename){this.ename=ename;}
	public float getSal(){return sal;}
	public void setSal(float sal){this.sal=sal;}

	public void displayEmpInfo()
	{
		System.out.println("employee number : "+eno);
		System.out.println("employee name : "+ename);
		System.out.println("employee salary : "+sal);
		System.out.println("employee contact list");
		System.out.println("*****************************");
	}
}

class Tester
{
	public static void main(String args[])
	{
		//way1 parameterless constructor
		Emp ea[]=new Emp[]{new Emp(),new Emp(),new Emp()};
		for(int i=0;i<3;i++)
			ea[i].displayEmpInfo(); 
	//way2
		Emp e1=new Emp(1,"Arjun",35000.00f);
		Emp e2=new Emp(2,"Bheem",40000.00f);
		Emp e3=new Emp(3,"Nakul",42000.00f);
		
		Emp eb[]=new Emp[]{e1,e2,e3};
		for(int i=0;i<3;i++)
			eb[i].displayEmpInfo(); 
//way3
		Emp ec[]=new Emp[3];
		ec[0]=new Emp(1,"Arjun",35000.00f);
		ec[1]=new Emp(2,"Bheem",40000.00f);
		ec[2]=new Emp(3,"Nakul",42000.00f);
		
		ec[0].displayEmpInfo();
		ec[1].displayEmpInfo();
		ec[2].displayEmpInfo();

	//way4 parameterized constructor	
		Emp ed[]=new Emp[]{new Emp(1,"Arjun",35000.00f),new Emp(2,"Bheem",40000.00f),new Emp(3,"Nakul",42000.00f)};
		for(int i=0;i<3;i++)
			ed[i].displayEmpInfo(); 

		
		
		
	}
}
