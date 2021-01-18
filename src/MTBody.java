/** an empty body of snake */
public class MTBody implements IBody {
	MTBody() {}
	
	public IBody move(CartPt c) {
		return new MTBody();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}
