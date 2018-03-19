package layout;

import java.awt.CardLayout;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import miniProjectEx.Ex2;

import miniProjectEx.Ex1;

public class Main1 extends JFrame{
	JFrame jf;
	CardLayout card;
	JPanel jp1;
	JPanel jp2;
	JButton jb;
	 ImageIcon icon;

	public static void main(String[] args) {
		new Main1();
	}
	
	public Main1(){
		jf = new JFrame();

		jf.setBounds(100,100,800,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(card = new CardLayout());
	
		jf.add(jp1 = new Ex2(),"1");
		jf.add(jp2 = new Ex2(),"2");

		icon = new ImageIcon("Main.png");
		JPanel panel = new JPanel() {
			   public void paintComponent(Graphics g) {
				Dimension d = getSize();
			    g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
			    setOpaque(false);
			    super.paintComponent(g);
			   }
			  };
		panel.add(jb = new JButton("게임 시작"));
		panel.setLayout(null);
		jb.setBounds(350,500,110,30);

		jf.add(panel,"1");
		jf.add(new Ex1(),"2");


		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.next(panel.getParent());
			}
		});
		
		jf.setVisible(true);

	}


}
