package com.javaex.ex02;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] agre) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			   System.out.println("숫자를 입력하세요");
			
			   int code = sc.nextInt();
			   
			   if (code == 0) {
				 System.out.println("종료");
				break;
			} else if (code % 3 == 0) {
				System.out.println("3의 배수입니다.");
              
			} else  {
				System.out.println("3의 배수아닙니다.");
              
			} 

		}

		sc.close();
	}
}
