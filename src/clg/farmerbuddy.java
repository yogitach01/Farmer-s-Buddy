package clg;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
 public class farmerbuddy extends JFrame implements ActionListener
{
	JFrame f;
	JButton create;
		public farmerbuddy()
	{ 
		setTitle("farmer buddy");
		 setVisible(true);setSize(1200,1000);
		 setLayout(new BorderLayout()); 
			JLabel background=new JLabel(new ImageIcon("D:\\wel.jpg"));
			add(background);
			background.setLayout(new FlowLayout());
		create=new JButton("CLICK ME ");
		 setVisible(true);
		create.addActionListener(this);
		create.setBackground(Color.WHITE);
	background.add(create);
         create.setBounds(600,600,200, 50);
	}
		
 	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==create)
		{new MainPage();dispose();
			}
	}
	public static void main(String args[])
	{	new farmerbuddy();
	
	}
}
