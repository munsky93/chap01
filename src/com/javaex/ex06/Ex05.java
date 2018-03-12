package com.javaex.ex06;

public class Ex05 {

	public static void main(String[] args) {
		
	 int[] lottoNums = new int[6];
	 
	 for(int i = 0; i < 6; i++) {
		 
		 lottoNums[i] = (int)(Math.random()*45)+1;

		 for(int j = 0; j < 6; j++) {
			 
			 if(lottoNums[i] == lottoNums[j] && i != j) {
				
			   i--;
			 }	
		 }
	 }
	 
	 for(int i = 0; i < 6; i++) {
		 System.out.println(lottoNums[i]);
	 }
	}

}
