
public class Ex0513_03 {

	public static void main(String[] args) {
		//배열[3][3] = 0-9까지 랜덤 숫자를 넣어서 출력하시오.
		// 값이 중복허용하지 않음.
		
		//1차원 배열 ball - 0-9
		// 배열섞기
		// ball배열에 있는 것을 arr[3][3]넣기
		
		//0-9까지 랜덤숫자
		int[] ball = new int[9];
		for(int i=0;i<ball.length;i++) {
			ball[i] = i;
		}
		
		int temp=0;
		int rno=0;
		for(int i=0;i<50;i++) {
			rno = (int)(Math.random()*9); //0-8
			temp = ball[0];
			ball[0] = ball[rno];
			ball[rno] = temp;
		}
		
		
		int[][] arr = new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=ball[3*i+j];  //0-9
				// 0,1,2,3,4,5,6,7,8 
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		// int 7개배열에 1-10까지 랜덤숫자를 넣어서 출력하시오.
		//1. 배열 7개, 랜덤숫자 생성-넣기, 출력하기
		// 1. 배열생성
//		int[] arr = new int[7];
//		// 2. 랜덤숫자 생성해서 넣기
//		for(int i=0;i<7;i++) {
//			arr[i] = (int)(Math.random()*10)+1; //1-10
//		}
//		// 3. 출력
//		System.out.print("배열 값 : \t");
//		for(int i=0;i<7;i++) {
//			System.out.print(arr[i]+"\t");
//		}
		

	}

}
