package HOF3;

import HOFProgram2.Calci;

public class Array2<T> {
	public void forEach(T []a,Calci c) {
		for (T i:a) {
			c.m1(i);
			
		}
		
	}

}
//with the help of functional interface we can achieve functional programming
