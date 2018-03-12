package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {

	int j =0;
	int k =0;
	int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 3 == 0) {
				                        // data[i] 3으로 나눈다. //i가 (인덱스 번호)
				j = j+1; 
				k = k+data[i];
	  }
	}
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + j);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + k );

	}

}
