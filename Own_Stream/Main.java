package Own_Stream;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	
StreamInt.of(al)
.filter(i->i%3==0)
.map(i->i*i)
.forEach(System.out::println);
	}
}
//create acustom stream for double data type 
//create custom stream for string data type