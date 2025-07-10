package Own_Stream2;

import java.util.ArrayList;
import java.util.function.Predicate;

import ConsumerProgram2.Consumer;
import HOF4.Function;

public class IntStream {
	private ArrayList<Integer> li;
	private IntStream(ArrayList<Integer> li) {
		this.li =li;
		
	}
	public static IntStream of(ArrayList<Integer> li) {
		return new IntStream(li);
	}
	public void forEach(Consumer<Integer> c) {
		for (int i:li) {
			c.accept(i);
		}
	}
	public IntStream filter(Predicate<Integer> p) {
		ArrayList <Integer> res=new ArrayList<Integer>();
		for(int i:li) {
			if(p.test(i)) {
				
			}
		}
		return new IntStream(res);
	}
	public IntStream map(Function<Integer,Integer> f) {
		ArrayList<Integer> res=new ArrayList<Integer>();
		for(int i:li) {
			f.apply(i);
		}
		return new IntStream(res);
	}

}
