package silsub.silsub2;

import java.util.Scanner;

public class TestMyNote {

	public static void main(String[] args) {
		MyNote note = new MyNote();
		Scanner sc = new Scanner(System.in);
		int no;
		
		do {
			System.out.println("=========== MyNote ===========");
			System.out.println();
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.println();
			System.out.print("메뉴 선택 : ");
			no = sc.nextInt();
			
			switch(no) {
				case 1 : note.fileSave(); break;
				case 2 : note.fileOpen(); break;
				case 3 : note.fileEdit(); break;
				case 4 : System.out.println("MyNote프로그램을 종료합니다."); return;
				default : System.out.println("번호 선택이 잘못되었습니다.");
							System.out.println("다시 선택하십시오 \n");
			}
		}while(no != 4);
	}
}
