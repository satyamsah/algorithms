

import java.util.*;  
import java.io.*;  


class Person implements Comparable<Person>{
	int age;
	String name;
	@Override
	public int compareTo(Person p) {
		if(this.age>p.age){
			return 1;
			
		}else if(this.age<p.age){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	public Person(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	
}

public class Solution {
	
	public static void main(String [] str){
		Person p1 = new Person(22,"Peter");
		Person p2 = new Person(90, "Parker");
		Person p3 = new Person(24, "John");
		ArrayList<Person> al = new ArrayList<>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		Collections.sort(al);
		for(Person st:al){  
			System.out.println(st.age+ " "+ st.name);  
			}  
	}
	
	
	
	
}

