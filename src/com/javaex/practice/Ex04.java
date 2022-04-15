package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if (age<19) {							//--> 19세이상 65세 미만에 1번그룹을 넣어주어야 하여 반대로
			System.out.print("2번그룹");			//    맨 위에서 19세 미만은 2번그룹으로 보내주었다.	  
			
		} else if (65<=age) {					//그러면 19세이상의 나이가 남는데 여기서 65세이상을 제거해 아래의 else에 19세 이상 65세 미만의 값을 넘겨주었다.
			System.out.print("2번그룹");
		
		} else {
			System.out.print("1번그룹");
			
		}
		
		System.out.println(" 입니다.");
		
		sc.close();
		
		/*
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
		*/
	}

}
