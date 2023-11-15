import static org.junit.Assert.*;

import org.junit.Test;

public class Test02 {

	@Test
	public void test() {
		HelloW obj = new HelloW();
		boolean s = obj.bol(-1);
		assertTrue(s);
	}

}
