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
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적검색");
			System.out.println("-----------------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: //학생성적추가
				//1.이름,국어,영어,수학
				p.student_insert(list);
			    break;
			case 2: //학생성적출력
				//1.상단출력 2.for을 사용해서 3.list에 있는 데이터 출력
				p.student_print(list);
				break;
			case 3: //학생성적수정
				//1.수정할 학생검색-비교 2.과목선택 3.점수입력 4.점수수정
				p.student_update(list);
				break;
			case 4: //학생성적검색
				//1.검색할 이름입력 2.for반복 3.if문비교 4.검색 출력
				p.student_search(list);
				break;

			
			
			
			
			}//switch
			
			
			
			
			
		}
		
		
		
		
		
	}

}
