package io.test;

import java.util.Scanner;

import ioproject1.io.silsub1.MyNote;

public class TestMyNote {

	public static void main(String[] args) {
		
		menu();
		
	}
	
	public static void menu(){
		MyNote mNote = new MyNote();
		Scanner sc = new Scanner(System.in);
		int menu=0;
		
		do{
		
		System.out.println("***** MyNote *****");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("4. 끝내기");
		
		System.out.print("메뉴 선택 : ");
		menu = sc.nextInt();

			switch(menu){
			case 1: mNote.fileSave(); break;
			case 2: mNote.fileOpen(); break;
			case 3: mNote.fileEdit(); break;
			case 4: return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
		}while(menu!=4);
		
	}

}
