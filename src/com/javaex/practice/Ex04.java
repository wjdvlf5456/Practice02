package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if (65>age) {
			System.out.print("1번그룹");
			
		} else if (age>=19) {
			System.out.print("1번그룹");
		
		} else {
			System.out.print("2번그룹");
			
		}
		
		System.out.println(" 입니다.");
		
		sc.close();

	}

}
