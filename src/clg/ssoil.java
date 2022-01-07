package clg;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ssoil extends JFrame implements ActionListener {
	JFrame f;
	 JButton black,loamy,sandy,red,back;
	 JTextArea ta;JLabel im;
	public ssoil() {
		setLayout(new BorderLayout());
		JPanel p=new JPanel(); add(p,BorderLayout.CENTER); setVisible(true);
		 setSize(1200,1000);setTitle("soil");
		 p.setBackground(Color.GREEN);
		 ImageIcon img=new ImageIcon("D:\\black.jpeg");

		 black=new JButton(img);	
		 p.add(black);setVisible(true);
		 black.addActionListener(this);
		
		 ImageIcon l=new ImageIcon("D:\\loamy.jpeg");

		 loamy=new JButton(l);	
		 p.add(loamy);setVisible(true);
		 loamy.addActionListener(this);
		 
		 ImageIcon s=new ImageIcon("D:\\sandy.jpeg");

		 
		 sandy=new JButton(s);	
		 p.add(sandy);setVisible(true);
		 sandy.addActionListener(this);
		 ImageIcon r=new ImageIcon("D:\\red.jpeg");

		 red=new JButton(r);	
		 p.add(red);setVisible(true);
		 red.addActionListener(this);
		
		 
		 ta=new JTextArea("",20,80);
		 p.add(ta);setVisible(true);
		 JScrollPane sc=new JScrollPane(ta);
		 p.add(sc);

		 black.setBounds(50, 50,200, 200);loamy.setBounds(300, 50,200, 200);
		 sandy.setBounds(550, 50,200, 200);red.setBounds(800, 50,200, 200);
		ta.setBounds(100,400, 150, 50);  back=new JButton("<-");
		back.addActionListener(this);
	     p.add(back); back.setBounds(30,100 ,20, 10);
	     setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{soil s=new soil();
		if(e.getSource()==black)
		{ta.setText(s.black());
		}
		if(e.getSource()==loamy)
		{	ta.setText(s.loamy());}
		if(e.getSource()== sandy)
		{ta.setText(s.sandy());
			}
		if(e.getSource()==red )
		{ta.setText(s.red());
			
		}
		if(e.getSource()== back)
		{new studentclass();
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ssoil();
	}

}
