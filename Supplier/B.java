package Supplier;

import java.time.LocalDate;

public class B implements Supplier <LocalDate>{

	@Override
	public LocalDate get() {
		// TODO Auto-generated method stub
		return LocalDate.now();
	}
	public static void main(String[] args) {
		Supplier <LocalDate> obj=new B();
		System.out.println(obj.get());
	}
	
	

}
