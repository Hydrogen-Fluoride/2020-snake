import colors.*;

/** a snake */
public class Snake {
	CartPt head;
	IBody body;
	IDirection d;

	IColor HEAD_COLOR = new Cyan();
	IColor BODY_COLOR = new Green();

	Snake(CartPt head, IBody body, IDirection d) {
		this.head = head;
		this.body = body;
		this.d = d;
	}
	//return moved snake for a direction 
  public Snake move(){
	  /*
	   * this.head // CartPt
	   * this.body // Ibody
	   * this.d // IDirection
	   */
	  return new Snake(
//			  this.d.move(this.head)
			  this.head.move(this.d),
			  this.body.move(this.head), 
			  this.d);
  }
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((d == null) ? 0 : d.hashCode());
		result = prime * result + ((head == null) ? 0 : head.hashCode());
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
		Snake other = (Snake) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (d == null) {
			if (other.d != null)
				return false;
		} else if (!d.equals(other.d))
			return false;
		if (head == null) {
			if (other.head != null)
				return false;
		} else if (!head.equals(other.head))
			return false;
		return true;
	}
}
