import java.util.Scanner;

public class Ex0517_04 {

	public static void main(String[] args) {
		// 번호,시(0-23),분(0-59),초(0-59.999)를 입력받아 출력하시오.
		// time[3][3], second[3]
		// int[] num,int[] hour,int[] minute,double[] second

		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		int[] hour = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];

		while (true) {
			System.out.println("[ 시간 프로그램 ]");
			System.out.println("1.시간입력");
			System.out.println("2.시간출력");
			System.out.println("3.시간수정");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			switch (choice) {

			case 1:
				for(int i=0; i<hour.length;i++) {
					num[i] = i+1;
					System.out.println("시를 입력하세요.>>");
					hour[i] = scan.nextInt();
					System.out.println("분을 입력하세요.>>");
					minute[i] = scan.nextInt();
					System.out.println("초를 입력하세요.>>");
					second[i] = scan.nextDouble();
				}

				break;
			case 2:
				for(int i=0; i<hour.length;i++) {
					System.out.print(num[i]+" : ");
					System.out.print(hour[i]+" : ");
					System.out.print(minute[i]+" : ");
					System.out.print(second[i]+"\n");
				}
				break;
			case 3:

				//수정부분 숙제
				
				
				
				
				break;
			}

		}

	}

}
