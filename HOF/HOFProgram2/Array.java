package HOFProgram2;
//geeneric is only for non static 
public class Array <T> {
	public void forEach(T []a,Calci c) {
		for (T i:a) {
			c.m1(i);
			
		}
		
	}

}
