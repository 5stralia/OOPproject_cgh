package list;

public class Main {

	public static void main(String[] args) {
		// [1,2,3,4,5] 
		List list1 =
			new Pair(1,
				new Pair(2,
					new Pair(3,
						new Pair(4,
							new Pair(5,
								new NullList())))));
		// []
		List list2 = new NullList();
		
		// ["Playing", "With", "Java"]
		List list3 = new Pair("Playting",
								new Pair ("With",
									new Pair ("Java",
										new NullList())));
		
		// list3 = [10,11]
		List list4 = new Pair(10,
								new Pair(11,
									new NullList()));
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		System.out.println(list1.reverse().reverse());
		System.out.println(list1.concat(list3.reverse()));
		
		System.out.println(take(2, list1));
		System.out.println(drop(2, list2));
	}

	public static List take(int n, List l) {
		if (n == 0 || l.isNull()) return new NullList();
		Pair pair = (Pair)l;
		return new Pair(pair.first(), take(n - 1, pair.second()));
	}

	public static List drop(int n, List l) {
		if (n < 0 || l.isNull()) return new NullList();
		Pair pair = (Pair)l;
		while (n-- > 0) {
			l = pair.second();
		}

		return l;
	}
}
