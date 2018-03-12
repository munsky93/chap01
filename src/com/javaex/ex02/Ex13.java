package com.javaex.ex02;

import java.util.Scanner;

public class Ex13 {
 public static void main(String[] agre) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("단을 입력해주세요");
	 System.out.println("단 : ");
	 
	 int code = sc.nextInt();
	 int i = 1;
	 
	 for(code=8; i < 10; i++)
		 
		
		System.out.println(code + "*" + i + "=" + (code*i));
		
		
		
		
		sc.close();
	 }
 }
