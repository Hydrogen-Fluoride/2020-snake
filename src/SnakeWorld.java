import colors.*;
import draw.*;

/** the world of the snake game */
public class SnakeWorld {
	Snake s;
	// Apples a;
	int WIDTH = 30;
	int HEIGHT = 30;
	int CELL_SIZE = 20;
	IColor BACK_COLOR = new Blue();
	public SnakeWorld(Snake s) {
		super();
		this.s = s;
	}
	
	// to draw this snake world on the given canvas c
	boolean draw(Canvas c) {
		return this.drawBackground(c) &&
				this.s.draw(c, this.CELL_SIZE);
	}
	
	// to draw the background of this snake world on the given canvas c
	private boolean drawBackground(Canvas c) {
		return c.drawRect(new CartPt(0,0).toPosn(), this.WIDTH*this.CELL_SIZE, this.HEIGHT*this.CELL_SIZE, this.BACK_COLOR);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BACK_COLOR == null) ? 0 : BACK_COLOR.hashCode());
		result = prime * result + HEIGHT;
		result = prime * result + WIDTH;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
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
		SnakeWorld other = (SnakeWorld) obj;
		if (BACK_COLOR == null) {
			if (other.BACK_COLOR != null)
				return false;
		} else if (!BACK_COLOR.equals(other.BACK_COLOR))
			return false;
		if (HEIGHT != other.HEIGHT)
			return false;
		if (WIDTH != other.WIDTH)
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
}
