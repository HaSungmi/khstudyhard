package kh.map;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import kh.list.vo.MemberVo;

public class HashMapTest {

	public static void main(String[] args) {
		
//		Map map = new HashMap();
//		map.put("날씨", "흐림");
//		map.put("시간", "너무 빨리 감");
//		map.put(1, 150);
//		map.put("time", new Date());
//		map.put("날씨", "밥먹기 좋은날");
//		
//		
//		System.out.println(map);
//		
//		map.put(50, 150);
//		map.put(100, 150);
//		
//		System.out.println(map);
//		
//		String str = map.get("시간").toString();
//		System.out.println(str);
//		
//		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
//		System.out.println(format.format(map.get("time")));
//		
//		map.remove("날씨");
//		System.out.println(map);
		
		Map<Integer, MemberVo> map2 = new HashMap<Integer, MemberVo>();
		MemberVo mv1 = new MemberVo(10, "홍길동", new Date());
		MemberVo mv2 = new MemberVo(20, "임꺽정", new Date(0));
		MemberVo mv3 = new MemberVo(30, "고구려", new Date(952280202029L));
		MemberVo mv4 = new MemberVo(40, "가나다", new Date(9152280202029L));
		MemberVo mv5 = new MemberVo(50, "라마바", new Date(91252280202029L));
		MemberVo mv6 = new MemberVo(60, "사아자", new Date(3952280202029L));
		MemberVo mv7 = new MemberVo(70, "차카타", new Date(94552280202029L));
		
		map2.put(mv1.getMemberNo(), mv1);
		map2.put(mv2.getMemberNo(), mv2);
		map2.put(mv3.getMemberNo(), mv3);
		map2.put(mv4.getMemberNo(), mv4);
		map2.put(mv5.getMemberNo(), mv5);
		map2.put(mv6.getMemberNo(), mv6);
		map2.put(mv7.getMemberNo(), mv7);
		
		Set keys = map2.keySet();
		Iterator<Integer> keyiter = keys.iterator();
		
		int key = -1;
		MemberVo temp = null;
		while(keyiter.hasNext()){
			key = keyiter.next();
			temp = map2.get(key);
			System.out.println(key + " : " +temp.toString());
		}
		
		Set<Entry<Integer, MemberVo>> entry = map2.entrySet();
		Iterator<Entry<Integer, MemberVo>> entryiter = entry.iterator();
		
		while(entryiter.hasNext()){
			System.out.println(entryiter.next().toString());
		}

	}

}
