package p0614_002;

public class Tank extends GroundUnit implements Repairable{

	Tank() { //기본 생성자
		super(150); //탱크 체력 : 150
		hitPoint = MAX_HP; //Tank생성시 현재체력 : 150
	}

}
