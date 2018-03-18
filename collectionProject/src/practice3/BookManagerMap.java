package practice3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

import practice2.AscCategory;
import practice2.Book;

public class BookManagerMap {
	private Map<String, Book> booksMap;
	
	public BookManagerMap(){
		this.booksMap = new HashMap<String, Book>();
	}
	
	public BookManagerMap(HashMap<String, Book> map){
		this.booksMap = map;
	}
	
	public void putBook(Book book){
		booksMap.put(book.getsNo(), book);
	}
	
	public void removeBook(String title){
		String key = searchBook(title);
		booksMap.remove(key);
	}
	
	public String searchBook(String bTitle){
		String result = null;
		Book book;

		Set<Entry<String, Book>> entry = booksMap.entrySet();
		Iterator<Entry<String, Book>> entryiter = entry.iterator();
		
		while(entryiter.hasNext()){
			book = entryiter.next().getValue();
			if(bTitle.equals(book.getTitle())){
				result = book.getsNo();
			}
		}
		
		return result;
	}
	
	public void displayAll(){
		Set<String> set = booksMap.keySet();
		Iterator setiter = set.iterator();
		
		while(setiter.hasNext()){
			System.out.println(booksMap.get(setiter.next()).toString());
		}

	}
	
	public Book[] sortedBookMap(){
		Book[] book = new Book[booksMap.size()];

		int temp=0;
		Book booktemp;
		for(int i=0; i<booksMap.size(); i++){
			booktemp = booksMap.get(i);
			for(int j=i+1; j<booksMap.size(); j++){
				temp = booktemp.getTitle().compareTo(booksMap.get(j).getTitle());
				if(temp>0){
					booktemp = booksMap.get(j);
					booksMap.put(String.valueOf(j), booksMap.get(i));
					booksMap.put(String.valueOf(i), booktemp);
				}
			}
			book[i] = booktemp;
		}
		
		return book;
	}
	
	public void printBookMap(Book[] br){
		for(Book result:br){
			System.out.println(result.toString());
		}
	}
	
	public void printBook(String key){
		System.out.println(booksMap.get(key).toString());
	}
}
