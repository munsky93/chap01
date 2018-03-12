package com.javaex.ex02;

public class Ex15 {
	public static void main(String[] agre) {
	
		   
		   
		   for(int i=1; i<=20; i++) {
			   
			   if(i%2==0 || i%3==0) {
				   continue;
			   } else {
				   System.out.println(i);
			   }
		   }
	}

}
