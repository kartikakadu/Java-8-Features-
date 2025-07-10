package FunctionalInterfacebackup;
//we provide implementation to our abstract class ->disadvantage of anonymous class

public class Driver {
	public static void main(String[] args) {
		Demo obj=new Demo() {
			public void print() {
				System.out.println("from demo");
			}

			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("from test");
			}
		};
		System.out.println(obj);
		obj.print();
		obj.test();
	}

}
