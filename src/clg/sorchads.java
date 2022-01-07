package clg;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class sorchads extends JFrame implements ActionListener {
	JFrame f;
	 JButton fruits,nuts,back;
	 JLabel im;
	public sorchads() {setLayout(new BorderLayout());
	JPanel p=new JPanel(); add(p,BorderLayout.CENTER); setVisible(true);
	setSize(1200,1000);
	 setResizable(false);p.setBackground(Color.GREEN);
	 fruits=new JButton(" fruits");	
	 p.add(fruits);setVisible(true);
	 fruits.addActionListener(this);
	 
	 nuts=new JButton("nuts");	
	 p.add(nuts);setVisible(true);
	 nuts.addActionListener(this);
	 
	 
	 Insets in=p.getInsets();
	 Dimension size=fruits.getPreferredSize();
	 fruits.setBounds(50, 50,150, 20);
    size=nuts.getPreferredSize();
    nuts.setBounds(50,100 ,150, 20);
    back=new JButton("<-");back.addActionListener(this);
    p.add(back); setVisible(true);
    size=back.getPreferredSize();
    back.setBounds(10,10 ,20, 10); ImageIcon img=new ImageIcon("D:\\orchads.jpeg");

	 im=new JLabel(img);
	 
 p.add(im);setVisible(true);size=im.getPreferredSize();
 im.setBounds(10,75,1200, 800);
 im=new JLabel(img); 

    	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==fruits)
		{
			new sfuit();	}
		if(e.getSource()==nuts)
		{
			new nuts();
		}if(e.getSource()== back)
		{new studentclass();
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
new sorchads();
	}

}
