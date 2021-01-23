import colors.*;
import draw.*;

/** a node added to a snake body */
public class ConsBody implements IBody {
	CartPt fst;
	IBody rest;
	
	ConsBody(CartPt fst, IBody rest) {
		this.fst = fst;
		this.rest = rest;
	}
	
	public IBody move(CartPt c) {
		return new ConsBody(c, rest.move(fst));
	}

	@Override
	public boolean isNodeAt(CartPt location) {
		// this.fst CartPt
		// this.rest CartPt
		return this.fst.equals(location) ||
				this.rest.isNodeAt(location);
	}

	@Override
	public boolean draw(Canvas c, int cell_size, IColor color) {
		return c.drawDisk(this.fst.scale(cell_size).shift(cell_size/2,  cell_size/2).toPosn(),
				cell_size/2, color) &&
				this.rest.draw(c, cell_size, color);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fst == null) ? 0 : fst.hashCode());
		result = prime * result + ((rest == null) ? 0 : rest.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsBody other = (ConsBody) obj;
		if (fst == null) {
			if (other.fst != null)
				return false;
		} else if (!fst.equals(other.fst))
			return false;
		if (rest == null) {
			if (other.rest != null)
				return false;
		} else if (!rest.equals(other.rest))
			return false;
		return true;
	}

}
