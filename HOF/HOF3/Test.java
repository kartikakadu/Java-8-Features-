package HOF3;


import java.lang.reflect.Array;
import java.util.ArrayList;

//functional program ->1 st language support is c language 


public class Test {
	
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	
	
	//Array.forEach(al,i->System.out.println(i));
	Array.forEach(al);

}
}
