import java.util.Scanner;

public class Ex0511_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자 2.031457 입력받아 5자리 반올림해서 출력 하시오.
		System.out.println("숫자를 입력하세요.>>");
		double num = scan.nextDouble();
		double result = Math.round(num*10000)/10000.0;
		System.out.println("result : "+result);
		
		
		// 문제 1
		// 숫자를 입력받아 짝수인지, 홀수 인지 출력하시오. (if)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>>");
//		int num = scan.nextInt(); //정수형
//		if(num%2==0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}

	}

}
