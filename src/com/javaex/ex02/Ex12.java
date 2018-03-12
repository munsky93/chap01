package com.javaex.ex02;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] arge) {

		Scanner sc = new Scanner(System.in);

		System.out.println("단을 입력해주세요");

		int code = sc.nextInt();                    // code = dan
									                // code = 8, i=12345~~, (code*i)=값

		int i = 1;

		while (i < 10) {
			System.out.println(code + "*" + i + "=" + (code * i));

			++i;            //<------중요!!!

		}

		sc.close();
	}
}
