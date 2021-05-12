import java.util.Scanner;

public class Ex0512_02 {

	public static void main(String[] args) {
		// 문제 2명의 학생을 출력해보세요.
		// 학생이름,국어점수,수학점수,영어점수를 4개를 입력받아
		// 3개를 학생이름,합계,평균을 출력하시오.
		Scanner scan = new Scanner(System.in);
		String name="";
		int kor=0;
		int math=0;
		int eng=0;
		System.out.println("이름을 입력하세요.>>");
		name = scan.next();
		System.out.println("국어점수를 입력하세요.>>");
		kor = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		math = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		eng = scan.nextInt();
		String name2="";
		int kor2=0;
		int math2=0;
		int eng2=0;
		System.out.println("이름을 입력하세요.>>");
		name2 = scan.next();
		System.out.println("국어점수를 입력하세요.>>");
		kor2 = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		math2 = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		eng2 = scan.nextInt();
		
		System.out.println("이름 : "+name);
		System.out.println("합계 : "+(kor+math+eng));
		System.out.printf("평균 : %.2f",((kor+math+eng)/3.0));
		System.out.println("이름 : "+name2);
		System.out.println("합계 : "+(kor2+math2+eng2));
		System.out.printf("평균 : %.2f",((kor2+math2+eng2)/3.0));
      
	}

}
