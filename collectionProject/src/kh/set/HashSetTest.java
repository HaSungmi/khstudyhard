package kh.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetTest {

	public static void main(String[] args){
		Set set = new HashSet();
	      set.add(15);
	      set.add(2.55);
	      set.add(new Character('C'));
	      
	      System.out.println();
	      System.out.println(set.toString());
	      
	      System.out.println();
	      System.out.println(set.size());
	      System.out.println();
	      System.out.println(set.isEmpty());
	      System.out.println();
	      System.out.println(set.contains(15));
	      System.out.println();
	      System.out.println(set.toArray());
	      System.out.println();
	      System.out.println(set.remove(2.55));
	      System.out.println(set.remove(2.55));
	      
	      Iterator iter = set.iterator();
	      
	      int index = 1;
	      while(iter.hasNext()) {
	         System.out.println(index + " : "+ iter.next());
	         index++;
	      }
	      for(Object obj:set) {
	         System.out.println(obj.toString());
	      }
	      set.clear();
	      System.out.println(set.isEmpty());
	}
	
}
