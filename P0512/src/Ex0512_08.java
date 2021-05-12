import java.util.Scanner;

public class Ex0512_08 {

	public static void main(String[] args) {
		// 3개를 입력받아 출력하고
		// 로또번호 3개를 출력해보세요.
		//1. 3개 입력받아 출력
		//2. 로또번호 배열생성
		//3. 로또번호 순차적으로 번호넣기
		//4. 로또번호 섞기
		//5. 로또번호 3개 출력하기
		
	    Scanner scan = new Scanner(System.in);
	    int[] input = new int[6]; //입력받을 배열
	    //번호입력
	    for(int i=0;i<input.length;i++) {
	    	System.out.println((i+1)+"번째 숫자를 입력하세요.>>");
	    	input[i] = scan.nextInt();
	    }
	    //번호출력
	    System.out.println("[ 내가 입력한 번호 ]");
	    for(int i=0;i<input.length;i++) {
	    	System.out.print(input[i]+" ");
	    }
	    System.out.println();
	    
	    //-----------------------------------------
	    
	    //1. 로또번호배열생성 45개
	    int[] ball = new int[45]; 
	    //2. 번호넣기
	    for(int i=0;i<ball.length;i++) {
	    	ball[i] = i+1;
	    }
	    //3. 번호섞기
	    for(int i=0;i<200;i++) {
	    	int temp=0; //임시저장변수
	    	int randomNo=0; //랜덤주소변수
	    	randomNo = (int)(Math.random()*45);
	    	//0번방과 랜덤방 값변경
	    	temp = ball[0];
	    	ball[0]=ball[randomNo];
	    	ball[randomNo] = temp;
	    }
	    
	    //4. 로또번호 출력
	    System.out.println("[ 로또번호 ]");
	    for(int i=0;i<6;i++) {
	    	System.out.print(ball[i]+" ");
	    }
	    System.out.println();
	    
	    //5. 같은 번호 찾기
	    int count=0;
	    int[] win = new int[6]; //당첨번호배열
	    for(int i=0;i<6;i++) {
	    	for(int j=0;j<6;j++) {
	    		if(input[i]==ball[j]) {
	    			win[count]=input[i]; //당첨번호를 당첨배열에 저장
	    			count++;
	    		}
	    	}
	    }
	    
	    System.out.println("[ 당첨번호 개수 : "+count + " 개 ]");
	    System.out.println("[ 당첨번호 ]");
	    for(int i=0;i<count;i++) {
	    	System.out.print(win[i]+" ");
	    }
	    System.out.println();
	    
	    
	    
	    
		
		
		
		
		
		
		

	}

}
