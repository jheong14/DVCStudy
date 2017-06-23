import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseListenerAllEx extends JFrame {
	
	JPanel contentPane = new JPanel();
	JLabel la;
	
	MouseListenerAllEx() {
		setTitle("마우스 리스너 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		
		contentPane.addMouseListener(new MyMouseListener());
		contentPane.addMouseMotionListener(new MyMouseListener());
		
		la = new JLabel("No mouse Event");
		contentPane.add(la);
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter{
	//class MyMouseListener implements MouseListener,MouseMotionListener{
		@Override
		public void mousePressed(MouseEvent e){
			la.setText("MousePressed (" +e.getX()+","+e.getY()+")");
			
		}
		@Override
		public void mouseReleased(MouseEvent e){
			la.setText("MouseReleased (" +e.getX()+","+e.getY()+")");
			
		}
		@Override
		public void mouseClicked(MouseEvent e){	}
		@Override
		public void mouseEntered(MouseEvent e){
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.CYAN);
		}
		@Override
		public void mouseExited(MouseEvent e){
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.YELLOW);
		}
		@Override
		public void mouseDragged(MouseEvent e){
			la.setText("MouseDragged (" +e.getX()+","+e.getY()+")");
		}
		@Override
		public void mouseMoved(MouseEvent e){
			la.setText("MouseMoved (" +e.getX()+","+e.getY()+")");
		}
	}
	
	public static void main(String[] args){
		new MouseListenerAllEx();
	}
	

}
