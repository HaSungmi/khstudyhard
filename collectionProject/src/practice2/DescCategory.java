package practice2;

import java.util.Comparator;

public class DescCategory implements Comparator<Book>{

	@Override
	public int compare(Book arg0, Book arg1) {
		int result=0;
		
		Book book1 = arg0;
		Book book2 = arg1;
		if(book1.getCategory()>book2.getCategory()){
			result = 1;
		}
		return result;
	}
}
