package group_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_case {

	@Test
	public void test() {
		Test_method test1 = new Test_method();
		int output = test1.square(10);
		assertEquals(100,output);
	}

}
