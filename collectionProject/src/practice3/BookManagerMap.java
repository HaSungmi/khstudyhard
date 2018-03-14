package practice3;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import practice2.AscCategory;
import practice2.Book;

public class BookManagerMap {
	private HashMap<String, Book> booksMap;
	
	public BookManagerMap(){
		this.booksMap = new HashMap<String, Book>();
	}
	
	public BookManagerMap(HashMap<String, Book> map){
		this.booksMap = map;
	}
	
	public void putBook(Book book){
		booksMap.put(book.getsNo(), book);
	}
	
	public void removeBook(String key){
		booksMap.remove(key);
	}
	
	public String searchBook(String bTitle){
		String result = null;
		//entrySet이용하는 방법???

		for(int i=0; i<booksMap.size(); i++){
			if(bTitle.equals(booksMap.get(i).getTitle())){
				result = booksMap.get(i).getsNo();
				break;
			}
		}
		
		return result;
	}
	
	public void displayAll(){
		for(int i=0; i<booksMap.size(); i++){
			System.out.println(booksMap.get(i).toString());
		}
	}
	
	public Book[] sortedBookMap(){
		Book[] book = new Book[booksMap.size()];
		AscCategory asc = new AscCategory();
		
		int temp=0;
		Book booktemp;
		for(int i=0; i<booksMap.size(); i++){
			booktemp = booksMap.get(i);
			for(int j=i+1; j<booksMap.size(); j++){
				temp = asc.compare(booktemp, booksMap.get(j));
				if(temp<0){
					booktemp = booksMap.get(j);
					booksMap.put(String.valueOf(j), booksMap.get(i));
					booksMap.put(String.valueOf(i), booktemp);
				}
			}
			book[i] = booktemp;
		}
		
		return book;
	}
}
