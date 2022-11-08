package bean;

public class Employee {
	private int salary;
	private int id;
	private String name;
	private int exp;
	private String cabin;
	public Employee(int salary, int id, String name, int exp) {
		super();
		this.salary = salary;
		this.id = id;
		this.name = name;
		this.exp = exp;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
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
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}

	

	}
