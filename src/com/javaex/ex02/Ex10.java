package com.javaex.ex02;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] agre) {

		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요 :");

		int code = sc.nextInt();

		if (code >= 90) {                                   //이것도 가능함 else if (code >= 80) {      
			System.out.println("A등급");               
		} else if (code < 90 && code >= 80) {            
			System.out.println("B등급");              
		} else if (code < 80 && code >= 70) {
			System.out.println("C등급");
		} else if (code < 70 && code >= 70) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}

		sc.close();

	}
}
