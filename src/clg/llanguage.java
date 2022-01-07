package clg;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
 public class llanguage extends JFrame implements ActionListener
{
	JFrame f;
	JLabel im,ing;
	JButton MAR,ENG;
	 
		public llanguage()
	{ 
		setLayout(new BorderLayout());
		JPanel p=new JPanel(); 
		 add(p,BorderLayout.CENTER);
			f=new JFrame("main page");f.setTitle("farmer buddy");
		 setVisible(true);setSize(1200,1000);
		
		 MAR=new JButton(" MARATHI");
		 setVisible(true);
		MAR.addActionListener(this);
		
		p.add(MAR);
		
		MAR.setBackground(Color.WHITE);
	     
		ENG=new JButton("ENGLISH");
		 setVisible(true);
		ENG.addActionListener(this);
		ENG.setBackground(Color.WHITE);
	     
	p.add(ENG);
	 
    
		add(p,BorderLayout.CENTER);Insets in=p.getInsets();
	        
		 
	      ENG.setBounds(50, 10,500, 20);
	      ENG.setBounds(600,10,500, 20);
	   	  	   p.setBackground(Color.GREEN);
		  	   
	     
	}
		
 	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== MAR)
		{new zaid();
			} 
		
		if(e.getSource()==ENG)
		{new zaid();
			}
		
					
	}
 	
 
	public static void main(String args[])
	{
		new llanguage();
	}
}
