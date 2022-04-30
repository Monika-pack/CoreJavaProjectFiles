package Employee_spring;

public class EmployeeInfo {

	private int id;
	private String name;
	private float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getsalary() {
		return salary;
	}
	public void setsalary(float salary) {
		this.salary = salary;
	}
	public void display() {
		System.out.println("Name"+name);
		System.out.println("id"+id);
		System.out.println("salary"+salary);

	}
	}
