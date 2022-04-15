package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		
		System.out.print("키: ");
		int stature = sc.nextInt();
		
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
		
		double standard = (double)(stature-100)*0.9; 
		
		
		if (standard<weight) {
			System.out.print("저체중");
			
		} else if (standard>weight) {
			System.out.print("과체중");
			
		} else {
			System.out.println("표준");			//--> println 이 아니라 print를 사용해야 한다.
			
		}
		System.out.println(" 입니다.");
		System.out.println("표준체중: "+standard);
		
		sc.close();
		
	}

}
