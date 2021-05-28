package pack01;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {

	static Scanner scan = new Scanner(System.in);
	
	//학생성적추가 메소드
	void student_insert(ArrayList list) {  //인스턴스 메소드:객체O, 참조변수명.메소드명
		String stu_name="";
		int kor=0,eng=0,math=0;
		
		while(true) {
			System.out.println("학생이름을 입력하세요.(0.상위메뉴이동)>>");
			stu_name = scan.next();
			if(stu_name.equals("0")) {
				break;
			}
			System.out.println("국어점수를 입력하세요.>>");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			math = scan.nextInt();
			//list 저장
			list.add(new Student(stu_name,kor,eng,math));
		}//while
		
		
		
		
		
	}
	
	
}
