package p0617;

public class Ex0617_04 {

	public static void main(String[] args) {
		String str = "Hello";
		String str2 ="반갑습니다.";
		System.out.println("그냥출력 : "+str);
		System.out.println("toString()사용해서 출력 : "+str.toString());
		
		double d = 5.0;
		String s1 = d+""; //String 형변환
		String s2 = String.valueOf(d); //String형 변환
		double d2 = Double.parseDouble(s2); // String->Double형 변환
		          //Integer.parseInt(s2)

	}
	
	

}
