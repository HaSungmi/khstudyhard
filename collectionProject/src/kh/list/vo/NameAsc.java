package kh.list.vo;

import java.util.Comparator;

public class NameAsc implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2){
		MemberVo m1 = (MemberVo)o1;
		MemberVo m2 = (MemberVo)o2;
		
		//양수를 리턴->앞의 수가 더 크다 => 순서를 바꾼다.(오름차순)
		return (m1.getMemberName()).compareTo(m2.getMemberName());
	}
	
}
