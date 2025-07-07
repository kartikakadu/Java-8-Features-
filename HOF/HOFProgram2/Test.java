package HOFProgram2;
//array wont support generics 
public class Test {
public void main(String[] args) {
	double [] a= {1,2,3,4};
	 Array.forEach(a,i->System.out.println(i));
	
}
}

//create an hof to remove even elements from an array list and return the array list