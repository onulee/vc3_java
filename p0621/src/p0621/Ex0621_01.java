package p0621;

public class Ex0621_01 {

	public static void main(String[] args) {
		String[] str = {"홍길동","이순신","유관순","강감찬","김유신"};
		StringBuffer sbf = new StringBuffer("");
		
		for(int i=0;i<str.length;i++) {
			if(i==0) {
				sbf.append(str[i]);      //홍길동,이순신,유관순,강감찬,김유신
			}else {
				sbf.append(","+str[i]);  //,이순신,유관순,강감찬,김유신  
			}
		}
		String str2 = sbf.toString();  //"홍길동,이순신,유관순,강감찬,김유신"
		String[] result = str2.split(",");
		
		for(String i:result) {
			System.out.println(i);
		}
		
		

	}

}
