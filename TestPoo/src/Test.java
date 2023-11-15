import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		HelloW obj = new HelloW();
		int s = obj.square(4);
		assertEquals(16, s);
	}

}
