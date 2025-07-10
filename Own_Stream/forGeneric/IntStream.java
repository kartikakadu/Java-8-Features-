package Own_Stream.forGeneric;

import java.util.ArrayList;
import java.util.function.Predicate;

import ConsumerProgram2.Consumer;



public class IntStream<T> {
	private ArrayList<T> li;
	private IntStream(ArrayList<T> li) {
		this.li =li;
		
	}
	public static <T> IntStream of(ArrayList<T> li) {
		return new IntStream(li);
	}
	
	
	public void forEach(Consumer<T> c) {
	for(T i: li) {
		c.accept(i);
				
			}
		}
	}

	