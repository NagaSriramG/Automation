package oops;
public class Employee {
	int EmpId;
	String Ename;
	String Ejob;
	int Esal;
	
    Employee(String Ename,int EmpId,String Ejob,int Esal)
	{
		this.Ename=Ename;
		this.EmpId=EmpId;
		this.Ejob=Ejob;
		this.Esal=Esal;
	}

	void Display() {
		   System.out.println(EmpId);
		   System.out.println(Ename);
		   System.out.println(Ejob);
		   System.out.println(Esal);   
	}
	
	void show() {
		System.out.println("Next Employee Data");
		}
	
	public static void main(String[] args) {
		
		Employee Emp1=new Employee("Karthik", 1, "Tester", 90000);
		Emp1.Display();
		Emp1.show();
		
		Employee Emp2=new Employee("Sriram", 2, "Tester", 85000);
		Emp2.Display();

	}
}
