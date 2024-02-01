package com.session4.ex3.comparator_comparable;

public class DemoComparableComparator {

	public static void main(String[] args) {
		List<Employee>employees=new ArrayList<Employee>();
		 employees.add(new Employee(12, "raj", "noida", 978989.00));
		 employees.add(new Employee(120, "ravi", "banglore", 970089.00));
		 employees.add(new Employee(1156, "ekta", "noida", 128989.00));
		 employees.add(new Employee(1689, "suman", "noida", 458989.00));
		 employees.add(new Employee(102, "gunika", "banglore", 918989.00));
		 employees.add(new Employee(1212, "keshav", "noida", 378989.00));
		 System.out.println("--------all employees------------");
		 printAllEmployees(employees);
		 
		 Collections.sort(employees);
		 System.out.println("--------all employees as per id------------");
		 printAllEmployees(employees);
		 
		 Collections.sort(employees, new EmpSorterAsPerName());
		 System.out.println("--------all employees as per name------------");
		 printAllEmployees(employees);
		 
		 Collections.sort(employees, new EmpSorterAsPerSalary());
		 System.out.println("--------all employees as per salary(decending)------------");
		 printAllEmployees(employees);
		
	}

	private static void printAllEmployees(List<Employee> employees) {
		Iterator<Employee> it=employees.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}
}
