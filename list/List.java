package list;

public abstract class List {
	public abstract boolean isNull();
	public abstract boolean isPair();

	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("[");
		
		List list = this;
		
		while ( list.isPair() ) {   // list.isNull() == false
			Pair pair = (Pair)list;
			
			sb.append(pair.first());
			if (pair.second() instanceof NullList)  // pair.second().isNull() == false
				sb.append(", ");
			list = pair.second();
		}
		
		sb.append("]");		
		
		return sb.toString();
	}
	
	public int length() {
		// initialize something ...
		int len = 0;
		List list = this;
		while ( list instanceof Pair) {  // list.isPair() 
			Pair pair = (Pair)list;
			// do something
			len++;
			list = pair.second();
		}
		
		// finalize something...
		return len;
	}
	
	public List reverse() {
		List result = new NullList();
		List list = this;
		while (!list.isNull()) {
			Pair pair = (Pair)list;
			result = new Pair(pair.first(), result);
			list = (pair.second());
		}

		return result;
	}
	
	public List concat(List l) {
		if (this.isNull()) return l;
		Pair pair = (Pair)this;
		return new Pair(pair.first(), pair.second().concat(l));
	}
}
