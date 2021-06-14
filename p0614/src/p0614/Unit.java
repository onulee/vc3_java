package p0614;

abstract public class Unit {
	int x,y;
	abstract void move(int x,int y);
	void stop() {
		System.out.println("그 자리 멈춤.");
	}

}
