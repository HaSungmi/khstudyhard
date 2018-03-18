package miniProjectEx;

import javax.swing.*;
import java.awt.*;

public class Ex1 extends JFrame{

	public Ex1(){
		setLocation(200,100);
		setBounds(100,100,800,600); //(x, y, width, height)
		//사이즈 조정 못하게
		//setResizable(false);

		JPanel base = new JPanel();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		
		base.setLayout(new GridLayout(2,1,1,1));
		
		JPanel timejp = new JPanel();
		timejp.setLayout(new FlowLayout(FlowLayout.RIGHT));
		timejp.add(new JLabel("시간 나오는 라벨"));
		
		jp1.setLayout(new BorderLayout());
		jp1.add(new JLabel(new ImageIcon("images_1.jpg")), BorderLayout.CENTER);
		
		jp1.add(timejp, BorderLayout.NORTH);
		jp2.setLayout(new BorderLayout());
		JPanel jp2_1 = new JPanel();
		jp2_1.setLayout(new GridLayout(1,5,1,1));
		jp2.add(jp2_1, BorderLayout.CENTER);
		jp2.add(new JLabel(" "),BorderLayout.NORTH);
		jp2.add(new JLabel(" "),BorderLayout.EAST);
		jp2.add(new JLabel(" "),BorderLayout.WEST);
		jp2.add(new JLabel(" "),BorderLayout.SOUTH);
		
		
		JPanel stu1 = new JPanel();
		JPanel stu2 = new JPanel();
		JPanel stu3 = new JPanel();
		JPanel stu4 = new JPanel();
		JPanel stu5 = new JPanel();
		
		JPanel stu1_l = new JPanel();
		JPanel stu2_l = new JPanel();
		JPanel stu3_l = new JPanel();
		JPanel stu4_l = new JPanel();
		JPanel stu5_l = new JPanel();
		
		JPanel stu1_P = new JPanel();
		JPanel stu2_P = new JPanel();
		JPanel stu3_P= new JPanel();
		JPanel stu4_P = new JPanel();
		JPanel stu5_P = new JPanel();
		
		stu1_l.add(new JLabel("학생 1"));
		stu2_l.add(new JLabel("학생 2"));
		stu3_l.add(new JLabel("학생 3"));
		stu4_l.add(new JLabel("학생 4"));
		stu5_l.add(new JLabel("학생 5"));
		
		JProgressBar pbar1_1, pbar1_2, pbar1_3, pbar2_1, pbar2_2, pbar2_3, pbar3_1, pbar3_2, pbar3_3;
		JProgressBar pbar4_1, pbar4_2, pbar4_3, pbar5_1, pbar5_2, pbar5_3; 
		
		stu1_P.setLayout(new GridLayout(3,1,1,5));
		stu1_P.add(pbar1_1 = new JProgressBar());
		pbar1_1.setStringPainted(true);
		stu1_P.add(pbar1_2 = new JProgressBar());
		stu1_P.add(pbar1_3 = new JProgressBar());
		
		stu2_P.setLayout(new GridLayout(3,1,1,5));
		stu2_P.add(pbar2_1 = new JProgressBar());
		stu2_P.add(pbar2_2 = new JProgressBar());
		stu2_P.add(pbar2_3 = new JProgressBar());
		
		stu3_P.setLayout(new GridLayout(3,1,1,5));
		stu3_P.add(pbar3_1 = new JProgressBar());
		stu3_P.add(pbar3_2 = new JProgressBar());
		stu3_P.add(pbar3_3 = new JProgressBar());
		
		stu4_P.setLayout(new GridLayout(3,1,1,5));
		stu4_P.add(pbar4_1 = new JProgressBar());
		stu4_P.add(pbar4_2 = new JProgressBar());
		stu4_P.add(pbar4_3 = new JProgressBar());
		
		stu5_P.setLayout(new GridLayout(3,1,1,5));
		stu5_P.add(pbar5_1 = new JProgressBar());
		stu5_P.add(pbar5_2 = new JProgressBar());
		stu5_P.add(pbar5_3 = new JProgressBar());

		stu1.setLayout(new GridLayout(2,1,0,0));
		stu2.setLayout(new GridLayout(2,1,0,0));
		stu3.setLayout(new GridLayout(2,1,0,0));
		stu4.setLayout(new GridLayout(2,1,0,0));
		stu5.setLayout(new GridLayout(2,1,0,0));

		stu1.add(stu1_l);
		stu1.add(stu1_P);
		stu2.add(stu2_l);
		stu2.add(stu2_P);
		stu3.add(stu3_l);
		stu3.add(stu3_P);
		stu4.add(stu4_l);
		stu4.add(stu4_P);
		stu5.add(stu5_l);
		stu5.add(stu5_P);
		
		jp2_1.add(stu1);
		jp2_1.add(stu2);
		jp2_1.add(stu3);
		jp2_1.add(stu4);
		jp2_1.add(stu5);
		
		base.add(jp1);
		base.add(jp2);
		
		add(base);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex1();
	}

}
