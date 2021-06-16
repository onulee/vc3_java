package p0616;

import java.util.Scanner;

public class Ex0616_07 {

	public static void main(String[] args) {
		// 복권 1조12345 -> 0-9까지 가능,00000-99999
		// 마지막 자리 -> 1천원
		// 2자리 -> 1만원
		// 3자리 -> 10만원
		// 4자리 -> 100만원
		// 5자리 -> 1000만원
		// 1번째 랜덤으로 숫자를 생성해서 1조12345 복권번호를 생성해 보세요.
		// 복권번호 : 0조00000, 9조45586, 3조11155, 5조12890...
		
		//데이터를 입력받아 숫자가 몇개 맞는지를 출력하시오.
		// 1조95494 -> 3조96694 -> 
		// 내가입력한 데이터 :  1조95494
		// 당첨된 복권데이터 :  3조96694
		//-------------------------
		//                  x oxxoo -> 3개가 당첨되었습니다.
		
		//당첨번호 int배열
		int[] inputNum = new int[6];
		//표시 배열
		char[] ch = new char[6];
		//복권번호입력
		Scanner scan = new Scanner(System.in);
		System.out.println("복권번호를 입력하세요.(ex>1조12345)>>");
		String input = scan.next(); //1조01234 
		//int 배열에 담기
		for(int i=0;i<=inputNum.length;i++) {
			if(i==0) {
				inputNum[i] = input.charAt(i)-'0';  //1| |01234
			}else if(i==1) continue;
			else { //2,3,4,5,6
				inputNum[i-1] = input.charAt(i)-'0';  //101234
			}
		}
		
		//복권당첨번호생성
		int[] num = new int[6];
		for(int i=0;i<num.length;i++) {
			num[i] = (int)(Math.random()*10);
		}
		
		//당첨개수 확인
		int count=0; //당첨개수
		for(int i=0;i<num.length;i++) {
			if(inputNum[i]==num[i]) {
				ch[i]='O';
				count++;
			}else {
				ch[i]='X';
			}
		}
		
		
		
		//입력번호 출력
		System.out.println(inputNum[0]+"조"+inputNum[1]+inputNum[2]+inputNum[3]+inputNum[4]+inputNum[5]);
		//복권당첨번호 출력
		System.out.println(num[0]+"조"+num[1]+num[2]+num[3]+num[4]+num[5]);
		System.out.println("-----------------------------------------");
		System.out.println(ch[0]+"조"+ch[1]+ch[2]+ch[3]+ch[4]+ch[5]);
		System.out.println("당첨 개수 : " + count);
	}

}
