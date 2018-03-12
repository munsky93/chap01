package com.javaex.ex02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] arge) {

		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요 :");

		int code = sc.nextInt();

		switch (code) {

		case 15:
			System.out.println("3의 배수 입니다.");
			break;

		case 55:
			System.out.println("55은 3의 배수가 아닙니다.");
			break;

		}

		sc.close();

	}
}
