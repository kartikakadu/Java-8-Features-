package FunctionalInterfacebackup2;

import java.util.Comparator;

public class SortById implements Comparator <Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
	
		return o1.getId()-o2.getId();//it will sort data in ascending order
	}

}
