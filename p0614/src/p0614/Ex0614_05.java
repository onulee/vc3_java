package p0614;

public class Ex0614_05 {

	public static void main(String[] args) {
		// marine 8명, 탱크 7대, 수송선 5대 생성
		Unit[] u = new Unit[20];
		for(int i=0;i<u.length;i++) {
			if(i<8) {
				u[i]=new Marine();
			}else if (i<15) {
				u[i]=new Tank();
			}else {
				u[i]=new Dropship();
			}
		}
		
		//이동 x=1000, y=2000
		for(int i=0;i<u.length;i++) {
			u[i].move(1000, 2000);
		}

	}

}
