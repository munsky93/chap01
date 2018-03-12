package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		if (point >= 60) {
			System.out.println("합격");

		} else {
			System.out.println("불합격");

		}

		sc.close();

	}
}