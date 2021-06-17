package p0617;

import java.util.Scanner;

public class Ex0617_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("[ 큰수 작은수 확인 프로그램 ]");
			System.out.println("세개 수를 입력하세요.>>");
			int input1 = scan.nextInt(); //11 5   5
			int input2 = scan.nextInt(); //21 11  21
			int input3 = scan.nextInt(); //5  21  11
			
			int result1 = Math.max(Math.max(input1, input2), input3); 
			int result3 = Math.min(Math.min(input1, input2), input3); 
			
			
			
//			int result = Math.max(input1, input2);
//			int result2 = Math.min(input1, input2);
//			
//			System.out.println("큰수 : "+result);
//			System.out.println("작은수 : "+result2);
			
		}
		

	}

}
