package p0616;

public class Student {
	
	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	Student(){}
	Student(int stuNo,String name,int kor,int eng,int math){
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		String str = stuNo+","+name+","+kor+","+eng+","+math;  //1,홍길동,100,100,100
		return str;
	}
	
	

}
