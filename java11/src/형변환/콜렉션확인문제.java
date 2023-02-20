package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		HashMap map = new HashMap();
		ArrayList list = new ArrayList();
		
		// 문제 1
		set.add("경주");
		set.add("부산");
		set.add("서울");
		set.add("제주");
		set.add("강원");
		System.out.println(set);
		
		// 문제 2
		map.put("안방", "TV");
		map.put("거실", "쇼파");
		map.put("부엌", "냉장고");
		map.put("현관", "신발");
		System.out.println(map);
		System.out.println(map.get("현관"));
		map.replace("거실", "책상");
		System.out.println(map);
		
		// 문제 3. 할 일 우선순위 (순서) ==> list
		list.add("바닥 쓸기");
		list.add("빨래하기");
		list.add("설거지하기");
		list.add("공부하기");
		list.add("놀기");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		list.set(1, "청소");
		System.out.println(list);
	}

}
