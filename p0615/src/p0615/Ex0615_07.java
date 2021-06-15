package p0615;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex0615_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		File f = new File("c:/work1/f1.txt");
		try {
			FileWriter fw = new FileWriter(f,true);
			System.out.println("글자를 입력하세요.>>");
			String str = scan.nextLine();
			fw.write(str+"\r\n");
			fw.flush();
			fw.close();
			System.out.println("글자가 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
