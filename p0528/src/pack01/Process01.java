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
	int numBetween(int num1,int num2) {
		int sum=0; //합계변수
		for(int i=num1;i<=num2;i++) { //5,10
			sum = sum + i;
		}
		return sum;
	}
	
	//두수 비교
	String numCompare(int num1,int num2) {
		String str="";
		if(num1<num2) {
			str = "큰수 : "+num2+","+"작은수 : "+num1;
		}else if(num1>num2) {
			str = "큰수 : "+num1+","+"작은수 : "+num2;
		}else {
			str = "두수 크기가 같음 : "+num1;
		}
		
		return str;
	}
	
	

}
