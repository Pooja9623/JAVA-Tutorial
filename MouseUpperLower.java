package testQuestions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseUpperLower extends JFrame{
	private JTextField txtField;
	
	public MouseUpperLower() {
		txtField = new JTextField(30);
		
		setTitle("Upper Lower Case");
		setLocation(100,100);
		setSize(300,300);
		setLayout(new FlowLayout());
		add(txtField);
		setVisible(true);
		
		MouseHandler mh = new MouseHandler();
		txtField.addMouseListener(mh);
	}
	
	class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			String s = txtField.getText();
			if(e.getButton()==MouseEvent.BUTTON1) {     //Left click
				txtField.setText(s.toUpperCase());
			}
			
			if(e.getButton()==MouseEvent.BUTTON3) {		//Right click
				txtField.setText(s.toLowerCase());
			}
		}
	}

	public static void main(String[] args) {
		new MouseUpperLower();

	}

}
