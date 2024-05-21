package com.pratyush.demo2;

import java.util.function.Predicate;

public class PredicateClass {
	public void populate(Student std , int id) {
		Predicate<Student> p = isAvail(id);
		
	}//xyz
	
	public Predicate<Student> isAvail(int id){
		return student -> student.getName() != null;
		
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		std.setId(1);
		std.setAddress("cd");
		std.setName("xyz");
		
		PredicateClass pc = new PredicateClass();
		pc.populate(std, 0);
	}

}
