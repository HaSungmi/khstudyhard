package kh.set;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(5);
		ts.add(7);
		ts.add(1);
		ts.add(3);
		ts.add(4);
		
		System.out.println(ts);
		//자동으로 정렬됨(오름차순) -> 같은 타입의 데이터만 넣어야 함
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("javaScript");
		ts2.add("jQuery");
		ts2.add("oracle");
		ts2.add("html");
		ts2.add("css");
		
		System.out.println(ts2);
	}

}
