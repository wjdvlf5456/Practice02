package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		/*
		문제 12번: 아래와 같은 계산기 프로그램을 작성하세요.
		
		 1.기호, 숫자1, 숫자2 순서로 입력받습니다.
		 2.기호는 더하기, 빼기, 곱하기, 나누기 4가지 입니다.
		 3. 입력된 내용으로 계산하여 결과값을 출력합니다.
		 4. 나눗셈의 경우 분모가 0이면 "계산할 수 없습니다." 를 출력합니다.
		 
		*/
		
		/*
		문제 예상
		
		1. 입력받는 값은 총 3가지 이고 그 중에서 기호는 더하기, 빼기, 곱하기, 나누기 4개의 값이 입력될 수 다.
		2. 기호는 switch ~ case 로 작성한다.
		3. 결과는 실수형으로 나와야 하니 중간에 double을 사용해준다.
		 */
		
		// 문제 풀어보기
		// ===================== 첫번째 풀이 시작 =====================                                    
		                                                                               
		// ===================== 입력란 =====================
		/*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		
		System.out.print("기호: ");                                                    
		String sign = sc.nextLine();                                                   
		                                                                               
		System.out.print("숫자1: ");                                                           
		int num1 = sc.nextInt();                                                           
		                                                                                    
		System.out.print("숫자2: ");                                                           
		int num2 = sc.nextInt();                                                           
		                                                                                    
		// ===================== 조건문 시작 =====================                                
		switch (sign) {                                                                     
			case "+":                                                                          
				System.out.print("결과는: "+sign);                                                                      
				System.out.print(num1+num2);                                                  
				break;                                                              
	                                                                                
			case "-":                                                               
				System.out.print("결과는: "+sign);                                                   
				System.out.print(num1-num2);                                                  
				break;                                                                            
				                                                                                  
			case "*":                                                                          
				System.out.print("결과는: "+sign);                                                   
				System.out.print(num1*num2);                                                  
				break;                                                                            
				                                                                                  
			case "/":                                                                          
				                                                                                  
				if (num2==0) {                                                                    
					System.out.print("계산할 수 없습니다.");			// --> 분모가 숫자 '0모가 숫자 '0' 일시 출력                        
				}                                                                                 
				                                                                                  
				System.out.print("결과는: "+sign);                                                   
				System.out.print(num1/num2);                                                  
				break;                                                                            
				                                                                                  
			default:                                                                           
				System.out.println("계산할 수 없는 기호입니다.");                                                
				break;                                                                            
		}                                                                                    
		                                                                                     
		sc.close();    

		*/
		
		//  ===================== 조건문 끝 =====================
		
		/*
			===================== 첫번째 풀이 오류 검토 =====================
		
		첫 시도에서는 결과가 기호, 숫자1, 숫자2 가 그대로 출력되어 '결과는: *294' 라고 잘못 출력되었다.
		심지어 분모가 0일때에는 계산할 수 없습니다.결과는: /Exception in thread "main" java.lang.ArithmeticException: / by 
		zero
			at com.javaex.practice.Ex12.main(Ex12.java:67)
		라는 에러까지 나왔다.
		
		default값은 제대로 나왔다.
		
		'결과는:' 뒤에 sign 변수를 넣을 필요가 없었고 switch조건문 안에 있는 int 변수 앞에 double을 붙여주어야 했다.
		
		 */
		
		//	===================== 첫번째 풀이 수정 후 출력  =====================
        
		// ===================== 입력란 =====================
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		
		System.out.print("기호: ");                                                    
		String sign = sc.nextLine();                                                   
		                                                                               
		System.out.print("숫자1: ");                                                           
		int num1 = sc.nextInt();                                                           
		                                                                                    
		System.out.print("숫자2: ");                                                           
		int num2 = sc.nextInt();                                                           
		                                                                                    
		// ===================== 조건문 시작 =====================                                
		switch (sign) {                                                                     
			case "+":                                                                          
				System.out.print("결과는: ");                                                                      
				System.out.print((double)num1+(double)num2);                                                  
				break;                                                              
	                                                                                
			case "-":                                                               
				System.out.print("결과는: ");                                                   
				System.out.print((double)num1-(double)num2);                                                  
				break;                                                                            
				                                                                                  
			case "*":                                                                          
				System.out.print("결과는: ");                                                   
				System.out.print((double)num1*(double)num2);                                                  
				break;                                                                            
				                                                                                  
			case "/":                                                                          
				                                                                                  
				if (num2==0) {
					System.out.print("계산할 수 없습니다.");			// --> 분모가 숫자 '0모가 숫자 '0' 일시 출력                     
				}                                                                                 
				break;                                                                            
				                                                                                  
			default:                                                                           
				System.out.println("계산할 수 없는 기호입니다.");                                                
				break;                                                                            
		}                                                                                    
		                                                                                     
		sc.close();   
		
		//	===================== 첫번째 풀이 수정 후 출력 끝 =====================
		
		// ===================== 첫번째 풀이 끝  ======================
		
		
		
		
		
		
		
		
		
		
		
	}

}
