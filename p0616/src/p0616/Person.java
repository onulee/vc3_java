package p0616;

public class Person {
	long id;  //a 880101-1110555 <-> 880101-1110556    c->국어점수,영어점수

	@Override
	public boolean equals(Object obj) { //Object obj = Person p2 = new Person();
		if(obj!=null && obj instanceof Person) {
			Person p2 = (Person)obj;
			if(id==((Person)obj).id)return true;
			else return false;
		}else {return false;}
	}
}
