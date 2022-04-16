package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문제: 두 개의 정수를 입력받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요.
		
		/*
		먼저 두 개의 정수를 입력할 수 있는 입력공간을 스캐너와 함께 만들어 준 후 그 안에서 큰수와 작은수로 나누는 경우를 만들어 준다.
		그 후 그 3가지 경우에 몫과 나머지가 어떻게 출력될지 변수를 넣어준다. 
		*/
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			
			
		} else if (num2>num1) {	
			
			
		}
		
		
		
		sc.close();

	}

}
