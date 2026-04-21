package FlowControl;

public class Employee {
	
	int empId;
	String empName;
	int salary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setEmpId(12472);
		emp.setEmpName("Nitish");
		emp.setSalary(126000);
		
		System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getSalary());


	}

}
