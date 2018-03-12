package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		
        int i = sc.nextInt();

		int j = 0;

		for (int a = 0; a < 5; a++) {
			System.out.print("숫자:");

			

			if (i > j)
				j = i;
		}
		System.out.println("최대값은" + j + "입니다.");

	}

}
