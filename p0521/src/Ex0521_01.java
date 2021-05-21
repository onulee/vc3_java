
public class Ex0521_01 {

	public static void main(String[] args) {
		// 기본생성자를 사용하여 객체 10개를 생성하시오.
		// white,auto,4  pink,auto,5  silver,auto,4
		// white,auto,4  black,auto,4 white,auto,4
		// white,auto,4  green,auto,5 white,auto,4

		Car[] c = new Car[10];
		c[0] = new Car();
		c[1] = new Car("pink","auto",5);
		c[2] = new Car("silver","auto",4);
		c[3] = new Car();
		c[4] = new Car("black","auto",4);
		c[5] = new Car();
		c[6] = new Car();
		c[7] = new Car("green","auto",5);
		c[8] = new Car();
		
//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door = 4;
//		Car c2 = new Car();
//		c2.color = "pink";
//		c2.gearType = "auto";
//		c2.door = 5;
		
		
		
		
	}

}
