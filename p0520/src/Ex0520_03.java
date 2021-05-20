import java.util.Scanner;

public class Ex0520_03 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("1번째 데이터를 입력하세요.>>"); 
		int num1 = scan.nextInt();
		System.out.println("2번째 데이터를 입력하세요.>>");
		int num2 = scan.nextInt();
		System.out.println("[ 사칙연산 선택 ]");
		System.out.println("1.더하기  2.빼기  3.곱하기  4.나누기");
		System.out.println("번호를 선택하세요.>>");
		int sign = scan.nextInt();
		String str = "";
		switch (sign) {
		case 1:  //더하기
			str="더하기";
			break;
		case 2:  //빼기
			str="빼기";
			break;
		case 3:  //곱하기
			str="곱하기";
			break;
		case 4:  //나누기
			str="나누기";
			break;
		}
		
		double result = calculation(num1,num2,sign);
		
		System.out.println("사칙연산 선택 : "+str);
		System.out.println("결과값 : "+result);

	}
	
	//사칙연산 메소드
	static double calculation(int num1,int num2,int sign) {
		double result=0;
		switch (sign) {
		case 1:  //더하기
			result = num1 + num2;
			break;
		case 2:  //빼기
			result = num1 - num2;
			break;
		case 3:  //곱하기
			result = num1 * num2;
			break;
		case 4:  //나누기
			result = num1 / num2;
			break;
		}
		
		return result;
	}
	
	
	
}//class


