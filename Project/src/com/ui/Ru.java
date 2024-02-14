package com.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ru extends JFrame {
	JLabel jLabel, jLabel2;
	JTextField jTextField, jTextField2;
	JButton jButton, jButton2;

	public Ru() {
		setLayout(new FlowLayout());
		jLabel = new JLabel("username");
		jLabel2 = new JLabel("password");

		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		jButton = new JButton("submit");

		jButton2 = new JButton("reset");
		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (jTextField.getText().equals("ry")&&jTextField2.getText().equals("ry")) {
					new Success();

					System.out.println("login");
				} else {
					new Ru();

				}

			}
		});
		

		add(jLabel);
		add(jTextField);
		add(jLabel2);
		add(jTextField2);
		add(jButton);
		add(jButton2);

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Ru();

	}

}
