package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문제: 두 개의 정수를 입력받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요.
		
		/*
		먼저 두 개의 정수를 입력할 수 있는 입력공간을 스캐너와 함께 만들어 준 후 그 안에서 큰수와 작은수로 나누는 경우를 만들어 준다.
		그 후 그 3가지 경우에 몫과 나머지가 어떻게 출력될지 변수를 넣어준다.
		
		if문 속에 if문을 넣는게 아니라 출력되는 경우를 두개 만들어준다.
		*/
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println ("몫: "+num1/num2);
			System.out.println ("나머지: "+num1%num2);
			
		} else if (num2>num1) {	
			System.out.println ("몫: "+num2/num1);  //-->num2가 더 크니 두 변수의 위치를 바꾸어줘야했다.
			System.out.println ("나머지: "+num2%num1);
			
			
		} else {
		System.out.println ("몫: "+num1/num2);
		System.out.println ("나머지: "+num1%num2);
		
		}
		
		sc.close();

	}

}
