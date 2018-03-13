package kh.list;

import java.util.*;

import kh.list.vo.MemberVo;
import kh.list.vo.NameAsc;

public class ListTest {

	public static void main(String[] args) {
		
		List list = new ArrayList();//list는 인터페이스 -> 객체생성X => 후손클래스로 생성=ArrayList
		list.add(5);
		list.add(7);
		list.add(20);
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		MemberVo mv1 = new MemberVo(10, "홍길동", new Date());
		MemberVo mv2 = new MemberVo(20, "임꺽정", new Date(0));
		MemberVo mv3 = new MemberVo(30, "고구려", new Date(952280202029L));
		MemberVo mv4 = new MemberVo(40, "가나다", new Date(9152280202029L));
		MemberVo mv5 = new MemberVo(50, "라마바", new Date(91252280202029L));
		MemberVo mv6 = new MemberVo(60, "사아자", new Date(3952280202029L));
		MemberVo mv7 = new MemberVo(70, "차카타", new Date(94552280202029L));
		
		List list2 = new ArrayList();
		
		list2.add(mv1);
		list2.add(mv2);
		list2.add(mv3);
		list2.add(mv4);
		list2.add(mv5);
		list2.add(mv6);
		list2.add(mv7);
		
		
		for(Object result:list2){
			System.out.println((MemberVo)result);
		}
		
		System.out.println(list2.size());
		
		
		list2.sort(new NameAsc());
		
		for(Object result:list2){
			System.out.println((MemberVo)result);
		}
	}

}
