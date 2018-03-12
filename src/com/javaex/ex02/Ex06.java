package com.javaex.ex02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] arge) {

		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.println("과목번호 : ");

		if (point == 1) {
			System.out.println("R101");
		} else if (point == 2) {
			System.out.println("R202");
		} else if (point == 3) {
			System.out.println("R303");
		} else if (point == 4) {
			System.out.println("R404");
		} else {
			System.out.println("상담원에게 문의하세요");
		}

		sc.close();

	}

}
