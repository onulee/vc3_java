package p0617;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex0617_10 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("aaa", 1234);
		map.put("bbb", 2345);
		map.put("ccc", 3456);
		map.put("ddd", 4567);
		
		System.out.println("데이터 : "+map.get("aaa"));
		System.out.println("데이터 : "+map.get("bbb"));
		System.out.println("데이터 : "+map.get("ccc"));
		System.out.println("데이터 : "+map.get("ddd"));
		
		System.out.println("-----------------------------------");
		Set eSet = map.entrySet();
		Iterator itr = eSet.iterator();
		while(itr.hasNext()) {
			System.out.println("Iterator 데이터 : "+itr.next());
		}
		
		Iterator itr2 = map.keySet().iterator();
		while(itr2.hasNext()) {
			Object o = itr2.next();
			System.out.print("Iterator 키 : "+ o);
			System.out.println(",value 값 : "+map.get(o));
		}
		
		
	}

}
