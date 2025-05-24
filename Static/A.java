package Static;

public interface A {
	int a=10;

	public int print(int a); 
		public default void m1(String value) 
		{
			System.out.println(a);
		}
		public static void m2()
		{
			System.out.println("A interface");
		}

}

