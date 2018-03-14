package ioproject1.io.silsub1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);
	
	public MyNote(){
		
	}
	
	public void fileSave(){
		System.out.println("파일에 저장할 내용을 입력하시오.");
		StringBuilder sBuilder = new StringBuilder();
		
		String str =null;
		while(true){
			str = sc.nextLine();
			if(!(str.equals("exit"))){
				sBuilder.append(str+"\n");
			}else{
				break;
			}
			
		}
		
		System.out.print("저장하시겠습니까?(y/n) : ");
		char ch = sc.next().charAt(0);
		if(ch=='y'||ch=='Y'){
			System.out.print("저장할 파일명 : ");
			String fileName = sc.next();
			
			try(BufferedWriter out = new BufferedWriter(new FileWriter(fileName))){
				
				out.write(sBuilder.toString());
				System.out.println(fileName+".txt 파일에 성공적으로 저장하였습니다.");
				
			} catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen(){
		System.out.print("열기할 파일명 : ");
		String openFile = sc.next();
		
		try(BufferedReader in = new BufferedReader(new FileReader(openFile))){
			
			while(true){
				String line = in.readLine();
				if(line==null){
					break;
				}
				System.out.println(line);
			}
			
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void fileEdit(){
		StringBuilder sBuilder = new StringBuilder();
		System.out.print("수정할 파일명 : ");
		String editFile = sc.nextLine();
		
		try(BufferedReader in = new BufferedReader(new FileReader(editFile));
				BufferedWriter out = new BufferedWriter(new FileWriter(editFile))){
			
			String line; //줄 단위로 읽어오기
			
			while((line = in.readLine())!=null){
				sBuilder.append(line+"\n");
			}
			
			System.out.println("파일에 추가할 내용을 입력하시오.");
			while(!(line = sc.nextLine()).equals("exit")){
				sBuilder.append(line+"\n");
			}
			
			System.out.print("변경된 내용을 파일에 추가하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);
			if(ch=='y'||ch=='Y'){
				out.write(sBuilder.toString());
				System.out.println(editFile+".txt 파일의 내용이 변경되었습니다.");
			}
			
			System.out.println(sBuilder.toString());

			
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
