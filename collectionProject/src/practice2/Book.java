package practice2;


public class Book{
	private String sNo;
	private int category;
	private String title;
	private String author;
	
	public Book(){
		
	}
	
	public Book(String sNo, int category, String title, String author){
		this.sNo = sNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString(){
		return sNo+" "+category+" "+title+" "+author+" ";
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
