package coffeeManagement__System;

import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame {
	JTextField t1,t2;
	Menu(){
		super("VIEW MENU");
		 ImageIcon i1 = new ImageIcon(getClass().getResource("/pics/ee.jpg"));
		 Image i= i1.getImage();
		 Image img = i.getScaledInstance(400,550,Image.SCALE_DEFAULT);
		 i1 = new ImageIcon(img);	
		 JLabel l1= new JLabel(i1);
		  l1.setBounds(300,20,670,620);
		  add(l1);
		  
		  JLabel l2 = new JLabel("MENU!!");
			l2.setForeground(Color.BLUE);
			l2.setBounds(250,20,800,30);
			l2.setFont(new Font("monospaced",Font.BOLD|Font.ITALIC,39));
			add(l2);
			
			JLabel name = new JLabel(" * ESPRESSO");
			name.setFont(new Font("Tahoma",Font.PLAIN,17));
			name.setBounds(60,90,120,30);
			add(name);
			
			JLabel l3 = new JLabel(" * RISTRETTO");
			l3.setFont(new Font("Tahoma",Font.PLAIN,17));
			l3.setBounds(60,130,120,30);
			add(l3);
			
			JLabel l4 = new JLabel(" * ESPRESSO MACCHIATO");
			l4.setFont(new Font("Tahoma",Font.PLAIN,17));
			l4.setBounds(60,170,210,30);
			add(l4);
			
			JLabel l5 = new JLabel(" * CAPPUCCINO");
			l5.setFont(new Font("Tahoma",Font.PLAIN,17));
			l5.setBounds(60,210,150,30);
			add(l5);
			JLabel l6 = new JLabel(" * CAFEE LATTE");
			l6.setFont(new Font("Tahoma",Font.PLAIN,17));
			l6.setBounds(60,250,150,30);
			add(l6);
			
			JLabel l7 = new JLabel(" * DOPPIO");
			l7.setFont(new Font("Tahoma",Font.PLAIN,17));
			l7.setBounds(60,290,120,30);
			add(l7);
			
			JLabel l8 = new JLabel(" * AMERICANO");
			l8.setFont(new Font("Tahoma",Font.PLAIN,17));
			l8.setBounds(60,330,120,30);
			add(l8);
			
			JLabel l9 = new JLabel(" * PICCOLO LATTE");
			l9.setFont(new Font("Tahoma",Font.PLAIN,17));
			l9.setBounds(60,370,150,30);
			add(l9);
			
			JLabel l10 = new JLabel(" * ESPRESSO CON PANNA");
			l10.setFont(new Font("Tahoma",Font.PLAIN,17));
			l10.setBounds(60,410,230,30);
			add(l10);
			
			
		 
		 
		 setLayout(null);
//			setBounds(400,200,800,350);
			setBounds(400,200,850,540);
			setVisible(true);
	}

	public static void main(String[] args) {
		new Menu().setVisible(true);

	}

}
