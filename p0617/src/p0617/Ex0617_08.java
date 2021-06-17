package p0617;

import java.util.ArrayList;
import java.util.List;

public class Ex0617_08 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1); //1->int -> Integer :오토박싱 (Wrapper클래스)
		list.add(new Student(1,"홍길동")); //객체
		list.add(2); // int
		list.add("aaa"); //String
		list.add(12.5); //double
		list.add(new Student(2,"이순신")); //객체
		
		for(int i=0;i<list.size();i++) {
			System.out.println("list"+(i+1)+"번째 : "+list.get(i));
		}
		
		list.remove(0);
		
		System.out.println("------------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println("list"+(i+1)+"번째 : "+list.get(i));
		}
		
//		System.out.println("list 1번째 : "+list.get(0));
//		//list.get(1)->Object객체, Student객체 형변환을 시켜야 사용가능
//		System.out.println("list 2번째 : "+((Student)list.get(1)));
//		System.out.println("list 3번째 : "+list.get(2));
//		System.out.println("list 4번째 : "+list.get(3));
//		System.out.println("list 5번째 : "+list.get(4));
//		System.out.println("list 6번째 : "+list.get(5));
		
//		list.remove(0);
//		System.out.println("------------------------------");
//		System.out.println("list 1번째 : "+list.get(0));
//		//list.get(1)->Object객체, Student객체 형변환을 시켜야 사용가능
//		System.out.println("list 2번째 : "+list.get(1));
//		System.out.println("list 3번째 : "+list.get(2));
//		System.out.println("list 4번째 : "+list.get(3));
//		System.out.println("list 5번째 : "+list.get(4));

		
	}
	
	
	
	

}
