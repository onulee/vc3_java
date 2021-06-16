package p0616;

public class Ex0616_03 {

	public static void main(String[] args) {
		String str = "1-홍길동-100-100-100-300-100";
		System.out.println("문자열 : "+str);
		String[] strArr = str.split("-");
		System.out.println("이름 : "+strArr[1]);
		System.out.println("합계 : "+strArr[5]);

	}

}
