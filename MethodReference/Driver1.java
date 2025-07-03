package MethodReference;
public class Driver1 {
	public static void main(String[] args) {
//		Demo res=Test::m1;
//		res.print();
		Demo res=String::toUpperCase;
		System.out.println(res.print("Hello"));
		
		Demo res1=i->i.toUpperCase();
		System.out.println(res1.print("Hello"));
	}
}
//using method reference we will provide implementation for the abstract methods of functional interface 
//we will use method reference only for existing implementation syntax for method refence classname ::(method refence delimiter)method name of implementing class
//eg.demo
//provide implemention with the help of method reference but when class is final
//if implemntation already exist then only you can use method reference 


//constructor reference
//we can provide implementation to the abstract method of functional interface  by using constructor reference
//here the implemntation  of the abstract method must be present inside a constructor 
//synatx classname ::new operator
