import java.util.Scanner;

public class Ex0520_04 {

	public static void main(String[] args) {
		// 두수를 입력받아 큰수와 작은수를 표시하시오.
		// 큰수:10, 작은수:5
		// 비교하는 구문은 메소드로 분리하시오.
		
		// 1. main메소드 -> 두수를 입력
		//   메소드호출 : compare(num1,num2);
		
		// 2. compare메소드 -> 출력
		// static void compare(int num1,int num2){ }
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 입력하세요.>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		compare(num1,num2);

	}
	
	static void compare(int num1,int num2){
		if(num1>num2) {
			System.out.printf("큰수 : %d, 작은수 :%d \n",num1,num2);
		}else if(num2>num1) {
			System.out.printf("큰수 : %d, 작은수 :%d \n",num2,num1);
		}else {
			System.out.printf("두수는 동일 : %d,%d \n",num1,num2);
		}
		
	}
	
	

}
