
public class MyMath2 {
	long a,b; //인스턴수 변수 - 객체선언후 사용,클래스내 사용
	
	long add() { //인스턴스메소드 - 객체선언후 사용,클래스내 사용
		return a+b;
	}
	
	static long add(long a,long b) { //클래스메소드 - 객체선언없이 사용
		return a+b;
	}
	
	

}
