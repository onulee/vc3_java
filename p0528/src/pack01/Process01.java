package pack01;

import java.util.Scanner;

public class Process01 {
	static Scanner scan = new Scanner(System.in); //클래스 변수
	
	//numInput메소드
	int[] numInput() {
		int[] num = new int[2]; //num1,num2담는 배열
		
		for(int i=0;i<num.length;i++) {
			System.out.println((i+1)+"번째 수를 입력하세요.>>");
			num[i] = scan.nextInt();
		}
		return num;
	}
	
	
	//더하기 메소드
	int add(int num1,int num2) { //인스턴스 메소드
		int result = num1+num2;
		return result;
	}
	
	
	//두수 사이 더하기 메소드
	

}
