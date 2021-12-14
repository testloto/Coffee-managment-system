package coffeeManagement__System;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class Orders extends JFrame implements ActionListener {
	JLabel l1;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;
	JButton b1;
	Orders(){
		super("Order");
		ImageIcon i1 = new ImageIcon(getClass().getResource("/pics/AK1.jpg"));
		 Image i= i1.getImage();
		 Image img = i.getScaledInstance(400,450,Image.SCALE_DEFAULT);
		 i1 = new ImageIcon(img);	
		 JLabel l2= new JLabel(i1);
		  l2.setBounds(450,80,350,340);
		  add(l2);
		l1= new JLabel("COFFEE ORDERING SYSTEM");
		l1.setBounds(250,40,300,30);
		l1.setForeground(Color.BLUE);
		l1.setFont( new Font("Monospaced",Font.BOLD,20));
		add(l1);
		c1= new JCheckBox("Espresso @220");
		c1.setBounds(150,80,150,30);
		add(c1);
		c2= new JCheckBox("Ristretto @230");
		c2.setBounds(150,120,150,30);
		add(c2);
		c3= new JCheckBox("Espresso Macchiato @400");
		c3.setBounds(150,160,200,30);
		add(c3);
		c4= new JCheckBox("Cappucinno @120");
		c4.setBounds(150,200,150,30);
		add(c4);
		c5= new JCheckBox("Caffee Latte @280");
		c5.setBounds(150,240,150,30);
		add(c5);
		c6= new JCheckBox("Doppio @200");
		c6.setBounds(150,280,150,30);
		add(c6);
		c7= new JCheckBox("Americano @470");
		c7.setBounds(150,320,150,30);
		add(c7);
		c8= new JCheckBox("Piccolo Latte @190");
		c8.setBounds(150,360,150,30);
		add(c8);
		c9= new JCheckBox("Espresso Con Panna @345");
		c9.setBounds(150,400,150,30);
		add(c9);
		b1 = new JButton("Order");
		b1.setBounds(200,440,350,30);
		add(b1);
		b1.addActionListener(this);
		
		
//		getContentPane().setBackground(Color.YELLOW);
		setLayout(null);
		setBounds(400,200,850,540);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public  void actionPerformed(ActionEvent ae) {
		float amount =0;
		String msg="";
		if(c1.isSelected()) {
			amount+=220;
			msg+="Espresso:220\n";
		}
		if(c2.isSelected()) {
			amount+=230;
			msg+="Ristretto:230\n";
		}
		if(c3.isSelected()) {
			amount+=400;
			msg+="Espresso Macchiato:400\n";
		}
		if(c4.isSelected()) {
			amount+=120;
			msg+="Cappucinno:120\n";
		}
		if(c5.isSelected()) {
			amount+=280;
			msg+="Caffee Latte:280\n";
		}
		if(c6.isSelected()) {
			amount+=200;
			msg+="Doppio:200\n";
		}
		if(c7.isSelected()) {
			amount+=220;
			msg+="Americano:220\n";
		}
			
		if(c8.isSelected()) {
			amount+=190;
			msg+="Piccolo Latte:190\n";
		}
		if(c9.isSelected()) {
			amount+=345;
			msg+="Espresso Con Panna:345\n";
		}
		msg+="---------------\n";
		JOptionPane.showMessageDialog(this, msg+"Grand Total : "+amount);
		
	}
	public static void main(String[] args) {
		new Orders().setVisible(true);

	}

	
	
	
	
	
}
