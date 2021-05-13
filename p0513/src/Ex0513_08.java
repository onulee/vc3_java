import java.util.Scanner;

public class Ex0513_08 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		//1-100까지 중 1개의 숫자를 랜덤으로 받아 숫자를 맞추는 프로그램을 구현하시오.
		// 횟수는 10까지만 도전 가능!, 입력한 값을 출력하시오.
		//int randomNO = (int)(Math.random()*100)+1;
		int randomNO = 10;
		int[] arr = new int[10];
		int count=1;
		while(true) {
			
			//10번 도전확인
			if(count>10) {
				System.out.println("프로그램을 종료합니다.");
				count = count - 1;
				break;
			}
			
			System.out.println("숫자를 입력하세요.>>");
			int input = scan.nextInt();
			arr[count-1] = input; //입력한 수를 arr배열에 저장
			
			if(randomNO==input) {
				System.out.println("정답입니다.");
				break;
			}else if(randomNO<input) {
				System.out.println(input+"보다 작은 수를 입력하세요.! 다시 도전!");
			}else {
				System.out.println(input+"보다 큰 수를 입력하세요.! 다시 도전!");
			}
			
			count++;  //0,1,2,3,4,5,6,7,8,9,     10
		}
		
		System.out.println("정답 : "+randomNO);
		System.out.println("총 도전 횟수 : "+count);
		System.out.print("입력한 숫자 : ");
		for(int i=0;i<(count);i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
		
//		System.out.println("글자를 입력하세요.>>");
//		String input = scan.next();
//		// 한국직업전문학교
//		// 전 자만 출력하시오.
//		for(int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//			
//		}
//		
//	    System.out.println(input.substring(4,6));
		
		
		

	}

}
