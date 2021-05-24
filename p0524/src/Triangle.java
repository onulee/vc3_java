
public class Triangle extends Shape {
	Point[] p;
	
	Triangle(){} //기본생성자
	
	Triangle(Point[] p){
		this.p = p;
	}
	
	Triangle(Point p1,Point p2,Point p3){
		p = new Point[] {p1,p2,p3};
	}

}
