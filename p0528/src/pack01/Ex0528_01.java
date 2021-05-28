package pack01;

import java.util.Scanner;

public class Ex0528_01 {

	static Scanner scan = new Scanner(System.in); //클래스 변수
	
	public static void main(String[] args) {
		
		while(true) {
			Process01 p = new Process01();
			System.out.println("[ 프로그램 ]");
			System.out.println("1. 두수의 합");  //2+7=9
			System.out.println("2. 두수 사이의 합"); //1,10 -> 55
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			
			//두수 입력받기 메소드
			int[] num = p.numInput();
			
			switch (choice) {
			case 1:
				//입력은 메인메소드
				// 1.두수를 입력받아 2.더하는 계산을 해야 한다.
				int result = p.add(num[0],num[1]);
				System.out.println("결과값 : "+result);
				
				break;
			case 2:
				// 1. 두수를 입력받아 2.for문이용하여 3.더하기 계산을 한다.
				//num[0]=5,num[1]=10
				int sum=0; //합계변수
				for(int i=num[0];i<=num[1];i++) { //5,10
					sum = sum + i;
				}
				
				System.out.println("두수의 사이 값 : "+sum);
				break;

			default:
				break;
			}
		}//while

	}//main
	
	
	

}//class
