package layout;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main1 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JPanel jp1, jp2, jp3;
		
		jf.setBounds(100,100,500,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new GridLayout(1,3,5,5));
		
		jf.add(jp1 = new Panel1());
		jf.add(jp2 = new Panel2());
		jf.add(jp3 = new Panel3());
		
		jf.setVisible(true);
		
		//vo -> panel여러개
		//manager -> 각 패널 프레임에 붙이고 관리(이벤트)
		//main -> 실행클래스
	}

}
