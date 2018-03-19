package miniProjectEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex2 extends JPanel implements KeyListener{
	String sol = null;
	String[] images = {"up.PNG", "left.PNG", "down.PNG", "right.PNG"};
	JPanel jp;
	int count = 0;
	JLabel[] l_name =new JLabel[15];
	CardLayout card;
	int countNum=0;
	
	public static void main(String[] args) {

		new Ex2();	
	
	}
	
	public Ex2(){
		JFrame jf = new JFrame();
		
		jf.setSize(1000,700);
		jf.setTitle("미니게임1");
		jf.setLayout(card = new CardLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jp =  new JPanel();
		jp.setLayout(new GridLayout(3,5,10,10));

		
		int num=0;
		int ranNum = 0;
		String str = "";
		while(num<15){
			ranNum = (int)(Math.random()*4);
			str += ranNum+"";
			jp.add(l_name[num] = new JLabel(new ImageIcon(images[ranNum])));
			System.out.println(l_name[num]);
			l_name[num].addKeyListener(this);
			num++;
		}
		sol = str;
		countNum++;
		add(jp);
		jf.add(jp);
		jf.setVisible(true);

		for(int i=0; i<l_name.length; i++){
			l_name[i].requestFocus();
		}
	}
	


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
        if(count!=15){
			char solNum = sol.charAt(count);
			switch(e.getKeyCode()){
			case KeyEvent.VK_UP :
				if(solNum=='0'){
					l_name[count].setIcon(new ImageIcon("tiger.PNG"));
					count++;
				}
				break;
			case KeyEvent.VK_LEFT :
				if(solNum=='1'){
					l_name[count].setIcon(new ImageIcon("tiger.PNG"));
					count++;
				}
				break;
			case KeyEvent.VK_DOWN :
				if(solNum=='2'){
					l_name[count].setIcon(new ImageIcon("tiger.PNG"));
					count++;
				}
				break;
			case KeyEvent.VK_RIGHT :
				if(solNum=='3'){
					l_name[count].setIcon(new ImageIcon("tiger.PNG"));
					count++;
				}
				break;
			default : System.out.println("방향키를 입력하세요.");
			}

		System.out.println("키 입력 완료");
        }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
