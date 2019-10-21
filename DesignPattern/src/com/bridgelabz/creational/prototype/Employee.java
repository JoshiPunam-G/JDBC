package com.bridgelabz.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private List<String> emplist;
	
	private Employee() {}
	
	public Employee(List<String> list)
	{
		this.emplist=list;
	}
	
	public void Loaddata()
	{
		emplist.add("pratibha");
		emplist.add("nikita");
		emplist.add("mrunal");
	}
	
	public List<String> getEmplist()
	{
		
		return emplist;
		
	}
	
	public Object  clone() throws CloneNotSupportedException
	{
		List<String> temp=new ArrayList<String>();
		for(String s:this.getEmplist())
		{
			temp.add(s);
		}
		return temp;
		
	}


}
