package FunctionalInterfacebackup2;

import java.util.Comparator;

public class SortByAge implements Comparator <Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return  o1.getAge()-o2.getAge();
	}

}
