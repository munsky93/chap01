package com.javaex.ex05;

public class Ex02 {
 public static void main(String[] agre) {
	 
	int[] intArray = new int[5];
	
	intArray[0] = 3;
	intArray[1] = 6;
	intArray[2] = 9;
	intArray[3] = 2;
	intArray[4] = 55;
	
/*	System.out.println(intArray[0]);                   //주석 식을 밑에 for문으로 바꿔 쓸 수 있다 
	System.out.println(intArray[1]);
	System.out.println(intArray[2]);*/
	
	
	for(int i = 0; i < intArray.length; i++) {      //intArray.legth 는 배열의 길이를 뜻함 (위에 5를 뜻함)
		System.out.println(intArray[i]);            //i = [0~4]를 뜻한다 !!
		
	}
	
	
	
 }
}
