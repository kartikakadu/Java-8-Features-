package FunctionalInterfacebackup3;
@FunctionalInterface
public interface Test2 extends Test { //already test will be inherited that why it not showing any error  and we can access only one abstract method in our functional interfacess
	

}
//fI are declared with singke abstract method 
//we can declare any number of defult method or static () inside functional interface
//during compilation to check whether the declared interface is an functional interface we will anoted our interface with @functional interface
//if an iterface is anotated make sure it should have atleast one abstract method eg.test interface 
//we have predefined functional interface in java 1)comparable 2)comparator 3)runnable 4)predicate 5)consumer 6)Supplier 7)function 
//using functional interface we will achieve: 
//lambda expression
//higher order function 
//functional programming 