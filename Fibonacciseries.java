package assignment_week1;

import java.util.Iterator;

public class Fibonacciseries {

	
	
	
	public static void main(String[] args) {
		
		int a = 0 , b = 1;
		 System.out.println(a);
		 System.out.println(b);
		 
		 for (int i = 2; i < 7; i++) {
			  int next = a+b;
			  System.out.println(next);
			  
			  a=b;
			  b=next;
			
		}
	}
}	