package HOF4;

import java.util.ArrayList;

public class Test4 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(-1);
		al.add(-2);
		al.add(3);
		al.add(4);
		
//		System.out.println(Array.filter(al, i->i%2==0));
//		System.out.println(Array.filter(al, i->i>0));
//		System.out.println(Array.filter(al, i->i%3==0));
	//data will not be change it will gives existing array elements
		//array,set,map,are the sequence of element, stream can be apply for collections, array and map
		
		//create an hof which takes arraylist element as an input an perform arithmetic operations on every single elements of an arraylist and return a new arraylist 
		
	System.out.println(Array.map(al, i->i*i));
	System.out.println(Array.map(al, i->i*i*i));
	
	}
	

}
