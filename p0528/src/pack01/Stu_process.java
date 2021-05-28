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
			Student s = new Student(stu_name,kor,eng,math);
			list.add(s);
		}//while
	}//student_insert
	
	//학생성적출력 메소드
	void student_print(ArrayList list) {
		System.out.print("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("----------------------------------------------------------");
		
		for(int i=0;i<list.size();i++) {
			Student s = (Student) list.get(i); // 형변환 Object->Student
			System.out.print(s.stu_num+"\t");
			System.out.print(s.stu_name+"\t");
			System.out.print(s.kor+"\t");
			System.out.print(s.eng+"\t");
			System.out.print(s.math+"\t");
			System.out.print(s.total+"\t");
			System.out.printf("%.2f\t",s.avg);
			System.out.print(s.rank+"\n");
		}
	}//student_print
	
	//학생성적수정 메소드
	void student_update(ArrayList list) {
		System.out.println("수정할 학생이름을 입력하세요.>>");
		String stu_name = scan.next();
		
		// list
		int check_flag=0;
		for(int i=0;i<list.size();i++) {
			Student s = (Student)list.get(i); //list에서 1개씩 가져옴
			if(stu_name.equals(s.stu_name)) {
				System.out.println("수정하고자 하는 학생을 찾았습니다.");
				System.out.println("[ 수정과목선택 ]");
				System.out.println("1.국어 2.영어 3.수학");
				System.out.println("원하는 번호를 선택하세요.>>");
				int choice = scan.nextInt();
				switch (choice) {
				case 1: //국어
					System.out.println("현재점수 : "+s.kor);
					System.out.println("수정하고 싶은 점수를 입력하세요.>>");
					s.kor = scan.nextInt();
					break;
				case 2:
					System.out.println("현재점수 : "+s.eng);
					System.out.println("수정하고 싶은 점수를 입력하세요.>>");
					s.eng = scan.nextInt();
					break;
				case 3:
					System.out.println("현재점수 : "+s.math);
					System.out.println("수정하고 싶은 점수를 입력하세요.>>");
					s.math = scan.nextInt();
					break;
				}//switch
				
				s.total = s.kor+s.eng+s.math; //합계수정
				s.avg = s.total/3.0;  //평균수정
				check_flag=1;
			}//if
		}//for
		
		if(check_flag==0) {
			System.out.println("수정할 학생을 찾지 못했습니다.");
		}
	}//student_update
	
	//학생성적검색 메소드
	void student_search(ArrayList list) {
		System.out.println("검색할 학생이름을 입력하세요.>>");
		String stu_name = scan.next(); //홍
		
		System.out.print("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("----------------------------------------------------------");
		
		int check_flag=0; //없다.
		for(int i=0;i<list.size();i++) {
			Student s = (Student)list.get(i);
			if(s.stu_name.contains(stu_name)) { //홍길동,홍길자,홍길순,박수홍
				System.out.print(s.stu_num+"\t");
				System.out.print(s.stu_name+"\t");
				System.out.print(s.kor+"\t");
				System.out.print(s.eng+"\t");
				System.out.print(s.math+"\t");
				System.out.print(s.total+"\t");
				System.out.printf("%.2f\t",s.avg);
				System.out.print(s.rank+"\n");
				check_flag=1; //검색할 대상을 찾음.
			}
		}//for
		
		if(check_flag==0) {
			System.out.println("찾는 데이터가 없습니다. 다시 검색하세요.");
		}
	}//student_search
	
	//등수처리 메소드
	void student_rank(ArrayList list) {
		for(int i=0;i<list.size();i++) {
			Student s1 = (Student)list.get(i);
			int rCount=1; //등수카운트
			for(int j=0;j<list.size();j++) {
				Student s2 = (Student)list.get(j);
				if(s1.total<s2.total) {
					rCount++; // 등수1증가
				}
			}
			s1.rank = rCount; //등수를 rank저장	
		}
		System.out.println("등수처리가 완료되었습니다.");
	}//student_rank
	
	
	
}
