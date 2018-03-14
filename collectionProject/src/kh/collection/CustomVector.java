package kh.collection;

public class CustomVector<E> {
	private Object[] objArr;
	private int size;
	
	public CustomVector(){
		
	}
	
	public CustomVector(int capacity){
		objArr = new Object[capacity];
	}
	
	public int capacity(){
		return this.objArr.length;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
//		if(size!=0){
//			return false;
//		}
//		return true;
		return size==0; //비교식은 true,false반환
	}
	
	public void add(Object obj){
		Object[] temp = new Object[objArr.length];
		
		if(size == capacity()){
			temp = objArr.clone();
			objArr = new Object[temp.length*2];
			for(int i=0; i<temp.length; i++){
				objArr[i] = temp[i];
			}
			
			objArr[size] = obj;
			size++;
			
		}else{
			objArr[size] = obj;
			size++;
		}
	}
	
	public Object get(int index){
		if(index<0||index>objArr.length){
			throw new IndexOutOfBoundsException("없는 인덱스 요청!");
		}else{
			return objArr[index];
		}

	}
	
	public int indexOf(Object obj){
		int idx=-1;
		
		for(int i=0; i<objArr.length; i++){
			if(obj==objArr[i]){
				idx = i;
				break;
			}
		}
		
		return idx;
	}
	
	public boolean remove(Object obj){
		boolean flag = false;
		
		int idx = indexOf(obj);
		if(idx!=-1){
			objArr[idx] = null;
			System.arraycopy(objArr, idx+1, objArr, idx, size-idx-1);
			objArr[size-1]=null;
			flag = true;
		}
		
		return flag;
	}
	
	@Override
	public String toString(){
		String str="";
		
		for(Object obj:objArr){
			str += obj+", ";
		}
		
		return str;
	}
	
}
