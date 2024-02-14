package com.ui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import connecation.om.OpImp;



public class Success extends JFrame {
	JMenu menu1,menu2,menu3,menu4;
	JMenuBar bar;
	JMenuItem item,item2,item3,item4,item5,item6,item7,item8,item9;
	
	public Success() {
		setLayout(null);
		bar= new JMenuBar();
		bar.setBounds(0, 0, 400, 30);
		menu1=new JMenu("Employee");
		item=new JMenuItem("add");
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Add");
				new Add();
				
			}
		});
		
		item2=new JMenuItem("Update");
		item3=new JMenuItem("Delete");
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			new Update();
				
			}
		});
		
		menu2=new JMenu("Employee details");
		item4=new JMenuItem("show Employee");
		item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				OpImp o = new OpImp();
				o.Display();
			}
		});
		item5=new JMenuItem("search Employee");
		
		
		menu3=new JMenu("Account");
		item6=new JMenuItem("show Employee salary");
		
		menu4=new JMenu("Utilities");
		item7=new JMenuItem("Help");
		item8=new JMenuItem("Thought of day");
		item9=new JMenuItem("Exit");
		item9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			System.exit(1);
			System.out.println("exit");
				
			}
		});
		
		
	
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		bar.add(menu4);
		menu1.add(item);
		menu1.add(item2);
		menu1.add(item3);
		menu2.add(item4);
		menu2.add(item5);
		menu3.add(item6);
		menu4.add(item7);
		menu4.add(item8);
		menu4.add(item9);
		
		
		add(bar);
		setVisible(true);
		setSize(600,600);
		// TODO Auto-generated constructor stub
	}

}