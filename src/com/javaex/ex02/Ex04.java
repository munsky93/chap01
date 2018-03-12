package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] arge) {

		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		if (point > 0) {
			System.out.println("양수");
		} else if (point < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0 임");

		}

		sc.close();

	}

}
