
public class Student2 {
	static int count;  //클래스 변수-객체생성없이 사용가능
	String stu_number; //인스턴스 변수-객체생성을 해야 사용가능
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{
		count++;
		stu_number = "S"+ count;  //S1 S2.....
	}
	
	Student2(){}
	Student2(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	

}
