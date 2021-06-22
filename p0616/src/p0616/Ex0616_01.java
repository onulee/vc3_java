package p0616;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex0616_01 {

	public static void main(String[] args) {
		//폴더 생성
		File dir1 = new File("c:/temp01/directory");
		if(!dir1.exists()) {
			dir1.mkdirs(); // temp01폴더가 없을경우 temp01폴더도 생성,directory폴더도 생성 
			//dir1.mkdir(); //  temp01폴더가 없을경우 에러, directory폴더를 생성할수 없음.
		}
		
		//파일 생성
		File file1 = new File("c:/temp01/file1.txt");
		if(!file1.exists()) {
			try {file1.createNewFile();} 
			catch (IOException e) {	e.printStackTrace();}
		}
		
		//글자저장
		try {
			FileWriter fw = new FileWriter(file1,true);
			String str = "다음수업은 jsp웹프로그래밍입니다.\n 다음주부터 시작합니다.";
			fw.write(str+"\r\n"); //\r은 마지막줄로 이동, \n 줄바꿈.
			fw.flush(); //버퍼에 기록되어 있는 내용을 모두 저장시키는 명령어
			fw.close();
			System.out.println("글자가 저장되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		//글자 읽기
		try {
			Scanner scan = new Scanner(file1); //System.in:화면으로 입력,File->파일로 입력
			String str = "";
			//StringBuffer str1 = new StringBuffer("");
			while(scan.hasNextLine()) {
				//str1.append(scan.nextLine()+"\n");
				str = str + scan.nextLine()+"\n";
//				scan.nextLine(); //enter키 전까지 한줄을 입력받는 것
//				scan.next();     // 사이띄우기 전까지 한 단어 입력받는 것
//				scan.nextInt();  // 정수 입력받는 것
			}
			
			File file2 = new File("c:/temp01/file2.txt"); 
			if(!file2.exists()) {
				file2.createNewFile();
			}
			
			FileWriter fw2 = new FileWriter(file2);
			//fw2.write(str1.toString());
			fw2.write(str);
			fw2.flush();
			fw2.close();
		} catch (Exception e) {e.printStackTrace();}
	}//main
}//class
