package silsub.silsub2;

import java.io.*;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);
	
	public MyNote() {}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		
		System.out.println("파일에 저장할 내용을 입력하세요 : ");
		
		while(true) {
			String s = sc.nextLine();
			if(s.equals("exit")) {
				break;
			}
			
			sb.append(s + "\n");
		}
		
		System.out.print("저장하시겠습니까?(y/n) : ");
		char yn = sc.next().toUpperCase().charAt(0);
		
		if(yn == 'Y') {
			System.out.print("저장할 파일명을 입력하세요 : ");
			sc.nextLine();
			String fileName = sc.nextLine();
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
				bw.write(sb.toString());
				System.out.println(fileName + "에 성공적으로 저장하였습니다.");
				System.out.println();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
		System.out.print("열기할 파일명 : ");
		String fileName = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			System.out.println();
			System.out.println(fileName + "에 있는 데이터를 읽어왔습니다.");
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileEdit() {
		StringBuilder sb = new StringBuilder();
		System.out.print("수정할 파일명 : ");
		String fileName = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName));
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));){
			
			String line;
			
			while((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			System.out.println("파일에 추가할 내용을 입력하세요. ");
			while(!(line = sc.nextLine()).equals("exit")) {
				sb.append(line + "\n");
			}
			
			System.out.print("변경된 내용을 파일에 추가하시겠습니까?(y/n) : ");
			String str = sc.nextLine();
			if(str.toUpperCase().charAt(0) == 'Y') {
				bw.write(sb.toString());
				System.out.println(fileName + "의 내용이 변경되었습니다.");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
