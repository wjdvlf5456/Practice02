package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		//문제 9번 : 두 개의 정수를 입력받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
		// (0은 입력하지 않습니다.)
		
		/*
		1. 두 개의 변수를 입력하는 칸을 사용하고 먼저 큰 수 인지 작은 수 인지 분류한다.
		2. 그 아래 분류로 나온 수를 작은수로 큰 수를 % 한다.
		3. %된 값이 0인지 아닌지 true false를 결정한다. 
		 
		마지막에 결과를 출력할 때는 '작은 변수' 는 '큰 변수'의 약수가 아니다. 또는 입니다. 라고 출력한다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		
		//변수1이 변수2보다 큰경우
		if (num1>num2 && num1%num2==0) {
				System.out.print(num1+" 는(은) "+num2+" 의 약수입니다.");
				
		} else if (num1>num2 && num1%num2!=0){		
			System.out.print(num1+" 는(은) "+num2+" 의 약수가 아닙니다.");
				
		//변수2가 변수1보다 큰경우
		} else if (num2>num1 && num2%num1==0){
			System.out.print(num2+" 는(은) "+num1+" 의 약수입니다.");
			
		} else {
			System.out.print(num2+" 는(은) "+num1+" 의 약수가 아닙니다.");
		}
		
		sc.close();

	}

}
