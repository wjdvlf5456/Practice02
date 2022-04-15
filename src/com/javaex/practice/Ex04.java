package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if (65>age) {							//--> 여기서 65미만의 정수는 모두 여기서 인식되어 아래의 age>=19를 제대로 인식하지 못한다.
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
