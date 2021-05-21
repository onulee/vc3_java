
public class Ex0521_05 {

	public static void main(String[] args) {
		String num="";
		int count=0;
		//S001,S002
//		System.out.printf("%d \n",5);
//		System.out.printf("%,d \n",12345);  //12,345,678
//		System.out.printf("%07.2f \n",78.12345);
//		System.out.printf("%10s \n","더좋은");
		String str_num = "S"+String.format("%03d", ++count);

		System.out.println(str_num);
	}

}
