import java.util.Scanner;

public class Ex0513_01 {

	public static void main(String[] args) {
		// 학생성적 프로그램 - 3명 입력해서 출력을 해보세요.
		// 이름,국어,영어,수학을 입력받아, 이름,국어,영어,수학,합계,평균
		// 1. 배열선언
		// 2. 학생정보입력 - 합계계산, 평균계산 데이터 넣기
		// 3. 학생정보출력
		Scanner scan = new Scanner(System.in);
		// 1.배열선언
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];

		// 2. 학생정보입력
		for (int i = 0; i < name.length; i++) {
			System.out.println("학생이름을 입력하세요.>>");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요.>>");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			math[i] = scan.nextInt();
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.0;
		}

		// 3. 학생정보출력
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t\n");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(kor[i]+"\t");
			System.out.print(eng[i]+"\t");
			System.out.print(math[i]+"\t");
			System.out.print(total[i]+"\t");
			System.out.print(avg[i]+"\n");
		}

	}

}
