package p0621;

import java.util.ArrayList;
import java.util.HashMap;

public class MapPro {
	
	// 홍길동 이순신 홍길자 강감찬 김구 김유홍 이율곡 / 김
	public HashMap selectPro(ArrayList<Student> list,String input) {
		HashMap map = new HashMap();
		// 넘겨줄 데이터 선언
		StringBuffer nameAll = new StringBuffer("");
		StringBuffer nameResult = new StringBuffer("");
		String result="이름이 검색되지 않았습니다.";
		String resultCode="fail";
		// 넘어온 데이터 1개씩 비교
		for(int i=0;i<list.size();i++) {
			
		}
		
		for(Student s:list) {
			nameAll.append(s.getName()+" ");
			if(s.getName().contains(input)) {
				result="이름이 검색되었습니다.";
				resultCode="success";
				nameResult.append(s.getName()+" "); //김구 김유홍
			}
		}
		
		map.put("nameAll", nameAll.toString());
		map.put("result", result);
		map.put("resultCode", resultCode);
		map.put("nameResult", nameResult);
		map.put("searchName", input);

		return map;
	}
	
}
