package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		/*
		문제 10번 : 사번(양의 정수)을 입력하면 팀을 확인 할 수 있는 프로그램을 작성하세요.
		
		1. 팀은 A팀,B팀,C팀 3개의 팀으로 구성합니다.
		2. 팀을 방식은 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀으로 구분합니다.
		3. 0은 고려하지 않습니다.
		*/
		
		/*
		문제풀이 
		1. 변수는 하나만 입력한다.
		2. 변수를 변수%3==0,1,2 세가지의 경우로 나누어 준다.
		3. 그래서 if, else if, else 를 1번씩 사용하여 결과를 출력하게 한다.
		
		
		//2. 조건을 변수1% && 변수2==0,1,2 3가지로 나누어서 출력하게 한다.   --> 변수 하나만 사용  --   틀림
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번을 입력하세요.");
		System.out.print("사번: ");
		int num = sc.nextInt();
		
		if (num%3==0) {
			System.out.print("A");
			
		} else if (num%3==1){
			System.out.print("B");
			
		} else {
			System.out.print("C");
			
		}
		
		System.out.println("팀입니다.");
		sc.close();
		
	}

}
