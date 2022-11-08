package bean;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDetails {
	ArrayList<Employee> ed = new ArrayList<>();

	public void addEmployee(Employee employee) {
		ed.add(employee);
	}

	public void removeEmployee(String name, int id) {
		for (Iterator iterator = ed.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if ((employee.getId() == id) || employee.getName().equals(name)) {
				iterator.remove();
			}

		}

	}

	private void showEmployee() {
		for (Employee i : ed) {
			System.out.println("Employee Name " + i.getName() + " Employee Salary " + i.getSalary() + " Employee id "
					+ i.getId() + " Employee experience" + i.getSalary());

		}

	}

	public void searchByEmployeeName(String name) {
		for (Employee e : ed) {
			if (e.getName().equals(name)) {
				System.out.println(e.getName() + e.getExp());
			}

		}
	}

	public Employee getEmployeeHasHighestSalary() {
		int highsal = 0;
		Employee max = null;
		for (Employee e : ed) {
			if (e.getSalary() > highsal) {
				highsal = e.getSalary();
				max = e;
			}
		}
		return max;

	}

	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		Employee e1 = new Employee(90000, 1, "shandeep", 2);
		Employee e2 = new Employee(95000, 2, "pravs", 3);
		Employee e3 = new Employee(80000, 3, "Toshan", 2);
		Employee e4 = new Employee(10000, 4, "keshiya", 5);
		emp.addEmployee(e1);
		emp.addEmployee(e2);
		emp.addEmployee(e3);
		emp.addEmployee(e4);
		emp.showEmployee();
		System.out.println();
		emp.removeEmployee("keshiya", 5);
		emp.showEmployee();
		System.out.println();
		emp.searchByEmployeeName("shandeep");
		System.out.println();
		System.out.println("high salary employee : " + emp.getEmployeeHasHighestSalary().getName() + " "
				+ emp.getEmployeeHasHighestSalary().getId() + " " + emp.getEmployeeHasHighestSalary().getSalary() + " "
				+ emp.getEmployeeHasHighestSalary().getExp());
	}

}
