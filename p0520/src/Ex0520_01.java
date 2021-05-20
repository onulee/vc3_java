

public class Ex0520_01 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		System.out.println("main x : "+d.x);
		
		d.x = change(d.x);
		
		System.out.println("change main x: "+d.x);
	}
	
	static int change(int x) {
		x = 250;
		System.out.println("change x : "+x);
		return x;
	}

}
