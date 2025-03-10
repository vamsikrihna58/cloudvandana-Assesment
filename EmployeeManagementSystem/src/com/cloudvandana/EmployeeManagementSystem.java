package com.cloudvandana;

import java.util.ArrayList;
import java.util.List;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String display() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		List<Employee> re = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "vamsi", 23456);
		Employee e2 = new Employee(2, "suresh", 34567);
		Employee e3 = new Employee(3, "samantha", 65454);

		re.add(e1);
		re.add(e2);
		re.add(e3);

		for (Employee e : re) {
			System.out.println(e.display());
		}
	}
}
