package com.javaex.ex02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] arge) {

		Scanner sc = new Scanner(System.in);

		int code = sc.nextInt();

		switch (code) {
		case 1:
			System.out.println("101호");
			break;
		case 2:
			System.out.println("202호");
			break;
		case 3:
			System.out.println("303호");
			break;
		case 4:
			System.out.println("404호");
			break;
		default:
			System.out.println("상담원");

		}

		sc.close();

	}
}
