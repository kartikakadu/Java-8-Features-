package HOF4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Array {
//	public static List<Integer> filter(ArrayList<Integer> a,Predicate<Integer > p){
//		ArrayList<Integer> res=new ArrayList<Integer>();
//		for (int i:a) {
//			if(p.test(i)) {
//				res.add(i);
//			}
//		}
//		return res;
	//}
	public static List<Integer> map(ArrayList<Integer>a,Function<Integer,Integer> f){
		ArrayList<Integer> res=new ArrayList<Integer>();
		for (int i:a) {
			res.add(f.apply(i));
			}
		
		return res;
}
	}


	