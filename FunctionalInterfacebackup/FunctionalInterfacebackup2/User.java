package FunctionalInterfacebackup2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class User {
public static void main(String[] args) {
ArrayList<Student>	al=new ArrayList();
al.add(new Student(3,"Allen",20));
al.add(new Student(2,"miller",19));
al.add(new Student(1,"king",18));
//Collections.sort(null);//it will take list reference ,it comparing obj reference
System.out.println(al);
//--------------------------------------by using subclass-----------------------------------------
//al.sort(new SortByAge());
//System.out.println(al);


//---------------------------------------by using anonymus class-----------------------------------

Comparator<Student> obj=new Comparator<Student>() {
	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		//return o1.getName().compareTo(o2.getName()); 
		//return o1.getId()-o2.getId();
		return o1.getAge()-o2.getAge();
		
	}
};
System.out.println("after sorting");
al.sort(obj);
System.out.println(al);


}
}
