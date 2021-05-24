import java.util.Scanner;

public class Ex0524_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Point[] in_point = new Point[3];
		
		//좌표 3개 입력받음.
		for(int i=0;i<in_point.length;i++) {
			in_point[i] = new Point(); //Point 객체생성
			System.out.println("1번째 X좌표를 입력하세요.");
			//0,0 -> int/char/String/double        10,0,10,10
			String input = scan.next();  //0,0
			String[] str = input.split(","); //,기준으로 분리해서 배열로 리턴
			in_point[i].x = Integer.parseInt(str[0]); //String->int변경
			//String -> int, 0+""->String '5'-'0' -> 5
			in_point[i].y = Integer.parseInt(str[1]); 
		}
		
		Point[] p = {in_point[0],in_point[1],in_point[2]};
		Triangle t1 = new Triangle(p);
		
		//좌표출력
		t1.triangle_point();
		
		//좌표길이
		t1.triangle_length();
		
		//좌표넓이
		t1.triangle_area();
		
		
	}//main

}//class
