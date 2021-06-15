package p0615;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0615_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count=0;
		while(true) {
			//[try-catch가 없는것]
//			System.out.println("3번 실행");
//			System.out.println(0/0);
//			System.out.println("4번 실행");
//			System.out.println("5번 실행");
//			System.out.println("6번 실행");
			
			try {
				System.out.println("시작하려면 아무키를 누르세요>>");
				list.add(scan.nextInt());
				System.out.println("1번 실행");
				System.out.println("2번 실행");
				System.out.println("3번 실행");
				System.out.println(0/0);
				System.out.println("4번 실행");
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("0으로 숫자를 나눈 에러입니다.");
				System.out.println("5번 실행");
				System.out.println("예외처리를 해서 프로그램을 다시 시작합니다.");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("예외 발생시 배열을 10개 늘려줌.");
			}
			System.out.println("6번 실행");
			count++;
			
		}//while
	}//main
}//class
