package Own_Stream;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

import HOF4.Function;

public class StreamInt {
	private ArrayList<Integer> al;
	private StreamInt(ArrayList<Integer> al) {
		this.al=al;
	}
	//factory method
	//stream initialization
	public static StreamInt of(ArrayList<Integer> al) {
		return new StreamInt(al);
	}
	public void forEach(Consumer<Integer> c) {
		for(int i:al) {
			c.accept(i);
		}
	}
	
	public StreamInt filter(Predicate<Integer> p) {
		ArrayList<Integer> filter=new ArrayList();
		for(int i:al) {
			if(p.test(i)) {
				filter.add(i);
			}
		}
		return new StreamInt(filter);
	}
	public StreamInt map(Function<Integer,Integer>f) {
		ArrayList<Integer> map=new ArrayList();
		for(int i:al) {
			map.add(f.apply(i));
		}
		return new StreamInt(map);
	}

}
