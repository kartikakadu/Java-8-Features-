package Supplier;
//if you call method it will give some data //work is only to return the 
@FunctionalInterface
public interface Supplier <T> {
	public T get();

}

//supplier
//it is an functional interface present inside java.util.function
//it is used to  get the data or to return the data example--> our supplier class

