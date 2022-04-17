package com.javaex.practice;

import	java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		/*
		문제14번: 다음과 같이 수익을 입력받아 소득세를 계산하는 프로그램을 작성하세요.
			
			1. 0원이상 1000만원 이하인 경우 tax: 0.09*수익
			2. 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18(수익-1000)
			3. 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
			4. 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
		*/
		
		
		/*
		문제풀이 예상
			음수를 포함하여 입력되는 숫자의 경우의 수는 5가지로 나누어주어 만들어준다.
			그리고 입력되는 변수는 하나뿐이니 switch ~ case 문으로 작성하여도 된다.
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("수익을 입력해 주세요");
		
		System.out.print("금액");
		int cash = sc.nextInt();
		
		if (cash>=8000) {
			
			
		} else if (cash>4000) {
			
			
		} else if (cash>1000) {
			
			
		} else if (cash>=0) {
			
			
		} else {
			System.out.println("잘못 입력했습니다.");
			
		}
		
		
		
		
		
		
		sc.close();
		
		
	}

}
