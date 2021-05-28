package pack01;
import java.util.ArrayList;
import java.util.Scanner;

public class StuManager {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//학생성적저장 객체배열
		ArrayList list = new ArrayList();
		Stu_process p = new Stu_process();
		
		while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적추가");
			System.out.println("-----------------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: //학생성적추가
				//1.이름,국어,영어,수학
				p.student_insert(list);
				
				
				
				
			 break;
			
			
			}//switch
			
			
			
			
			
		}
		
		
		
		
		
	}

}
