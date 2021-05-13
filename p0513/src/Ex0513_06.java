import java.util.Scanner;

public class Ex0513_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] ball = new int[25];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // 1-25
		}

		int temp = 0;
		int rno = 0;
		for (int i = 0; i < ball.length * 5; i++) {
			rno = (int) (Math.random() * (25)); // 0-24 배열번호
			temp = ball[0];
			ball[0] = ball[rno];
			ball[rno] = temp;
		}
		int[][] arr = new int[5][5];
		int count=0; //ball의 배열번호로 사용되는 변수 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ball[5*i+j]; // 0-24
				count++;
			}
		}
		
		//무한반복
		while(true) {
			
			// 배열출력
			System.out.printf("번호\t[0]\t[1]\t[2]\t[3]\t[4]\n");
			System.out.println("-----------------------------------------");
			for (int i = 0; i < arr.length; i++) {
				System.out.print("["+i+"]\t");
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			
			//번호입력
			System.out.println("0-4까지 숫자를 입력하세요.>>");
			int input1 = scan.nextInt();
			System.out.println("0-4까지 숫자를 입력하세요.>>");
			int input2 = scan.nextInt();
			System.out.println("입력 :"+input1+","+input2);
			
			//입력한 값 [0,1]->0을 넣기
			arr[input1][input2]=0;
			
			
			
			
		}//while
		
		
		
		
		// [5][5]배열 -> 1~25까지 랜덤숫자를 넣어서 출력하시오.
		// 1-25까지 랜덤숫자 -> 5,5 = 25
		

	}//main
}//class
