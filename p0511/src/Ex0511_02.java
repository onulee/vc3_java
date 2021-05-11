import java.util.Scanner;

public class Ex0511_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학교를 영어로 입력해세요.>>");
		String input = scan.nextLine();
		if(input.equals("school")) {
			System.out.println("정답입니다. 입력 : "+input);
		}else {
			System.out.println("오답입니다. 정답 :school, 입력 : "+ input);
		}
		
		String str="";
		if(str!=null && !str.equals("")) {
			char ch = scan.next().charAt(0);
		}
		
//		char ch = scan.next().charAt(0);
//		if(ch>='a'&& ch<='z' || ch>='A' && ch<='Z') {
//			System.out.println("영문자입니다.");
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}
		// 문자 1개를 입력받아 알파벳인지 아닌지를 출력하시오.
		// 알파벳입니다. 알파벳이 아닙니다.
		// 대소문자 모두 포함.
				
//		System.out.println("프로그램을 종료하려면 X 또는 x를 입력하세요.>>");
//		char ch = scan.next().charAt(0);
//		
//		if(ch=='X' || ch=='x') {
//			System.out.println("프로그램을 종료합니다.");
//		}else {
//			System.out.println("프로그램을 계속 실행합니다.");
//		}
		
//		if(ch>='0' && ch<='9') {
//			System.out.println("숫자 1개를 입력하셨습니다.");
//		}else {
//			System.out.println("숫자가 아닙니다.");
//		}
		
//		String str = "abcdef";
//		char ch1 = str.charAt(3);
//		System.out.println(ch1);

	}

}
