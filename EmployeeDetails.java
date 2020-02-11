
public class EmployeeDetails {

	int empId;
	String empNAme;
	float empSal;
	public EmployeeDetails(){}
	public EmployeeDetails(int empId,String NAme,float empSal)
	{
		this.empId=empId;
		this.empNAme=empNAme;
		this.empSal=empSal;
	}
	public void calculateSalary()
	{
		System.out.println("employee salary:"+(empSal+2000));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails ed=new EmployeeDetails();
		ed.calculateSalary();

	}

}
