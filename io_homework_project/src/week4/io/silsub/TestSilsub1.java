package week4.io.silsub;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSilsub1 {

	public static void main(String[] args) {
		
		TestSilsub1 ts = new TestSilsub1();
		
//		ts.fileSave();
		ts.fileRead();

	}
	
	public void fileSave(){
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			System.out.print("파일명 입력 : ");
			String fileName = br.readLine();
			
			System.out.println(fileName);
			FileWriter out = new FileWriter(fileName);
			
			System.out.println("파일에 저장할 내용을 입력하시오.");
			
			String str=null;
			
			while(true){
				str = br.readLine();
				if(!(str.equals("exit"))){
					out.write(str+"\n");
				}else{
					System.out.println("파일에 성공적으로 저장되었습니다.");
					break;
				}
				
			}
			
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void fileRead(){
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			System.out.print("읽어올 파일명 : ");
			FileReader in = new FileReader(br.readLine());
			
			StringBuilder sBuilder = new StringBuilder();
			int c = 0;
			while((c=in.read())!=-1){
				sBuilder.append((char)c);
			}
			
			System.out.println(sBuilder.toString());
			
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
