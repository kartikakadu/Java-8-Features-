package Predicate;

import java.util.ArrayList;
import java.util.function.*;
public class DriverPredicate  {
	public static void main(String[] args) {
//		Predicate <Integer> obj=a->a>5;	
//		System.out.println(obj.test(20));
		//-------------------------------for string generic-------------------------------
//		Predicate <String> obj=a->a.length()<5;	
//		System.out.println(obj.test("hi"));
		//---------------------------------for array list---------------------------------
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(2);
		al.add(3);
		al.add(2);
		al.add(40);
		System.out.println(al);
		// Predicate <Integer>pre =a->a==2;
		 al.removeIf(a->a==2);
		 System.out.println(al);
		
		
		
	}

}
