
public class Ex0512_03 {

	public static void main(String[] args) {
		
		//구구단 출력 2*1=2, 2*2...2*5=10
		loop1:for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j>5) {
					//continue;
					break loop1;
				}
				System.out.printf("%d * %d = %d %n",i,j,(i*j));
			}
			System.out.println();
		}
		
		
		
		
//		double a = 14255.2345678;
//		int b = 100;
//		String str = "school";
//		System.out.println("println출력 : "+a+","+b);
//		System.out.printf("printf출력 : %9.2f,%d %n", a,b);
//		System.out.printf("printf출력 : %d %n", b);
//		System.out.printf("printf출력 : %s %n", str);
//		
//		for(int i=2;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				//System.out.println(i+"*"+j+"="+(i*j));
//				System.out.printf("%d * %d = %d %n",i,j,(i*j));
//			}
//		}
		
		

	}

}
