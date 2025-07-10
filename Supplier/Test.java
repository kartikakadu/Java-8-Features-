package Supplier;

import java.time.LocalDate;

//using lambda exp
//inside java.util.function we have supplier,function and predicate
public class Test {
	public static void main(String[] args) {
		Supplier <LocalDate>obj=()->{return LocalDate.now();};
		System.out.println(obj);
		System.out.println(obj.get());
	}
}
