import java.util.Scanner;

public class Ex0520_08 {

	public static void main(String[] args) {
		// 두수를 입력, sum메소드호출, return값 출력
		// sum -> 두수 사이의 값을 더하여 값을 리턴
		// main 두수입력 :1,100 -> 1+2+3+4...99+100 -> return 5050 받아 main에서 출력

		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 입력하세요.>>");
		int num1 = scan.nextInt(); //1
		int num2 = scan.nextInt(); //100
		int result = sum(num1,num2);
		System.out.println("결과값 : "+result);
		
	}//main
	
	static int sum(int num1,int num2) {
		int result=0;
		for(int i=num1;i<=num2;i++) {
			result = result + i;
		}
		return result;
	}

}
