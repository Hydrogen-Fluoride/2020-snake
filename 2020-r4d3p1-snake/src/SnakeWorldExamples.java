import static org.junit.Assert.fail;
import org.junit.Test;

class SnakeWorldExamples {
	IBody b1 = 
			new ConsBody(new CartPt(4,1), 
			new ConsBody(new CartPt(3,1), new MTBody()) );
	Snake s1 = new Snake(new CartPt(5,1), b1, new DirUp());
	SnakeWorld w1 = new SnakeWorld(s1);

	IBody b2 = 
			new ConsBody(new CartPt(4,1), 
			new ConsBody(new CartPt(4,2), 
			new ConsBody(new CartPt(4,3), new MTBody())));
	Snake s2 = new Snake(new CartPt(5,1), b1, new DirDown());
	SnakeWorld w2 = new SnakeWorld(s2);
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
