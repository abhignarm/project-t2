package group_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_case {

	@Test
	public void test() {
		Test_method test1 = new Test_method();
		int output = test1.power4(10);
		assertEquals(10000,output);
	}
	@Test
	 public void testAddingTwoPositiveIntegers() throws Exception {
	        
		 Test_method s  = new Test_method();
	        int output = s.add(3, 4);
	        assertEquals(7, output);
	    }
	@Test
	 public void testAddingTwoNegativeIntegers() throws Exception {
		 Test_method t = new Test_method();
	        int output = t.add(-4,-3);
	        assertEquals(-7, output);
	    }
	@Test
	 public void testAddingNegativeIntegerToPositiveInteger() throws Exception {
		 Test_method r = new Test_method();
	        int output = r.add(-10,11);
	        assertEquals(1, output);
	    }
	@Test
	 public void test1() {
		 Test_method test =new Test_method();
			int output = test.countA("javabeAn");
			assertEquals(3,output);
		}
	@Test
      public void test2() {
    	  Test_method test = new Test_method();
    	  String output = test.even(4);
    	  assertEquals("even",output);
    	  
    	  
      }
	@Test
      public void test3() {
    	  Test_method test = new Test_method();
    	  int output = test.Area_rectangle(4,5);
    	  assertEquals(20,output);
    	  
    			
      }
	@Test
      public void test4() {
    	  Test_method test = new Test_method();
    	  int output = test.fact(5);
    	  assertEquals(120,output);
      }

	

	
	}


