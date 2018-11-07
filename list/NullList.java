package list;

public class NullList extends List {
	public NullList() { }

	@Override
	public boolean isNull() { return true; }

	@Override
	public boolean isPair() { return false;	}

	@Override
	public String toString() {
		return "()";
	}
	
}
