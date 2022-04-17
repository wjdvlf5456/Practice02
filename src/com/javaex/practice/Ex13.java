package com.javaex.practice;

import	java.util.Scanner;

public class Ex13 {
	
	public static void main(System[] args) {
		
		/*
		문제13번: 다음과 같이 정의되는 함수의 함수값을 계산해보자.
		
		 f(𝑋) =  𝑋³ - 9𝑋 + 2, 𝑋 ≤ 0
		 f(𝑋) =		   7𝑋 + 2, 𝑋 > 0
		 
		*/
		
		/*
			문제예상: 0이하의 숫자를 넣었을 때에는 𝑋³ - 9𝑋 + 2 의 식이 적용되게 해주면 되고
					양수를 넣었을 때에는 7𝑋 + 2 가 적용되게 해주면 된다.
		 */
		
		//====================== 문제풀이 시작 ======================
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		
		System.out.print("숫자: ");
		double num = sc.nextDouble();
		
		double result;
		
		if (num<=0) {
			result = num*num*num-9*num+2;
			System.out.print("계산결과는 "+result+" 입니다.");
		} else if(num>0) {
			result = 7*num+2;
			System.out.print("계산결과는 "+result+" 입니다.");
		}
		
		sc.close();
		
	}

}
