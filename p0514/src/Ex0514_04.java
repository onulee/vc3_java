import java.util.Scanner;

public class Ex0514_04 {

	public static void main(String[] args) {
		// 3명의 배열 생성
		// 학생이름,국어,영어,수학 성적을 입력받아 -> 합계,평균을 출력하시오.

		Scanner scan = new Scanner(System.in);
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int count=0; //입력한 학생수
		String check_name=""; // 학생이름 검색변수
		
		while(true) {
			System.out.println("[ 성적처리프로그램 ]");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적수정");
			System.out.println("3.학생성적출력");
			System.out.println("4.학생성적검색");
			System.out.println("5.등수처리");
			System.out.println("0.프로그램종료");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			String check = ""; //0인지 확인하는 변수
			int findnum = 0;   //수정할 데이터위치변수
			
			
			switch (choice) {
			case 1: //학생성적추가
				System.out.println("[ 학생성적추가 메뉴 ]");
				//크기3의 이름배열, 점수배열, 평균배열 선언
				// 이름 3개를 입력받아 -> 이름 3개 출력
				for(int i=count;i<name.length;i++) {
					System.out.println("이름을 입력하세요.(0.상위메뉴이동)>>");
					check = scan.next();
					//0인지 확인
					if(check.equals("0")) {
						break;
					}
					
					name[i] = check; //홍길동,
					for(int j=0;j<(score[i].length-1);j++) {
						System.out.println("점수를 입력하세요.>>");
						score[i][j] = scan.nextInt();
					}
					//합계
					score[i][3]=score[i][0]+score[i][1]+score[i][2];
					//평균
					avg[i] = score[i][3]/3.0;
					count++;
				}
				
				break;
			case 2:  //학생성적수정
				System.out.println("[ 학생성적수정 메뉴 ]");
				System.out.println("수정할 학생이름을 입력하세요.>>");
				check_name =  scan.next(); //수정할 학생이름 입력
				
				findnum=-1; //데이터가 없을 경우
				for(int i=0;i<count;i++) { //check_name,name[i]
					if(check_name.equals(name[i])) {
						 findnum = i;
					}
				}
				
				if(findnum==-1) {
					System.out.println("데이터가 없습니다.");
					break;
				}
				
				System.out.println("[ 수정과목 선택 ]");
				System.out.println("0.국어 1.영어 2.수학");
				System.out.println("수정과목을 선택하세요.>>");
				int subname = scan.nextInt();
				System.out.println("수정점수 입력 : ");
				score[findnum][subname] = scan.nextInt();
				//합계 구하는 공식
				score[findnum][3] = score[findnum][0]+score[findnum][1]+score[findnum][2];
				//평균 구하는 공식
				avg[findnum] = score[findnum][3]/3.0;
				
				break;
			case 3: //학생성적출력
				//출력
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("-----------------------------------------------");
				for(int i=0;i<count;i++) {
					System.out.print(name[i]+"\t");
					for(int j=0;j<score[i].length;j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.2f \n",avg[i]);
				}
				System.out.println();
				break;

			default:
				break;
			}
			
			
			
		}
		
		
		
	}

}
