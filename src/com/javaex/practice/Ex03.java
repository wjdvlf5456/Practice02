package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		// 다음의 숫자 15, 19, 20 ,21, 100을 나이에 입력하였을 때 나오는 결과를 예상하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		
		int age = sc.nextInt();
		
		if ( age > 20 ) {
			System.out.println("\"1번그룹\"");
		} else {
			System.out.println("\'2번그룹\'");
		}
			System.out.println("입니다.");
		sc.close();
		
		
		/*
		=========예상========= 
		이스케이프 시퀸스인 \" 가 있는데 이것은 큰 따옴표를 의미하므로  age>20 의 출력값은 "1번그룹"아 되고
		else에 속한 나머지는 \'2번그룹\'이 될 것이다.
		
		 
		15: else에 속하므로 \'2번그룹\'입니다. 가 출력된다.
		19: else에 속하므로 \'2번그룹\'입니다. 가 출력된다.
		20: else에 속하므로 \'2번그룹\'입니다. 가 출력된다.
		21:	20보다 크므로 "1번그룹"입니다. 가 출력된다.
		100: 20보다 크므로 "1번그룹"입니다. 가 출력된다.
		
		 */
		
	}

}
