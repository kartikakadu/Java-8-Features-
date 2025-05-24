package Static;

public class C  implements A{
	@Override
	public int print(int a) {
		System.out.println(a/2);
		return 0;
	
	}
	
public static void main(String[] args) {
	A obj=new C();
	obj.print(a);
	obj.m1("1000");
	A.m2();
}

}
