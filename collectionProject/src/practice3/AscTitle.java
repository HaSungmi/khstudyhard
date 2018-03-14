package practice3;

import java.util.Comparator;

import practice2.Book;

public class AscTitle implements Comparator<Book>{

	@Override
	public int compare(Book arg0, Book arg1) {
		int result=0;
		
		Book book1 = arg0;
		Book book2 = arg1;
		if((book1.getTitle().compareTo(book2.getTitle()))<0){
			result = -1;
		}
		return result;
	}
	

	
}
