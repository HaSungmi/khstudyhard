package layout;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import miniProjectEx.Ex2;

public class Main1 extends JFrame implements MouseListener{
	JFrame jf;
	CardLayout card;
	 JPanel jp1;
	 JPanel jp2;
	 JPanel jp3;

	public static void main(String[] args) {
		new Main1();
	}
	
	public Main1(){
		jf = new JFrame();

		jf.setBounds(100,100,500,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(card = new CardLayout());
		
		jf.add(jp1 = new Ex2(),"1");
		jf.add(jp2 = new Ex2(),"2");
		jf.add(jp3 = new Ex2(),"3");
		jp1.addMouseListener(this);
		jp2.addMouseListener(this);
		jp3.addMouseListener(this);
		
		jf.setVisible(true);
		
		//vo -> panel여러개
		//manager -> 각 패널들 프레임에 붙이고 관리(이벤트)
		//main -> 실행클래스
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getClickCount()%3==1){
			card.next(jp1.getParent());
		}else if(arg0.getClickCount()%3==2){
			card.next(jp2.getParent());
		}else if(arg0.getClickCount()%3==0){
			card.show(jp3.getParent(),"1");
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



}
