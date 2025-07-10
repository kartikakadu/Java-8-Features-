package Consumer.student;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayList<Student> al=new 	ArrayList();
		al.add(new Student (5,"miller",20));
		al.add(new Student(2,"king",18));
		al.add(new Student(3,"Allen",19));
		//comparator which is taking 2 args and predicateand consumer takes only one args
		
		Comparator<Student>compName=(s1,s2)->
		s1.getName().compareTo(s2.getName());
		
		
		Comparator<Student> compareId=(s1,s2)->
		s1.getId()-s2.getId();
		
		Comparator<Student> comparePercentage=(s1,s2)->
		s1.getId()-s2.getId();
		
		
		al.sort(comparePercentage);
		al.forEach(i->System.out.println(i));
	}

}
