package testQuestions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextBoxLabel extends JFrame{
	private Label lbl;
	private TextField txt;
	
	TextBoxLabel() {
		lbl = new Label("Enter Text");
		txt = new TextField("Type here:",50);
		
		
		
		setTitle("TextBox Label");
		setLocation(100,100);
		setSize(500,250);
		setLayout(new FlowLayout());
		add(lbl);
		add(txt);
		setVisible(true);
	
		
		txt.addTextListener(new TextListener() {
			
			public void textValueChanged(TextEvent e) {
				String s = txt.getText();
				lbl.setText(s);
				int n=(s.indexOf(" X"));
				 if(n>-1) System.exit(0);
				
			}
		});
		
	}

	public static void main(String[] args) {
		new TextBoxLabel();

	}

}
