package com.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import connecation.om.OpImp;
import pojo.empPoJo;

public class Add extends JFrame {
	Label label,label2;
	JTextField text,text2;
	Button button;
	public Add() {
		setLayout(new FlowLayout());
		label=new Label("id");
		text=new JTextField(10);
		label2=new Label("username");		text2=new JTextField(10);
		button=new Button("add");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				empPoJo emp=new empPoJo();
				emp.setId(Integer.parseInt(text.getText()));
				emp.setUsername(text2.getText());
				OpImp op=new OpImp();
				op.insertData(emp);
				
			}		});
		
			
		add(label);
		add(text);
		add(label2);
		add(text2);
		add(button);
		
				setVisible(true);
		setSize(500,500);
		
	}

}
