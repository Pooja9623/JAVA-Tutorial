package testQuestions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseBoldItalic extends JFrame{
		private JTextField txtField;
		
		public MouseBoldItalic() {
			txtField = new JTextField(30);
			
			setTitle("Upper Lower Case");
			setLocation(100,100);
			setSize(300,300);
			setLayout(new FlowLayout());
			add(txtField);
			txtField.setFont(new Font("Arial", Font.PLAIN, 15));
			setVisible(true);
			
			MouseHandler mh = new MouseHandler();
			txtField.addMouseListener(mh);
		}
		
		class MouseHandler extends MouseAdapter{
			public void mouseClicked(MouseEvent e) {
				
				if(e.getButton()==MouseEvent.BUTTON1) {  //left button
					txtField.setFont(new Font("Arial",Font.BOLD, 15));
				}
				
				if(e.getButton()==MouseEvent.BUTTON3) {		//right button
					txtField.setFont(new Font("Arial",Font.ITALIC, 15));
				}
				
				
			}
		}

		public static void main(String[] args) {
			new MouseBoldItalic();

		

	}

}
