// memory management garbage collection secnarios

class Employee
{
	int empNo;
	String empName;
	float salary;

	Employee(int empNo,String empName,float salary)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
		
	}
	
	void displayEmpInfo()
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name : "+empName);
		System.out.println("Salary : "+salary);
	}
	void checksal(Employee e) //scenario 3
	{
		Employee te=new Employee(6,"Prasad",70000.00f); 
		System.out.println("salary "+this.salary);
		System.out.println("salary "+e.salary);
		System.out.println("salary "+te.salary);
	}	
}

class Tester
{
	public static void main(String s[])
	{
		//scenario 1
		Employee e1=new Employee(1,"Pooja",27000.00f);
		Employee e2=new Employee(3,"Ravi",30000.00f);
		Employee e3;
		e3=e2;
		e2=null;
		e1=null;
		//scenario 2
		Employee e4=new Employee(4,"Arti",38000.00f);
		e4=new Employee(5,"Sidh",40000.00f);
		e4.checksal(e3);
	

		 
	}
}