package prac10_06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class ClickPracticeFrame extends JFrame {
		 public void Click() {
			setTitle("클릭 연습 용 응용프로그램");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			
			c.setLayout(null);
			JLabel la = new JLabel("C");
			la.setLocation(100,100);
			la.setSize(20,20);
			
			la.addMouseListener(new MyMouseAdapter());
			
			c.add(la);
			setSize(300,300);
			setVisible(true);
		 }
}

class MyMouseAdapter extends MouseAdapter {
	public void mousePressed(MouseEvent e) {
		JLabel la = (JLabel)e.getSource(); 
		Container c = la.getParent();
		
		int xBound = c.getWidth() - la.getWidth(); 
		int yBound = c.getHeight() - la.getHeight(); 
		int x = (int)(Math.random()*xBound); 
		int y = (int)(Math.random()*yBound); 
			
		la.setLocation(x,y);
		}

}
	
public class ClickApp_학번 {	
	
	public static void main(String[] args) {

		ClickPracticeFrame cl = new ClickPracticeFrame();
		cl.Click();		
	}
}
