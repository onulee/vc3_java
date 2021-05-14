
public class Ex0514_01 {

	public static void main(String[] args) {
		// 1차원 30개짜리 배열 생성해서 랜덤으로 1~100까지 숫자를 넣어 만들어 보세요.
		// 1차원 40개짜리 배열을 생성해서 배열 5번째방부터 20개만 복사해보세요.
		// for문, arraycopy메소드 2가지를 모두 사용하세요.
		int[] number = new int[30];
		int[] newnumber = new int[40];
		
		for(int i=0;i<number.length;i++) {
			number[i]=(int)(Math.random()*100)+1;
		}
		//for문 배열복사
		for(int i=4;i<24;i++) {  //0,1,2,3,4
			newnumber[i-4] = number[i];
		}
		
		//arraycopy메소드 배열복사
		System.arraycopy(number, 4, newnumber, 0, 20);
		
		//출력
		for(int i=0;i<newnumber.length;i++) {
			System.out.println(newnumber[i]);
		}
		
		
		
		
		
//		int[] number = {1,2,3,4,5};
//		int[] newNumber = new int[10];
//		
//		//System.arraycopy() 메소드 사용해서 배열 복사
//		System.arraycopy(number, 1, newNumber, 3, 2);
//		
//		//for사용한 배열 복사
////		for(int i=0;i<number.length;i++) {
////			newNumber[i] = number[i];
////		}
//		
//		for(int i=0;i<newNumber.length;i++) {
//			System.out.println(newNumber[i]);
//		}

	}

}
