package p0614;

import java.util.ArrayList;

public class Ex0614_03 {

	public static void main(String[] args) {
		
		ArrayList<Stu> list = new ArrayList<Stu>();
		
		Stu s1 = new Stu();
		s1.stu_num=1;
		s1.pw="1111";
		s1.name="홍길동";
		s1.nickName="길동스";
		Stu s2 = new Stu(2,"2222","이순신","순신스");
		// 3,3333,유관순,관순스
		// 4.4444,강감찬,감찬스
		// 5.5555,김구,구스
		
		
		System.out.println("s1객체 : "+s1); //객체를 print하면 -> toString
		System.out.println("s2객체 : "+s2);  //클래스@주소
		System.out.println("s2객체 번호 : "+s2.stu_num);
		System.out.println("s2객체 비밀번호 : "+s2.pw);
		System.out.println("s2객체 이름 : "+s2.name);
		System.out.println("s2객체 닉네임 : "+s2.nickName);
		
		list.add(s1);  //remove,get,size
		list.add(s2);
		
		//향상된 for문
		for(Object s:list) {
			int i=0;
			Stu s21 = (Stu)list.get(i);
			System.out.println(s21);
			i++;
		}
		
		for(int i=0;i<list.size();i++) {
			Stu s = (Stu)list.get(i);
			System.out.println(s.stu_num);
			System.out.println(s.pw);
			System.out.println(s.name);
			System.out.println(s.nickName);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//향상for문 - 배열, ArrayList
//		int[] arr1 = {1,2,3,4,5};
//		for(int num:arr1) {
//			System.out.println("int배열 : "+num);
//		}
//		
//		char[] ch = {'a','b','c'};
//		for(char a:ch) {
//			System.out.println("ch배열 : "+a);
//		}

	}

}
