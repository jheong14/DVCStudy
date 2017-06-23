import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class KeyCodeEx extends JFrame {
	
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel();
	
	KeyCodeEx(){
		setTitle("Key Code 예제 : F1키~초록색, %키~노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);
		setSize(300,150);
		setVisible(true);
		
		contentPane.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+ "키가 입력되었습니다.");
			
			if(e.getKeyChar()=='%'){
				contentPane.setBackground(Color.YELLOW);
			} else if (e.getKeyCode() == KeyEvent.VK_F1){
				contentPane.setBackground(Color.GREEN);
			} else if (e.getKeyCode() == KeyEvent.VK_HOME){
				contentPane.setBackground(Color.BLUE);
			}
		}
		
	}
	
	public static void main(String[] args){
		new KeyCodeEx();
	}
	

}
