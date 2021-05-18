import java.util.Scanner;

public class Ex0518_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두수를 입력하세요.>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result=0; //결과값
		if(num1>num2) {
			result = num1;
		}else {
			result = num2;
		}
		System.out.println("데이터 : "+result);

	}//main메소드
	

}
