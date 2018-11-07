package list;

public class Pair<T> extends List {
	private T first;
	private List second; 

	public Pair(T first, List second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		
		return "(" + first + ", " + second.toString() + ")";
	}
	
	@Override
	public boolean isNull() { return false; }

	@Override
	public boolean isPair() { return true; }

//	@Override
	public T first() { return first; }

//	@Override
	public List second() { return second; }


}
