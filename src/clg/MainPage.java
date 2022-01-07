package clg;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
 public class MainPage extends JFrame implements ActionListener
{
	JFrame f;
	JLabel im,ing;
	JButton Agriculturestudent,farmer;
	 
		public MainPage()
	{ 
		setLayout(new BorderLayout());
		JPanel p=new JPanel(); 
		 add(p,BorderLayout.CENTER);
			f=new JFrame("main page");f.setTitle("farmer buddy");
		 setVisible(true);setSize(1200,1000);
		
		 Agriculturestudent=new JButton("Agriculture student");
		 setVisible(true);
		Agriculturestudent.addActionListener(this);
		
		p.add(Agriculturestudent);
		
		Agriculturestudent.setBackground(Color.WHITE);
	     
		farmer=new JButton("farmer");
		 setVisible(true);
		farmer.addActionListener(this);
		farmer.setBackground(Color.WHITE);
	  
	p.add(farmer);
	 add(p,BorderLayout.CENTER);Insets in=p.getInsets();
	      Dimension size=Agriculturestudent.getPreferredSize();
	      Agriculturestudent.setBounds(50, 10,500, 20);
	      size=farmer.getPreferredSize();
	      farmer.setBounds(600,10,500, 20);
	      ImageIcon img=new ImageIcon("D:\\farner.jpg");
	  	 im=new JLabel(img);
	      p.add(im);setVisible(true);size=im.getPreferredSize();
	      im.setBounds(100,75,1000, 800);
	      im=new JLabel(img);
		  	   p.setBackground(Color.GREEN);
	}
		
 	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== Agriculturestudent)
		{new signUp();dispose();
			} 
		if(e.getSource()==farmer)
		{new signUp2();dispose();
			}
	}
 public static void main(String args[])
	{new MainPage();
	}
}
