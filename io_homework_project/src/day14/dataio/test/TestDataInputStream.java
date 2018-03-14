package day14.dataio.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataInputStream {

	public static void main(String[] args) {
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("employee.dat"));
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("employee.dat"))){
			
			dos.writeInt(1);
			dos.writeUTF("홍길동");
			dos.writeInt(24);
			dos.writeUTF("010-1111-1111");
			
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			
			
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}

	}

}
