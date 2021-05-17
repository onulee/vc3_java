import java.util.Scanner;

public class Ex0517_01 {

	public static void main(String[] args) {
		// 1. 배열선언, 화면글자출력
		// 2. 학생성적추가,학생성적출력,학생성적수정,학생성적검색,등수처리,종료순으로 진행
		// 학생이름,국어,영어,수학,합계,평균,등수
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];
		int[] rank = new int[5];
		String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0; //선택번호 변수
		int count=0; //학생숫자변수
		String search_name = ""; // 찾고자하는이름변수 
		int[] search_num1 = new int[5]; // 찾는 이름번호배열
		int search_num2 = 0;       // 찾는 과목번호변수
		
		loop1:while (true) { //무한반복
			System.out.println("----------------------------------");
			System.out.println("      [ 학생성적처리 프로그램 ]");
			System.out.println("----------------------------------");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적출력");
			System.out.println("3.학생성적수정");
			System.out.println("4.학생성적검색");
			System.out.println("5.등수처리");
			System.out.println("6.학생성적 프로그램종료");
			System.out.println("----------------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();

			switch (choice) {
			case 1: //학생성적추가
				System.out.println("< 학생성적추가 메뉴 >");
				//1.이름,국어,영어,수학 -> 합계,평균
				for(int i=count;i<name.length;i++) {
					System.out.println("이름을 입력하세요.(0.상위메뉴이동)>>");
					name[i] = scan.next();
					//비교
					if(name[i].equals("0")) {
						System.out.println("< 상위메뉴로 이동합니다! >");
						break;
					}
					//점수입력
					for(int j=0;j<score[i].length-1;j++) {
						System.out.println(title[j+1]+"점수를 입력하세요.>>");
						score[i][j] = scan.nextInt();
					}
					//합계
					score[i][3] = score[i][0]+score[i][1]+score[i][2];
					//평균
					avg[i] = score[i][3]/3.0;
					count++; //학생 1명 증가 
				}
				break;
			case 2: //학생성적출력
				//상단타이틀 출력
				for(int i=0;i<title.length;i++) {  //이름  국어  영어...
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("------------------------------------------------");
				
				//이름출력
				for(int i=0;i<count;i++) {
					System.out.print(name[i]+"\t");
					//점수출력
					for(int j=0;j<score[i].length;j++) {
						System.out.print(score[i][j]+"\t");
					}
					//평균
					System.out.printf("%.2f\t",avg[i]);
					//등수
					System.out.print(rank[i]+"\n");
				}
				System.out.println();

				break;
			case 3: //학생성적수정
				//수정할 학생의 이름을 입력하세요.>어떤과목점수를 수정할지 정함>수정
				System.out.println("수정할 학생의 이름을 입력하세요.>>");
				search_name = scan.next();
				
				//이름검색
				search_num1[0]=-1;
				for(int i=0;i<name.length;i++) {
					if(search_name.equals(name[i])) {
						search_num1[0] = i;
						break;//찾으면 for문 종료
					}
				}
				
				//찾고자하는 이름이 없을시
				if(search_num1[0]==-1) {
					System.out.println("찾고자 하는 이름이 없습니다!");
					break;
				}
				
				//수정할 과목을 선택
				System.out.println("[ 수정할 과목 선택 ]");
				System.out.println("0.국어  1.영어  2.수학");
				System.out.println("원하는 번호를 입력하세요.>>");
				search_num2 = scan.nextInt();
				//현재점수확인
				System.out.println("현재 점수 : "+score[search_num1[0]][search_num2]);
				System.out.println("수정점수 입력 : "); //100 -> 90
				//점수수정
				score[search_num1[0]][search_num2] = scan.nextInt();
				//합계수정
				score[search_num1[0]][3]=score[search_num1[0]][0]+score[search_num1[0]][1]+score[search_num1[0]][2];
				//평균수정
				avg[search_num1[0]] = score[search_num1[0]][3]/3.0;
				System.out.println("수정이 완료되었습니다.!");
				break;
			case 4: //학생성적검색
				//검색할 학생의 이름을 입력하세요.
				System.out.println("검색할 학생의 이름을 입력하세요.>>");
				search_name = scan.next();
				
				//찾은 학생 출력
				for(int i=0;i<title.length;i++) {  //이름  국어  영어...
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("------------------------------------------------");
				
				//이름검색
				search_num1[0]=-1;
				for (int i = 0; i < name.length; i++) {
					if (name[i].contains(search_name)) {
						
						// 이름출력
						System.out.print(name[i] + "\t");
						// 점수출력 - 0
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						// 평균
						System.out.printf("%.2f\t", avg[i]);
						// 등수
						System.out.print(rank[i] + "\n");
					}
				}
				
				//찾고자하는 이름이 없을시
				if(search_num1[0]==-1) {
					System.out.println("찾고자 하는 학생이 없습니다!");
				}
				break;
			case 5: //등수처리
				for(int i=0;i<count;i++) {
					int rankNum=1;
					for(int j=0;j<count;j++) {
						if(score[i][3]<score[j][3]) {
							rankNum++;
						}
					}
					rank[i]=rankNum;
				}
				
				System.out.println("등수처리가 완료되었습니다!");

				break;
			case 6: //종료
				System.out.println("< 프로그램종료 메뉴 >");
				break loop1;	
			default:
				System.out.println("번호가 잘못 입력되었습니다. 다시 입력하세요!");
				break;
			}

		}

	}

}
