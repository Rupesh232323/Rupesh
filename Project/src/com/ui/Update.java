package com.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Update extends JFrame {
	Label label,label2;
	JTextField test,test2;
	Button button;
	public Update() {
		setLayout(new FlowLayout());
		label=new Label("id");
		test=new JTextField(10);
		label2=new Label("username");
		test2=new JTextField(10);
		button=new Button("ubdate");
		
		
		
		
		
		add(label);
		add(test);
		add(label2);
		add(test2);
		add(button);
		
		
		
		
		//setVisible(true);
		setSize(400,400);
		
	}

	

}
