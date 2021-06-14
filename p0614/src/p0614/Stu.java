package p0614;

public class Stu {
	
	int stu_num;
	String pw; 
	String name;
	String nickName;
	
	Stu(){}
	Stu(int stu_num,String pw,String name,String nickName){
		this.stu_num = stu_num;
		this.pw = pw;
		this.name = name;
		this.nickName = nickName;
	}
	
	@Override
	public String toString() {
		String str = stu_num+","+pw+","+name+","+nickName;
		return str;
	}
	

}
