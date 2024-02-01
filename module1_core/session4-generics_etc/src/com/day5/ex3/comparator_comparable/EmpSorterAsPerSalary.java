package com.day5.ex3.comparator_comparable;

import java.util.Comparator;

public class EmpSorterAsPerSalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return Double.compare(e1.getSalary(), e2.getSalary());
	}

}

