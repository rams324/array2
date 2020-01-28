package ctsdemo16;
class Employee
{
public int emp_id;
public String emp_name;
Employee (int emp_id, String emp_name)
{
this.emp_id=emp_id;
this.emp_name=emp_name;
}
	public static void main(String[] args)
	{
		Employee[] employeeArray = null;
		employeeArray[0]=new Employee(1,"dharma teja");
		employeeArray[1]=new Employee(2,"harithe");
		employeeArray[2]=new Employee(3,"kalyan BAbu");
		employeeArray[3]=new Employee(4,"Sreepriya");
		employeeArray[4]=new Employee(5,"narashima");
		//employeeArray[5]=new employee[6,"ramprasad"];
		for(int i=0;i<employeeArray.length;i++)
		{
		System.out.println("element at" +i+ ":"+employeeArray[i].emp_id+" "+ employeeArray[i].emp_name);
	}
	}
}
