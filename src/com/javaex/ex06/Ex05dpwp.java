package com.javaex.ex06;

public class Ex05dpwp {
	public static void main(String[] agre) {

		int[] a = new int[6];

		for (int i = 0; i < 6; i++) {

			a[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < 6; j++) {
				if (a[i] == a[j] && i != j) {

					i--;
				}

			}
		}

		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}
	}
}
