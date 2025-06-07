package Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
public class DriverToConvertArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
//		Consumer<Integer> consumer=i->System.out.println(i*i);
//	  al.forEach(consumer);
		//or only this below line 
	 al.forEach(i->System.out.println(i*i));
	 al.forEach(i->System.out.println(i*3));
	}

}
