
public class Singleton {

	private static Singleton s = new Singleton();
	static int count;
	private int stu_num;
	private String name;
	
	{
		count++;
		stu_num = count;
	}
	
	private Singleton() {} //기본생성자

	public static Singleton getInstance() {
		if(s==null) { //메모리에 없을시 새롭게 생성해서 리턴
			s = new Singleton();
		}
		return s;
	}
	
	
	
	
	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
