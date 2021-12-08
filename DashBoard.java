package coffeeManagement__System;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;


public class DashBoard extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu m1,m2;
	JMenuItem i1,i2,i3,i4;
	DashBoard(){
		mb =  new JMenuBar();
		add(mb);
		m1 = new JMenu("COFFEE MANAGEMENT");
		m1.setForeground(Color.GREEN);
		mb.add(m1);
		
		m2 = new JMenu("SIGN-UP");
		m2.setForeground(Color.ORANGE);
		mb.add(m2);
		
		i1 = new JMenu("RECEPTION");
	
		i1.addActionListener(this);
		m1.add(i1);
		
		i2 = new JMenu("DETAILS");
		i2.addActionListener(this);
		m2.add(i2);
		
		i3 = new JMenu("ABOUT US :)");
		i3.addActionListener(this);
		m2.add(i3);

		mb.setBounds(0,0,1950,30);
		 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pics/gg.jpg"));
		 Image i2 = i1.getImage().getScaledInstance(1950,1000, Image.SCALE_DEFAULT);
			ImageIcon i3= new ImageIcon(i2);

		 JLabel l1 = new JLabel(i3);
		 l1.setBounds(0, 0, 1950,1000);
		 add(l1);
		 JLabel l2 = new JLabel("LIFE HAPPENS COFFEE HELPS :)");
		 l2.setBounds(600,60,1000,50);
		 l2.setForeground(Color.BLUE);
		 l2.setFont( new Font("Tahoma",Font.PLAIN,46));
		 l1.add(l2);
		
		setLayout(null);
		setBounds(0,0,1950,1020);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("RECEPTION")) {
			
		}else if (e.getActionCommand().equals("DETAILS")) {
			new Details().setVisible(true);
		}
	}


	public static void main(String[] args) {
		new DashBoard().setVisible(true);
		

	}

}
