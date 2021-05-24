
public class Circle extends Shape{

	Point center;  // 객체주소 참조변수 - x,y
	int r;
	
	Circle(){ //기본생성자
		this(new Point(0,0),100);
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
}
