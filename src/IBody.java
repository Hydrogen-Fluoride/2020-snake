/** a body of snake */
public interface IBody {
	// thisをcに連なるIBodyと見たとき一つ動かしてかえす
	// to move this body at the given position; 
	// i.e., to create a body beginning at the given position,
	// followed by this body excluding the last position.
	public IBody move(CartPt position);

	// to determine whether the given location is occupied by 
	// this body (including subsequent body parts). 
	public boolean isNodeAt(CartPt location);
}
