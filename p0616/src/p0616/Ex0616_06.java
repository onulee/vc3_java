package p0616;

public class Ex0616_06 {

	//main메소드
	public static void main(String[] args) { //매개변수
		
		String str="hello";
		str.charAt(2); //->l
		
		String str2 = "789450";
		char ch = str2.charAt(0);
		System.out.println("ch charAt : "+ch);
		//ch -> int로 변경하는 방법
		int num = ch-'0';  //7-> 55-48=7
		int num2 = 8; //String 방법 : 8+""="8"
		
		System.out.println("str2.subString(0,3) : "+str2.substring(0,3));
		
		
		String str3 ="자바수업이 끝나가고 있습니다.";
		System.out.println(str3.substring(0,5));
		System.out.println(str3.substring(11,15));
		
		
//		char a =' ';
//		String str =""; //빈공백이 데이터에 저장
//		String str2 = null; //데이터 저장공간이 없음.
//		
//	    String s1=""; // s1,s2,s3 -> 같은 공간을 사용
//	    String s2="";
//	    String s3="";
//	    
//	    String s4 = new String(""); //s4,s5,s6는 다른공간을 사용
//	    String s5 = new String("");
//	    String s6 = new String("");

	}

}
