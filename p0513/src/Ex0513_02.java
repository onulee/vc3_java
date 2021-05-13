import java.util.Scanner;

public class Ex0513_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name= new String[5];
		int[][] score = new int[5][4]; //국어,영어,수학,합계
		double[] avg = new double[5];
		
		//입력
		for(int i=0;i<5;i++) {
			//1번째 학생성적입력
			System.out.println("이름을 입력하세요.>>");
			name[i] = scan.next();
			for(int j=0;j<3;j++) {
				System.out.println("점수를 입력하세요.>>");
				score[i][j] = scan.nextInt(); //i,0 i,1 i,2
			}
			//합계
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			//평균
			avg[i] = score[i][3]/3.0;
			
		}
		//출력
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t\n");
		System.out.println("-------------------------------------------");
		for(int i=0;i<5;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<4;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(avg[i]+"\t");
			System.out.println();
		}
		
		
		
		
		

	}

}
