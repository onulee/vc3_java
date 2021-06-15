
public class Ex0615_04 {

	public static void main(String[] args) throws Exception {
			method1();
	}
	
	static void method1() throws Exception{
			method2();
	}
	
	static void method2() throws Exception{
		try {
			throw new Exception(); //고의로 예외발생
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
