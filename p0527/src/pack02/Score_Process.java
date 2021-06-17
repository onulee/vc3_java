package pack02;
import java.util.ArrayList;
import java.util.Scanner;

public class Score_Process {

	static Scanner scan = new Scanner(System.in);

	// 메인 메뉴 출력메소드
	void mainPrint() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 학생성적추가");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 학생성적검색");
		System.out.println("6. 등수처리");
		System.out.println("0. 프로그램종료");
		System.out.println("------------------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}

	// 1. 학생성적추가 메소드
	static void student_insert(ArrayList list) {
		String name = "";
		int kor = 0, eng = 0, math = 0;

		while (true) {
			Student s1 = new Student();
			s1.name = "홍길동";
			s1.kor = 100;
			s1.eng = 100;
			s1.math = 100;
			Student s2 = new Student("이순신",100,100,100);
			
			// 번호는 자동으로 입력됨.
			System.out.println("이름을 입력하세요.>>(0.상위메뉴이동)");
			String check = scan.next();

			if (check.equals("0")) {
				System.out.println("상위메뉴로 이동합니다.");
				break;
			}
			name = check;
			System.out.println("국어점수를 입력하세요.>>");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			math = scan.nextInt();
			// s[i]객체선언
			// list.add(객체);
			list.add(new Student(name,kor,eng,math));
			//s[i] = new Student(name, kor, eng, math);
		}

	}// 학생성적추가 메소드

	// 상단출력부분 메소드
	void top_title() {
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("---------------------------------------------------");
	}

	// 2. 학생성적출력 메소드
	void student_print(ArrayList list) {
		top_title(); // 상단출력부분 메소드
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student)list.get(i); //Student
			System.out.print(s.stu_number + "\t");
			System.out.print(s.name + "\t");
			System.out.print(s.kor + "\t");
			System.out.print(s.eng + "\t");
			System.out.print(s.math + "\t");
			System.out.print(s.total + "\t");
			System.out.printf("%.2f\t", s.avg);
			System.out.print(s.rank + "\n");
		}
	}// 학생성적출력 메소드

}// class
