package com.session4.ex3.comparator_comparable;

import java.util.Comparator;

public class EmpSorterAsPerName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}

}
