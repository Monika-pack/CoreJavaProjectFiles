package spring_injection_setget;

public class Student {
	private int id;
	private String name;
	private float fees;
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
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public void display() {
		System.out.println("Name"+name);
		System.out.println("id"+id);
		System.out.println("Fees"+fees);

	}
	}
