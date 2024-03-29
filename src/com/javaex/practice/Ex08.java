package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		//문제 8번 : 숫자(정) 3개를 입력받아 가장 작은 수를 출력하세요.
		
		/*
	 	먼저 숫자 3개를 입력할 수 있는 칸을 3개 만들어준 후 제일 작은 수만 출력되게 하고 싶으면
	 	3개의 변수를 연달아 놓고 1>2>3, 2>3>1, 3>1>2 이런 식으로 놓고 이것이 전부 참일 때 마지막 변수만 출력되게 해준다.
	 	대신 참거짓은  앞에 부등호는 참인지 거짓인지 상관없고 
		 */
		
		/*
	 	위에 내용에서 참고하여 1>2  2>3로 놓고 사이에 둘 다 true여야 하는 &&을 넣어준다.
	 	그러면 1>2 && 2>3 이 둘 다 참이면 3번째 변수1이 제일 크고 2가 그 다음 순 3이 제일 작은 정수가 나온다.
	 	이런 식으로 2>3 %% 1>2 인 경우, 3>1 && 1>2인 경우를 각각 else if 로 만들면 될 거 같다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력하세요.");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();
		
		// 첫번째는 아래 내용으로 출력했으나 위에서 1>2>3 이런식으로 변수를 한 줄에 연달아 놓는다고 생각하였으나 다시 생각하니 num1이 둘보다 작을 경우를 넣으면 되는 거였다. 
		/*
		System.out.print("가장 작은수는 ");
		if (num2>=num3 && num3>=num1) {			
			System.out.print(num1);
			
		} else if (num3>=num1 && num1>=num2) {
			System.out.print(num2);
		
		} else if (num1>=num2 && num2>=num3) {
			System.out.print(num3);
			
		}
		System.out.println(" 입니다.");
		sc.close();
		*/
		
		System.out.print("가장 작은수는 ");
		if (num2>=num1 && num3>=num1) {			
			System.out.print(num1);
			
		} else if (num1>=num2 && num3>=num2) {
			System.out.print(num2);
			
		} else if (num1>=num3 && num2>=num3) {
			System.out.print(num3);
			
		}
		System.out.println(" 입니다.");
		sc.close();
	}

}
