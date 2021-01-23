import static org.junit.Assert.*;
import org.junit.Test;

// examples of the snake games
public class SnakeWorldExamples {
	IBody b1 = 
			new ConsBody(new CartPt(4,1), 
			new ConsBody(new CartPt(3,1), new MTBody()) );
	Snake s1 = new Snake(new CartPt(5,1), b1, new DirUp());
	SnakeWorld w1 = new SnakeWorld(s1);

	IBody b2 = 
			new ConsBody(new CartPt(4,1), 
			new ConsBody(new CartPt(4,2), 
			new ConsBody(new CartPt(4,3), new MTBody())));
	Snake s2 = new Snake(new CartPt(5,1), b2, new DirDown());
	SnakeWorld w2 = new SnakeWorld(s2);
	

	@Test
	public void testMove() {
		IBody b1After = 
				new ConsBody(new CartPt(5,1), 
				new ConsBody(new CartPt(4,1), new MTBody()) );
		Snake s1After = new Snake(new CartPt(5,0), b1After, new DirUp());
		assertEquals(s1After, s1.move());
		
		IBody b2After = 
				new ConsBody(new CartPt(5,1),
				new ConsBody(new CartPt(4,1), 
				new ConsBody(new CartPt(4,2), new MTBody())));
		Snake s2After = new Snake(new CartPt(5,2), b2After, new DirDown());
		assertEquals(s2After, s2.move());
	}
	
	@Test
	public void testIsBodyAt() {
		assertEquals(false, s1.isBodyAt(new CartPt(0,0)));
		assertEquals(true,  s1.isBodyAt(new CartPt(3,1)));
	}
}
