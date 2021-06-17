package p0617;

public class Ex0617_06 {

	public static void main(String[] args) {
		String str = new String("aaa");
		String str2 ="aaa"; //예외
		
		StringBuffer str3 = new StringBuffer("aaa");  //10만큼
		
		System.out.println("String str객체 출력 : "+str);
		System.out.println("StringBuffer str객체 출력 : "+str3);
		
		str = str+"bbb";
		System.out.println("String더하기 str객체 출력 : "+str);
		
		//str3 = str3+"ccc";
		str3.append("ccc");  //StringBuffer 문자열추가 메소드
		System.out.println("StringBuffer더하기 str객체 출력 : "+str3);
		
		//str3 = "aaaccc"; 012345
		
		str3.insert(1, "b");  //원하는 위치에 추가할때
		System.out.println("StringBuffer b더하기 str객체 출력 : "+str3);
		
		str3.deleteCharAt(4); //1개 문자를 삭제할때
		System.out.println("StringBuffer 삭제 str객체 출력 : "+str3);
		
		System.out.println("현재 저장공간 크기 보는명령어 : "+str3.capacity());
		
		
		

	}

}
