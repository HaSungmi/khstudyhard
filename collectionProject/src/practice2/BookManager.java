package practice2;

import java.util.ArrayList;
import java.util.Iterator;

public class BookManager {
	private ArrayList<Book> bookList = new ArrayList<Book>();
	//ArrayList<Book> ->제네릭 =>book타입만 넣겠다고 선언 => 리스트에서 꺼내서 사용할때 다운캐스팅 필요 없음.
	
	public BookManager(){
		
	}
	
	public BookManager(ArrayList<Book> list){
		this.bookList = list;
	}
	
	public void addBook(Book book){
		bookList.add(book);
	}
	
	public void deleteBook(String bookTitle){
		int index = -1;
		for(int i=0; i<bookList.size(); i++){
			if(bookTitle.equals(bookList.get(i).getTitle())){
				index = i;
			}
		}
		bookList.remove(index);
	}
	
	public int searchBook(String bTitle){
		int idx=-1;
		
		for(int i=0; i<bookList.size(); i++){
			if(bTitle.equals(bookList.get(i))){
				idx =  i;
			}
		}
		
		return idx;
	}
	
	public void printBook(int idx){
		System.out.println(bookList.get(idx).toString());
	}
	
	public void displayAll(){
		Iterator<Book> iter = bookList.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	
	public Book[] sortedBookList(){
		Book[] book = new Book[bookList.size()];
		AscCategory asc = new AscCategory();
		
		///정렬안됨
		int temp=0;
		Book booktemp;
		for(int i=0; i<bookList.size(); i++){
			booktemp = bookList.get(i);
			for(int j=i+1; j<bookList.size(); j++){
				temp = asc.compare(booktemp, bookList.get(j));
				if(temp<0){
					booktemp = bookList.get(j);
					bookList.set(j, bookList.get(i));
				}
			}
			book[i] = booktemp;
		}
		
		return book;
	}
	
	public void printBookList(Book[] br){
		for(Book result:br){
			System.out.println(result);
		}
	}

}
