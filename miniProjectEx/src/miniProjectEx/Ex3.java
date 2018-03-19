package miniProjectEx;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ex3 extends JFrame implements KeyListener {
	String sol = null; // 문제의 랜덤 값을 스트링으로 처리
	String[] images = { "up.PNG", "left.PNG", "down.PNG", "right.PNG" }; // 방향키 이미지 경로
	JLabel[] l_name = new JLabel[15]; // 문제를 저장할 배열
	static Ex3 ex3 = new Ex3(); // 자신의 객체 선언
	static int life = 3; // 라이프
	JPanel jp; // 그리드레이아웃을 담을 패널
	JPanel base;//가장 아래 베이스 패널-보더레이아웃
	JPanel bar;//게임 화면 위에 위치-> 타이머,남은 생명 나타냄
	static int count = 0; // 입력 횟수
	static int count2 = 1; // 게임 반복 횟수
	static int time = 20; //게임 제한 초
	JLabel timeLabel, lifeLabel;

	// 실행용 메인메소드
	public static void main(String[] args) {
		ex3.gameRun();
	}

	// 실행 메소드
	public void gameRun() {

		setSize(700, 400);
		setTitle("리듬게임/ [남은 라이프 : " + life + "개] [게임횟수 : "+count2+"번]");
		
		base = new JPanel(new BorderLayout());
		
		bar = new  JPanel(new FlowLayout(FlowLayout.RIGHT));
		bar.add(timeLabel = new JLabel("남은 시간 : "+time));
		bar.add(new JLabel("|"));
		bar.add(lifeLabel = new JLabel("남은 라이프 : " + life + "개"));
		jp = new JPanel();
		jp.setLayout(new GridLayout(3, 5, 10, 10));
		


		int num = 0;
		int ranNum = 0;
		String str = "";
		while (num < 15) {
			ranNum = (int) (Math.random() * 4);
			str += ranNum + "";
			jp.add(l_name[num] = new JLabel(new ImageIcon(images[ranNum])));
			l_name[num].addKeyListener(this);
			num++;
		}
		sol = str;
		
		base.add(jp, BorderLayout.CENTER);
		base.add(bar, BorderLayout.NORTH);
		
		add(base);

		setVisible(true);
		for (int i = 0; i < l_name.length; i++) {
			l_name[i].requestFocus();
		}
		if(time==20){
			new Timer().start();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 키보드 이벤트
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		char solNum = sol.charAt(count);
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:

			if (solNum == '0') { // 맞을경우
				l_name[count].setIcon(new ImageIcon("Capybara.jpg"));
				count++;

				if (count >= 15) {
					JOptionPane.showMessageDialog(null, "남은 횟수는 " + (3 - count2) + "회 입니다.");
					
					count = 0;
					count2++;
					if (count2 >= 4) {			//마지막 run을 실행 시키지 않음
						JOptionPane.showMessageDialog(null, "게임이 종료되었습니다.");
						System.exit(0);
					}
					gameRun();
					setTitle("리듬게임/ [남은 라이프 : " + life + "개] [게임횟수 : "+count2+"번]");	//게임횟수 초기화를 위한 구문

				}
			} else { // 틀릴경우
				life--;
				lifeLabel.setText("남은 라이프 : " + life + "개");
				setTitle("리듬게임/ [남은 라이프 : " + life + "개] [게임횟수 : "+count2+"번]"); // title은 자동으로 바뀌지 않아서 다시 setTitle
				if (life == 0) { // 라이프가 0일 경우
					JOptionPane.showMessageDialog(null, "라이프를 모두 소진하셨습니다.");
					System.exit(0); // 시스템 종료 -> ***이 부분은 상위 뷰와 연결될 때 수정해야함***
				}
			}

			break;
		case KeyEvent.VK_LEFT:

			if (solNum == '1') {
				l_name[count].setIcon(new ImageIcon("Capybara.jpg"));
				count++;

				if (count >= 15) {
					JOptionPane.showMessageDialog(null, "남은 횟수는 " + (3 - count2) + "회 입니다.");
					count = 0;
					count2++;
					if (count2 >= 4) {
						JOptionPane.showMessageDialog(null, "게임이 종료되었습니다.");
						System.exit(0);
					}
					gameRun();
					setTitle("리듬게임/ [남은 라이프 : " + life + "개] [게임횟수 : "+count2+"번]");

				}
			} else {
				life--;
				lifeLabel.setText("남은 라이프 : " + life + "개");
				setTitle("리듬게임/ [남은 라이프 : " + life + "개] [게임횟수 : "+count2+"번]");

				if (life == 0) {
					JOptionPane.showMessageDialog(null, "라이프를 모두 소진하셨습니다.");
					System.exit(0);
				}
			}
			break;
		case KeyEvent.VK_DOWN:

			if (solNum == '2') {
				l_name[count].setIcon(new ImageIcon("Capybara.jpg"));
				count++;

				if (count >= 15) {
					JOptionPane.showMessageDialog(null, "남은 횟수는 " + (3 - count2) + "회 입니다.");
					count = 0;
					count2++;
					if (count2 >= 4) {
						JOptionPane.showMessageDialog(null, "게임이 종료되었습니다.");
						System.exit(0);
					}
					gameRun();
					setTitle("리듬게임/ [남은 라이프 : " + life + "개] [게임횟수 : "+count2+"번]");
				}
			} else {
				life--;
				lifeLabel.setText("남은 라이프 : " + life + "개");
				setTitle("리듬게임/ [남은 라이프 : " + life + "개] [게임횟수 : "+count2+"번]");
				if (life == 0) {
					JOptionPane.showMessageDialog(null, "라이프를 모두 소진하셨습니다.");
					System.exit(0);
				}
			}

			break;
		case KeyEvent.VK_RIGHT:

			if (solNum == '3') {
				l_name[count].setIcon(new ImageIcon("Capybara.jpg"));
				count++;

				if (count >= 15) {
					JOptionPane.showMessageDialog(null, "남은 횟수는 " + (3 - count2) + "회 입니다.");
					count = 0;
					count2++;
					if (count2 >= 4) {
						JOptionPane.showMessageDialog(null, "게임이 종료되었습니다.");
						System.exit(0);
					}
					gameRun();
					setTitle("리듬게임/ [남은 라이프 : " + life + "개] [게임횟수 : "+count2+"번]");

				}
			} else {
				life--;
				lifeLabel.setText("남은 라이프 : " + life + "개");
				setTitle("리듬게임/ [남은 라이프 : " + life + "개] [게임횟수 : "+count2+"번]");
				if (life == 0) {
					JOptionPane.showMessageDialog(null, "라이프를 모두 소진하셨습니다.");
					System.exit(0);
				}
			}
			break;
		default:
			System.out.println("방향키를 입력하세요.");
		}

		System.out.println("키 입력 완료");

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	
	class Timer extends Thread{
		@Override
		public void run(){
			time = 20;
			while(true){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				time--;
				if(time==0){
					timeLabel.setText("남은 시간 : "+time);
					JOptionPane.showMessageDialog(null, "게임이 종료되었습니다.");
					System.exit(0);
					break;
				}
				timeLabel.setText("남은 시간 : "+time);
			}

		}
	}

}
