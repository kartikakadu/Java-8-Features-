package java8featuresDefaultmethod;

public interface Demo {
	public default String print(String value) {
		return value.toUpperCase();
		
	}
	public String test(String value);
		
	}


