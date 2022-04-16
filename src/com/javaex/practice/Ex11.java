package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		/*
		문제 11번: 알파벳을 입력받아 자음 모음을 구분하세요.
		
		switch~case문을 사용합니다.
		영문 소문자 이외의 입력값은 고려하지 않습니다.
		 */
		
		/*
		문제풀이 
		
		1. 변수는 하나만 입력하고 글자를 하나만 입력하니 char을 사용해준다.   ---->  char을 사용하려 했으나 nextChar이 없어 String sc.nextLine(); 을 사용하였다.
		2. switch 안에서 case 를 여러개 만든 후 자음과 모음은 break로 나누어준다.
		
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		
		System.out.print("알파벳:");
		String alphabet = sc.nextLine();
		
		switch (alphabet) {						//--> 문자 입력때는 "" 사이에 입력
			case "a": 
			case "e": 
			case "i": 
			case "o": 
			case "u": 
				System.out.println("모음입니다.");
				break;
	
			default:
				System.out.println("자음입니다.");
				break;
		}
		
		sc.close();

	}

}
