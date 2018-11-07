package version3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Apple a1 = new Apple(1); 
		Apple a2 = new Apple(2);
		Orange o3 = new Orange(3);
		Orange o4 = new Orange(4);
		
		List<Apple> apples = Arrays.asList(a1, a2);
		System.out.println(Collections.max(apples));
		
		List<Orange> oranges = Arrays.asList(o3, o4);
		System.out.println(Collections.max(oranges));
		
		List<Fruit> mixed = Arrays.<Fruit>asList(a1,o3);
		//System.out.println(Collections.max(mixed));			// compile-time error
		System.out.println(Collections.max(mixed, new MixedComparator()));
	}
	
	
}
