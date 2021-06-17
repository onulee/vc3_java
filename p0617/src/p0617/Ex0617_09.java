package p0617;

import java.util.HashSet;
import java.util.Iterator;

public class Ex0617_09 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(new Tv(1,"OLEDTV"));
		hs.add(3);
		hs.add(new Tv(2,"OLEDTV2"));
		hs.add(4);
		hs.add(new Student(1,"홍길동"));
		
		Iterator itr = hs.iterator(); //set컬렉션에서 Iterator객체를 가져옴.
		
		while(itr.hasNext()) {  //hasNext():읽어올 데이터가 있는지 확인
			Object obj = itr.next(); //next():객체를 1개 가져옴.
			if(obj instanceof Student) {
				System.out.println("데이터 : "+((Student) obj).name);
			}else if(obj instanceof Tv) {
				System.out.println("데이터 : "+((Tv) obj).name);
			}else {
				System.out.println("데이터 : "+obj); 
			}
			
		}
		
		hs.remove(3);
		System.out.println("-----------------------------------------");
		Iterator itr2 = hs.iterator(); //set컬렉션에서 Iterator객체를 가져옴.
		while(itr2.hasNext()) {  //hasNext():읽어올 데이터가 있는지 확인
			System.out.println("데이터 : "+itr2.next()); //next():객체를 1개 가져옴.
		}
		

	}

}
