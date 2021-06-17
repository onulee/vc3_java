package p0617;

import java.util.Scanner;

public class Ex0617_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] fileName = { "Windows", "windows", "winDows", "Win", "window", "Window", "wins" };

		System.out.println("검색할 단어를 입력하세요.>>");

		String input = scan.nextLine().trim(); //앞뒤공백 제거
		input = input.replaceAll(" ", ""); // 중간공백 제거
		System.out.println("input 단어 : " + input);
		int count = 0;
		System.out.println("[ 단어 검색 ]");
		for (int i = 0; i < fileName.length; i++) {
			if (fileName[i].equals(input)) {
				count++;
				System.out.println("단어 : " + fileName[i]);
			}
		}

//		while(true) {
//			System.out.println("찾고자하는 문자를 입력하세요.>>");
//			String input = scan.next();
//			if(input.length()>4) {
//				System.out.println("3자리 이하를 입력하셔야 합니다.");
//				continue;
//			}
//			
//			int index = str.indexOf(input);
//			System.out.println(input+" 찾는 문자 : "+index);
//			
//		}

	}

}
