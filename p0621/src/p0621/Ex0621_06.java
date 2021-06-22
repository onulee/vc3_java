package p0621;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex0621_06 {

	public static void main(String[] args) {
		// 홍길동,이순신,유관순,강감찬,김구,김유신,이율곡
		// 검색할 데이터 이름 입력받아 -> 그 데이터를 MapPro클래스의 메소드 매개변수로 넘겨서
		// 데이터를 검색한 다음
		// main으로 데이터를 넘겨 출력하시오.
		// 전체이름데이터, 검색했던 이름
		// 검색결과 -> "이름이 검색되었습니다.","이름이 검색되지 않았습니다."
		// 검색코드 -> "success","fail"
		Scanner scan = new Scanner(System.in);
		MapPro mp = new MapPro();
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"홍길동",100,100,100));
		list.add(new Student(2,"이순신",90,90,91));
		list.add(new Student(3,"홍길자",99,99,98));
		list.add(new Student(4,"강감찬",80,80,89));
		list.add(new Student(5,"김구",100,100,99));
		list.add(new Student(6,"김유홍",70,70,79));
		list.add(new Student(7,"이율곡",99,99,100));
		
		System.out.println("이름을 입력하세요.>>");
		String input = scan.next();
		//MapPro클래스의 selectPro메소드 호출
		HashMap map = mp.selectPro(list, input);
		
		System.out.println("전체이름 : "+map.get("nameAll"));
		System.out.println("결과 : "+map.get("result"));
		System.out.println("결과코드 : "+map.get("resultCode"));
		System.out.println("결과된 이름 : "+map.get("nameResult"));
		System.out.println("검색한 이름 : "+map.get("searchName"));
		

	}

}
