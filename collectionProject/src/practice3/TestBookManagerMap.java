package practice3;

import java.util.Scanner;

import practice2.Book;

public class TestBookManagerMap {

	public static void main(String[] args) {
		BookManagerMap bmm = new BookManagerMap();
		Scanner sc = new Scanner(System.in);

		int num=0;
		
		while (num != 6) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.println("-----------------------------");
			System.out.print("메뉴 선택 : ");
			num = sc.nextInt();
			
			switch(num){
			case 1: bmm.putBook(inputBook()); 
						System.out.println("추가 완료");
						break;
			case 2: bmm.printBookMap(bmm.sortedBookMap()); break;
			case 3: System.out.print("삭제할 도서 제목 : ");
						bmm.removeBook(inputBookTitle());
						System.out.println("삭제 완료");
						break;
			case 4: System.out.print("검색할 도서명 : ");
						bmm.printBook(bmm.searchBook(inputBookTitle()));
						break;
			case 5: bmm.displayAll(); break;
			case 6: System.out.println("시스템을 종료합니다.");
			 			break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}
	
	public static Book inputBook(){
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		
		System.out.print("sNo : ");
		book.setsNo(sc.next());
		System.out.print("category : ");
		book.setCategory(sc.nextInt());
		sc.nextLine();                       
		System.out.print("title : ");
		book.setTitle(sc.nextLine());
		System.out.print("author : ");
		book.setAuthor(sc.next());
		
		return book;
		
	}
	
	public static String inputBookTitle(){
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		
		return title;
	}

}
