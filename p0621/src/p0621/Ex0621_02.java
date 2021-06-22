package p0621;

import java.util.ArrayList;

public class Ex0621_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		StringBuffer sbf = new StringBuffer("");
		
		list.add(new Student(1,"홍길동",100,100,100));
		list.add(new Student(2,"이순신",90,90,91));
		list.add(new Student(3,"유관순",99,99,98));
		list.add(new Student(4,"강감찬",80,80,89));
		list.add(new Student(5,"김구",100,100,99));
		list.add(new Student(6,"김유신",70,70,79));
		list.add(new Student(7,"이율곡",99,99,100));
		list.add(new Student(1,"홍길동",100,100,100));
		
		for(int i=0;i<list.size();i++) {
			Student s = (Student) list.get(i);
			if(i==0) {
				sbf.append(s.getName());
			}else {
				sbf.append(","+s.getName());
			}
		}
		
		System.out.println("이름StringBuffer : "+sbf.toString());
		
		String[] strName = sbf.toString().split(",");
		for(String i:strName) {
			System.out.println("이름StringBufferfor : "+i);
		}
		for(int i=0;i<list.size();i++) {
			Student s = (Student) list.get(i);
			System.out.print("학생성적list : "+s.getStuNo()+",");
			System.out.print(s.getName()+",");
			System.out.print(s.getKor()+",");
			System.out.print(s.getEng()+",");
			System.out.print(s.getMath()+",");
			System.out.println(s.getTotal());
		}
		
		
		// 1 홍길동 100 100 100
		// 2 이순신 90 90 91
		// 3 유관순 99 99 98
		// 4 강감찬 80 80 89
		// 5 김구 100 100 99
		// 6 김유신 70 70 79
		// 7 이율곡 99 99 100
		// 7명의 학생성적을 ArrayList에 넣은 후
		// 이름을 StringBuffer에 추가할때 ","로 구분해서 저장할것
		// 이름을 출력할것
		// 2. StringBuffer에 있는 데이터를 각각 분리해서
		// 이름을 각각 출력을 해보세요.
		// 3. ArrayList에 있는 데이터 모두 출력하시오.

	}

}
