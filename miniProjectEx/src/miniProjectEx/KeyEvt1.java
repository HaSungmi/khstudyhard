package miniProjectEx;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyListener;                                                                                               
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
 
//예제
class MyFrame implements KeyListener {
    JFrame frm = new JFrame();
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JPanel jp3 = new JPanel();
    JPanel jp4 = new JPanel();
    JTextField tfield1 = new JTextField("키이벤트 예제");
    JTextField tfield2 = new JTextField("키이벤트 예제");
    JTextField tfield3 = new JTextField("키이벤트 예제");
    JTextField tfield4 = new JTextField("키이벤트 예제");
    public MyFrame()
    {
        frm.setBounds(120, 120, 400, 400);
        frm.setTitle("포커스 테스트");
        frm.setLayout(new GridLayout(2,2,2,2));
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //텍스트필드를 셋팅
        tfield1.addKeyListener(this);
        tfield2.addKeyListener(this);
        tfield3.addKeyListener(this);
        tfield4.addKeyListener(this);
        jp1.add(tfield1);
        jp2.add(tfield2);
        jp3.add(tfield3);
        jp4.add(tfield4);
        frm.add(jp1);
        frm.add(jp2);
        frm.add(jp3);
        frm.add(jp4);
        frm.setVisible(true);
    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
        ShowInfo(e, "키누름");
        if(e.getKeyCode() == KeyEvent.VK_UP){
        	tfield1.setText(e.getKeyText(e.getKeyCode()));
        	jp1.setBackground(Color.BLACK);
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
        	tfield2.setText(e.getKeyText(e.getKeyCode()));
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
        	tfield3.setText(e.getKeyText(e.getKeyCode()));
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
        	tfield4.setText(e.getKeyText(e.getKeyCode()));
        }
    }
    @Override
    public void keyReleased(KeyEvent arg0) 
    {
        ShowInfo(arg0, "키풀림");        
    }
    @Override
    public void keyTyped(KeyEvent arg0) 
    {
        ShowInfo(arg0, "타이핑");
    }
    
    public void ShowInfo(KeyEvent e, String s)
    {
        char c = e.getKeyChar();
        int keyCode = e.getKeyCode();
        String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown() ;
        System.out.println( s + " : " + c + " : " + keyCode + " : " + modifiers);
//        tfield1.setText(e.getKeyText(e.getKeyCode()));
//        tfield2.setText(e.getKeyText(e.getKeyCode()));
//        tfield3.setText(e.getKeyText(e.getKeyCode()));
//        tfield4.setText(e.getKeyText(e.getKeyCode()));
    }
}
 
public class KeyEvt1 {
    public static void main(String[] args){
        MyFrame my = new MyFrame();
    }
}
