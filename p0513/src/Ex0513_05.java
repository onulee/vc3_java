import java.util.Scanner;

public class Ex0513_05 {

	public static void main(String[] args) {
		// [0,0][0,1][0,2]
		//[3][3]의 배열
		// 숫자를 입력받아 원하는 배열을 만들어 보세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("1차원 배열 입력>>");
		int input1 = scan.nextInt();
		System.out.println("2차원 배열 입력>>");
		int input2 = scan.nextInt();
		
		String[][] arr = new String[input1][input2];
		//입력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = "["+i+","+j+"]"; //[0,0] [01] [02]
			}
		}
		//출력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
