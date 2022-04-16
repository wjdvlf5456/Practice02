package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		// \t 하나만 사용하였을 때는 들여쓰기가 0칸이였으나 \t\t로 2개를 사용하니 8간이 띄어졌다.
		if (num1>num2) {
			System.out.print("큰수: "+num1+"\t\t작은수: "+num2);
			
		} else if (num1<num2) {
			System.out.print("큰수: "+num2+"\t\t작은수: "+num1);
			
		
		} else {
			 System.out.print("큰수: "+num1+"\t\t작은수: "+num2);
			 
		}
		System.out.println("입니다.");
		
		sc.close();

	}

}
