package practice1;

import java.util.Iterator;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		int random = 0; 
		int[] arr = new int[6];
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		Iterator<Integer> iter;
		for(int i=0; i<6; i++){
			random = (int)(Math.random()*45)+1;
			iter = tree.iterator();
			while(iter.hasNext()){
				if(iter.next()==random){
					random = (int)(Math.random()*45)+1;
					break;
				}
			}
			tree.add(random);
		}
		
		iter = tree.iterator();
		for(int i=0; i<arr.length; i++){
			arr[i] = iter.next();
		}
		
		for(int result:arr){
			System.out.println(result);
		}
		
	}

}
