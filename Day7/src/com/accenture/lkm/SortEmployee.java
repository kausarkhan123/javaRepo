package com.accenture.lkm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {

	public static void main(String[] args) 
	{
		List<Employee> list=new ArrayList<>();
		Employee e0=new Employee(1000,"Nehal",20000);
		Employee e1=new Employee(9,"Raghav",50000);
		Employee e2=new Employee(8,"Akash",60000);
		Employee e3=new Employee(1,"Anushka",10000);
		Employee e4=new Employee(2,"Aman",80000);
		list.add(e0);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		Collections.sort(list, new SalaryComparator());
		//Collections.sort(list,new IdComparator());
		for(Employee e:list)
		{
			
			System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getSalary());
		}
		
	
	}

}
