package LambdaExpBackup;

public class Driver {
	public static void main(String[] args) {
		//it will create class for lambda class
//	Test obj=()->{
//		System.out.println("hi");};		
//	System.out.println(obj);
//		obj.print();
		//---------------------------------------------------------------------------------------------------------------
//		Test obj = (int a) -> {
//			System.out.println(a+10);		};
//			obj.print(10);
		//--------------------------------------------------------------------------------------------------------------------
		//Test obj=a->{return a.length();};
		//System.out.println(obj.print("hello"));
		//--------------------------------------------------------------------------------------------------------------------
		//if you remove parenthesis then it is mandetory to remove return keyword
//		Test obj=a->a.length();
//		System.out.println(obj.print("hello"));
			
		//-----------------
//		Test obj=(int a,int b)->{
//			return a+b;
//		};
//		System.out.println(obj.print(10,20));

		//-------------------------------
//		Test obj=(a,b)->a+b;
//		System.out.println(obj.print(10,20));
		Test obj=a->a+"hello";
		System.out.println(obj.print(20));
		//System.out.println(obj.print(20.0));//it will take double also bcz it is generic type
		//create functional interface with name predicate,which has an abstract method test 
		//it will take an input an return boollean value
		//the input is generic 
		
	}
	}
//it is in anonymous function or method which does not have modifier ,returntype ,or method name 
//in java  we will use lambda expression only for functional interface above eg.shows lambda example
