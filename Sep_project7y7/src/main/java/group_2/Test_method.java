package group_2;

public class Test_method {
          public int power4(int x) {
        	 return x*x*x*x;
        	 
          }
          public int add(int a, int b) {
              return a + b;
          }
          public int countA(String words) {
      		int t=0;
      		for(int i = 0;i <words.length();i++) {
      			if(words.charAt(i)=='a' || words.charAt(i)=='A') {
      				t++;
      			}
      		}
      		return t;
}
          public String even(int a) {
        	  if(a%2 ==0) {
        	 return "even";}
        	 else {
        		 return "odd";
        	 }
        		  
        	  }
          public int Area_rectangle(int length, int breadth) {
        	  int area;
        	  area = length*breadth;
        	  return area;
        	  
          }
          public int fact(int a) {
        	  int factorial=1;
        	  if (a!=1 && a!=0) {
        	  factorial = a*fact(a-1);}
        	  return factorial;
          }
}


