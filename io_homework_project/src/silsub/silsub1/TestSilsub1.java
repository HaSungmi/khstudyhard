package silsub.silsub1;

import java.io.*;

public class TestSilsub1 {
	
	public void fileSave() {
		BufferedReader br = null;
		FileWriter fin = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("파일명을 입력하세요 : ");
			String fileName = br.readLine();
			
			fin = new FileWriter(fileName);
			
			String str = null;
			
			System.out.println("파일에 저장할 내용을 입력하시오.");
			while(true) {
				str = br.readLine();
				if(!str.equals("exit")) {
					fin.write(str + "\n");
				}else {
					System.out.println("파일에 성공적으로 저장하였습니다.");
					break;
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileRead() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("읽을 파일 이름을 입력하세요 : ");
			String fileName = br.readLine();
			
			FileReader fout = new FileReader(fileName);
			int value;
			StringBuilder sb = new StringBuilder();
			
			while((value = fout.read()) != -1) {
				sb.append((char)value);
			}
			
			String str = sb.toString();
			System.out.println(str);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		TestSilsub1 test = new TestSilsub1();
//		test.fileSave();
		test.fileRead();
	}

}
