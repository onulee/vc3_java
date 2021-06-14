package p0614;

abstract public class Player { //추상클래스
	
	int playPoint;
	
	//생성자
	Player(){
		playPoint=0;
	}
	
	abstract void play(int point); //추상메소드
	abstract void stop();
	
	
	void play() {
		play(playPoint);
	}
	

}
