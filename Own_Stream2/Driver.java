package Own_Stream2;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		
		//IntStream.of(li).filter(i->i%2==0).forEach(System.out::println);
		IntStream.of(li).filter(i->i%2==0).map(i->i*i).forEach(System.out::println);
	} 

}
//array ,arraylist,map ->to convert we use of method
//stream initialization+stream intermediate+terminal operation=we call it as stream pipeline
