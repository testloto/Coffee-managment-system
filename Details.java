package coffeeManagement__System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Details extends JFrame implements ActionListener {
	JTextField t1,t2,t3,t4;
	JRadioButton r1,r2;
	JButton b1;
	Details(){
		JLabel name = new JLabel("NAME");
		name.setFont(new Font("Tahoma",Font.PLAIN,17));
		name.setBounds(60,70,120,30);
		add(name);
		t1= new JTextField();
		t1.setBounds(200,70,150,30);
		add(t1);
		
		JLabel age = new JLabel("AGE");
		age.setFont(new Font("Tahoma",Font.PLAIN,17));
		age.setBounds(60,120,120,30);
		add(age);
		t2= new JTextField();
		t2.setBounds(200,120,150,30);
		add(t2);
		
		JLabel gender = new JLabel("GENDER");
		gender.setFont(new Font("Tahoma",Font.PLAIN,17));
		gender.setBounds(60,170,120,30);
		add(gender);
		r1= new JRadioButton("Male");
		r1.setFont(new Font("Tahoma",Font.PLAIN,14));
		r1.setBounds(200,170,70,30);
		add(r1);
		
		r2= new JRadioButton("Female");
		r2.setFont(new Font("Tahoma",Font.PLAIN,14));
		r2.setBounds(280,170,70,30);
		add(r2);
			
		JLabel contact = new JLabel("CONTACT");
		contact.setFont(new Font("Tahoma",Font.PLAIN,17));
		contact.setBounds(60,220,120,30);
		add(contact);
		t3= new JTextField();
		t3.setBounds(200,220,150,30);
		add(t3);
		
		JLabel seats = new JLabel("SEATS");
		seats.setFont(new Font("Tahoma",Font.PLAIN,17));
		seats.setBounds(60,270,150,30);
		add(seats);
		t4= new JTextField();
		t4.setBounds(200,270,150,30);
		add(t4);
		
		b1= new JButton("SUBMIT");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(200,330,150,30);
		b1.addActionListener(this);
		add(b1);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pics/night.png"));
		Image i2 = i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
		ImageIcon i3 =new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
//		l1.setBounds(400,80,600,500);
		l1.setBounds(400,40,450,450);
		add(l1);
		
		JLabel l2 = new JLabel("CUSTOMER DETAILS!!");
		l2.setForeground(Color.BLUE);
		l2.setBounds(250,30,400,30);
		l2.setFont(new Font("Tahoma",Font.PLAIN,30));
		add(l2);
		
		setLayout(null);
//		setBounds(400,200,800,350);
		setBounds(400,200,850,540);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String name = t1.getText();
		String age = t2.getText();
		String contact = t3.getText();
		String seats = t4.getText();
		String gender = null;
		if(r1.isSelected()) {
			gender = "Male";
		}else if (r2.isSelected()) {
			gender = "Female";
		}
		
		Clonn c = new Clonn();
		String str = "insert into details values('"+name+"','"+age+"','"+gender+"','"+contact+"','"+seats+"')";
		
		try {
			
			c.s.executeUpdate(str);
			JOptionPane.showMessageDialog(null,"Details Recieved");
			this.setVisible(false);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	} 

	public static void main(String[] args) {
		new Details().setVisible(true);
	}

}
