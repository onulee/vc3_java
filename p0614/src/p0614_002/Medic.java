package p0614_002;

public class Medic extends GroundUnit implements Healable {

	Medic() {
		super(30);
		hitPoint = MAX_HP;
	}
	
	void healing(Healable h) {
		Unit u = (Unit)h;
		while(u.hitPoint != u.MAX_HP) {
			u.hitPoint++;
		}
		if(u.hitPoint==u.MAX_HP) {
			System.out.println(u.hitPoint + "체력으로 치료가 완료되었습니다.!");
		}
	}

}
