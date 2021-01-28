import colors.IColor;
import draw.Canvas;

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

	@Override
	public boolean isNodeAt(CartPt location) {
		return false;
	}

	@Override
	public boolean draw(Canvas c, int cell_size, IColor color) {
		return true;
	}
}
