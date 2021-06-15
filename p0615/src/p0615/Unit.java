package p0615;

public class Unit {
	int hitPoint; //현재체력
	final int MAX_HP; // 최대체력 100
	
	Unit(int hp){
		MAX_HP=hp;
		hitPoint = MAX_HP;
	}

}
