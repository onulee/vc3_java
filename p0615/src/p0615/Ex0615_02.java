package p0615;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0615_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int count=0;
		while(true) {
			System.out.println((count+1)+"번쩨 데이터를 입력하세요.>>");
			list.add(scan.nextInt());
			System.out.println((count+1)+"번째 데이터 값 : "+list.get(count));
			count++;
		}
		
		//System.out.println("예외처리를 하고 있습니다.");
		//System.out.prinln("예외처리를 하고 있습니다.");  //컴파일에러

	}

}
