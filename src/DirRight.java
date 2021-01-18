/** right direction */
public class DirRight implements IDirection {
	DirRight(){}

	@Override
	public int deltaX() {
		return 1;
	}

	@Override
	public int deltaY() {
		return 0;
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
