package p0615;

import java.io.File;
import java.io.IOException;

public class Ex0615_04 {

	public static void main(String[] args) {
		String filePath = "c:/work/file";
		File dir1 = new File(filePath);
		File f1 = new File("c:/work/file/file1.txt");
		
		//dir1.mkdir(); //-> c:/work 라는 폴더가 꼭 있어야 에러나지 않음.
		//dir1.mkdirs(); //-> c:/work가 없으면 work를 만들고, file폴더를 만들어 줌.
		
		if(dir1.exists()==false) {
			dir1.mkdirs();
			System.out.println("폴더가 생성되었습니다.");
		}
		
		if(f1.exists()==false) {
			try {
				f1.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
