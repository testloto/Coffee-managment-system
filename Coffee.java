package coffeeManagement__System;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Coffee extends JFrame implements ActionListener {
	 Coffee(){
		 setBounds(400,300,1820,900);
//		 setSize(400,400);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 		 ImageIcon i1 = new ImageIcon(getClass().getResource("/pics/coffee.jpg"));
		 		 Image i= i1.getImage();
		 		 Image img = i.getScaledInstance(1980,1090,Image.SCALE_SMOOTH);
		 		 i1 = new ImageIcon(img);		 		
		 		 JLabel l1= new JLabel(i1);
		 
		 l1.setBounds(0,0,1820,1000);
		 add(l1);
		 JLabel l2= new JLabel("MOKA POT");
		 l2.setBounds(0,0,1000,70);
		 l2.setForeground(Color.WHITE);
		 l2.setFont(new Font("serif",Font.PLAIN,80));
		 l1.add(l2);
		 
		 JButton b1 = new JButton("Next");
		 b1.setBackground(Color.WHITE);
		 b1.setForeground(Color.BLACK);
		 b1.setBounds(1090,650,250,50);
		 b1.addActionListener(this);
		 l1.add(b1);
		   
		 
		 setLayout(null);
		 setVisible(true);
		 
		 while(true) {
			 l2.setVisible(false);
			 try {
				 Thread.sleep(500);
			 }catch(Exception e) {
				 
			 }
			 l2.setVisible(true);
				 try {
					 Thread.sleep(500);
				 }catch(Exception e) {}
			 
		 }
	 }
	 
	 public void actionPerformed(ActionEvent ae) {
		 new Login().setVisible(true);
		 this.setVisible(false);
	 }


	public static void main(String[] args) {
		  new Coffee();
	}


}
