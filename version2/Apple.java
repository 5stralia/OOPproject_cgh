package version2;

public class Apple extends Fruit implements Comparable<Apple> {
	public Apple(int size) {
		super("Apple", size);
	}

	@Override
	public int compareTo(Apple a) {
		return super.compareTo(a);
	}
}
