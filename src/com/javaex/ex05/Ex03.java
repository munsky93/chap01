package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] agre) {
		
		int[] lottoNums = new int[6];       //lottoNums == 주소!!!
	
		 for(int i = 0; i < 6; i++) {       //for(int i = 0; i < lottoNums.lenght; i++
			
			 lottoNums[i] = (int)(Math.random()*45)+1; 
			 
			 
		 } 
		 
		 for(int i = 0; i < 6; i++) {
			 System.out.println(lottoNums[i]);
		 }
	}
}
