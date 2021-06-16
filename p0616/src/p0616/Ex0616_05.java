package p0616;

public class Ex0616_05 {

	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동",100,100,100);
		Student s2 = new Student(2,"이순신",90,90,90);
		
		
		System.out.println("s1의 class 이름 : "+s1.getClass().getSimpleName());
		
		
		// 입력된 데이터를 출력하시오.
		System.out.println(s1);
		System.out.println(s1.getStuNo());
		System.out.println(s1.getName());
		System.out.println(s1.getKor());
		System.out.println(s1.getEng());
		System.out.println(s1.getMath());
		System.out.println(s2);
		
		

	}

}
