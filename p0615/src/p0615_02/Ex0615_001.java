package p0615_02;

public class Ex0615_001 {

	public static void main(String[] args) {
		AClass a = new AClass();
		a.methodA(new BClassUp3()); //부모의 참조변수로 자손의 객체를 보내는 것.
		                            Iinterface i = new BClassUp3();
		
	}

}
