package Own_Stream.forGeneric;

import java.util.ArrayList;

import Own_Stream2.IntStream;

public class Driver {
	public static void main(String[] args) {
		ArrayList<String> li=new ArrayList();
		li.add("AB");
		li.add("ABC");
		li.add("ABCD");
		li.add("ABCDE");
		
		IntStream.of(li).
		forEach(System.out::println);
	} 

}
//IntStream.of(li).filter(i->i%2==0).map(i->i*i).forEach(System.out::println);