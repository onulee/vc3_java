package p0616;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex0616_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File file1 = new File("c:/temp01/student.txt");
		//데이터
		int count=0,stuNo=0,kor=0,eng=0,math=0,total=0;
		double avg=0;
		String name="";
		//파일저장 임시변수
		
		//데이터 입력
		while(count<2) {
			String content="";
			System.out.println("학번을 입력하세요.>>");
			stuNo = scan.nextInt();
			content += stuNo+",";
			System.out.println("이름을 입력하세요.>>");
			name = scan.next();
			content += name+",";
			System.out.println("국어점수를 입력하세요.>>");
			kor = scan.nextInt();
			content += kor+",";
			System.out.println("영어점수를 입력하세요.>>");
			eng = scan.nextInt();
			content += eng+",";
			System.out.println("수학점수를 입력하세요.>>");
			math = scan.nextInt();
			content += math+",";
			total = kor+eng+math;
			content += total+",";
			avg = total/3.0;
			content += avg;  //1,홍길동,100,100,100,300,100.0
			                 //2,이순신,90,90,90,270,90
			//파일저장
			try {
				if(!file1.exists()) {
					file1.createNewFile();
				}
				FileWriter fw = new FileWriter(file1,true);
				fw.write(content+"\r\n");
				fw.flush();
				fw.close();
				System.out.println("파일이 저장되었습니다.!");
			} catch (Exception e) {e.printStackTrace();}
			count++;
		}//while
		
		
		//파일 읽기
		try {
			Scanner scan2 = new Scanner(file1);
			String str="";
			while(scan2.hasNextLine()) {  //현재 읽어들일 한줄의 데이터가 있는지 확인메소드
				str +=scan2.nextLine()+",";  // 1,홍길동,100,100,100,300,100,2,이순신,90,90,90,270,90
			}
			// 전체출력
			System.out.println("전체 데이터 : "+str);
			String[] strArr = str.split(",");  //split은 ,를 기준으로 문자열을 나눠서 반환.
		    // 각각의데이터 출력
			for(int i=0;i<strArr.length;i++) {
		    	System.out.println("각자 데이터 : "+strArr[i]);
		    }
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
		
		
	}//main

}//class
