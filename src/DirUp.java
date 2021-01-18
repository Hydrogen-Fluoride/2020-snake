/** upward direction */
public class DirUp implements IDirection {
	DirUp(){}
	@Override
	public int deltaX() {
		return 0;
	}

	@Override
	public int deltaY() {
		return -1;
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
