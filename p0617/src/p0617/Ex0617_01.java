package p0617;

import java.io.File;
import java.util.Scanner;

public class Ex0617_01 {

	public static void main(String[] args) {
		// work1 폴더에 txt파일이 몇개 있는지 출력해보세요.
		// 1. 전체 폴더에 파일을 모두 읽어오기
		// 2. txt 끝나는지 확인 카운트
		// 3. 카운트 출력      ( windows > *.log )
		Scanner scan = new Scanner(System.in);
		System.out.println("찾을려고 하는 폴더주소를 입력하세요.>>");
		String dir = scan.nextLine();
		System.out.println("파일 확장자명을 입력하세요.>>");
		String ext = scan.next();
		System.out.println("1. 포함되어 있는 형태 검색 ");
		System.out.println("2. 문자열로 끝나는 형태 검색 ");
		int choice = scan.nextInt();
		
		File fileName = new File(dir);
		File[] f_name = fileName.listFiles(); // 폴더안의 모든 파일들 정보 가져옴.
		// 배열만큼 for돌려서 이름을 비교
		int count=0; //txt파일 개수
		if(choice==1) {
			for(int i=0;i<f_name.length;i++) {
				if(f_name[i].getName().contains(ext)) {
					count++;
				}
			}
		}else {
			for(int i=0;i<f_name.length;i++) {
				if(f_name[i].getName().endsWith(ext)) {
					count++;
				}
			}
		}
		
		System.out.println("폴더안의 "+ext+"파일 개수 : "+count);

	}

}
