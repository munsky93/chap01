package com.javaex.ex02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] arge) {

		Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();

		System.out.println("월을 입력하세요");

		switch (month) {

		case 1:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		case 3:
			System.out.println("31일");
			break;
		case 4:
			System.out.println("30일");
			break;
		case 5:
			System.out.println("31일");
			break;
		case 6:
			System.out.println("30일");
			break;
		case 7:
			System.out.println("31일");
			break;
		case 8:
			System.out.println("31일");
			break;
		case 9:
			System.out.println("30일");
			break;
		case 10:
			System.out.println("31일");
			break;
		case 11:
			System.out.println("30일");
			break;
		case 12:
			System.out.println("31일");
			break;

		}

		sc.close();
	}
}
