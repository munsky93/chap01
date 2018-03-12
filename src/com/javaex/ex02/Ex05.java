package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] arge) {
          
		
		Scanner sc = new Scanner(System.in);
		int point  = sc.nextInt();
		
		
	    if(point > 0 && point%2 == 0) {                                //if(point > 0)
	    	System.out.println("짝수");                                    //if(point 2% == 0)
	    } else if(point > 0 && point%2 !=0){                                //System.out.println("짝수");
	    	System.out.println("홀수");               
	    } else if(point < 0 ) {
	        System.out.println("음수");
        } else if(point == 0 ) {
        	System.out.println("0");
        }
		
		
		
		
		sc.close();
		
	
	}

}
