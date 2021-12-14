package coffeeManagement__System;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
	 About(){
		 super("ABOUT US");
		 ImageIcon i1 = new ImageIcon(getClass().getResource("/pics/choco.jpg"));
 		 Image i= i1.getImage();
 		 Image img = i.getScaledInstance(640,480,Image.SCALE_DEFAULT);
 		 i1 = new ImageIcon(img);		 		
 		 i1 = new ImageIcon(img);		 		
		  JLabel l1= new JLabel(i1);
		  l1.setBounds(200,-20,470,520);
		  add(l1);
		  JLabel l2 = new JLabel("ESPRESSO MAY NOT BE THE");
			 l2.setBounds(20,20,600,300);
			 l2.setForeground(Color.WHITE);
			 l2.setFont( new Font("Monospaced",Font.PLAIN,29));
			 l1.add(l2);
			 JLabel l3 = new JLabel("ANSWER BUT IT IS WORTH");
			 l3.setBounds(20,50,600,300);
			 l3.setForeground(Color.WHITE);
			 l3.setFont( new Font("Monospaced",Font.PLAIN,29));
			 l1.add(l3);
			 
			 JLabel l4 = new JLabel("A SHOT..");
			 l4.setBounds(20,80,600,300);
			 l4.setForeground(Color.WHITE);
			 l4.setFont( new Font("Monospaced",Font.PLAIN,29));
			 l1.add(l4);
			 
			 JLabel l5 = new JLabel("ESPRESSO SUPPLIES COFFEE OF");
			 l5.setBounds(20,110,600,300);
			 l5.setForeground(Color.WHITE);
			 l5.setFont( new Font("Monospaced",Font.PLAIN,26));
			 l1.add(l5);
			 
			 JLabel l6 = new JLabel("GOOD QUALITY EXTRACTED");
			 l6.setBounds(20,140,600,300);
			 l6.setForeground(Color.WHITE);
			 l6.setFont( new Font("Monospaced",Font.PLAIN,29));
			 l1.add(l6);
			 
			 JLabel l7 = new JLabel("FROM ARABICA BEANS");
			 l7.setBounds(20,170,600,300);
			 l7.setForeground(Color.WHITE);
			 l7.setFont( new Font("Monospaced",Font.PLAIN,29));
			 l1.add(l7);
			 
			 JLabel l8 = new JLabel("U CAN FEEL A DEEP AND RICH");
			 l8.setBounds(20,200,600,300);
			 l8.setForeground(Color.WHITE);
			 l8.setFont( new Font("Monospaced",Font.PLAIN,26));
			 l1.add(l8);
			 
			 JLabel l9 = new JLabel("FLAVOUR OF COFFEE :}");
			 l9.setBounds(20,230,600,300);
			 l9.setForeground(Color.WHITE);
			 l9.setFont( new Font("Monospaced",Font.PLAIN,29));
			 l1.add(l9);
		  
	  
		  
		  getContentPane().setBackground(Color.BLACK);
		
		  setLayout(null);
//			setBounds(400,200,800,350);
			setBounds(400,200,850,540);
			setVisible(true);
	}

	public static void main(String[] args) {
		new About().setVisible(true);

	}

}
