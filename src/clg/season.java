package clg;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class season extends JFrame implements ActionListener {
	JFrame f;
	 JButton kharip,rabi,zaid,back;
	 JLabel im;
	public season() {setLayout(new BorderLayout());
	JPanel p=new JPanel(); add(p,BorderLayout.CENTER); setVisible(true);
	setSize(1200,1000);
	 setResizable(false);p.setBackground(Color.GREEN);
	 kharip=new JButton("KHARIP");	
	 p.add(kharip);setVisible(true);
	 kharip.addActionListener(this);
	 
	 rabi=new JButton("RABI");	
	 p.add(rabi);setVisible(true);
	 rabi.addActionListener(this);
	 
	 
	 zaid=new JButton("ZAID");	
	 p.add(zaid);setVisible(true);
	 zaid.addActionListener(this);
	 kharip.setBounds(50, 50,100, 20);
     rabi.setBounds(250,50 ,100, 20);
     zaid.setBounds(450,50,100, 20);
     back=new JButton("<-");back.addActionListener(this);
     p.add(back); setVisible(true);
     back.setBounds(10,10 ,20, 10);
     ImageIcon img=new ImageIcon("D:\\season.jpeg");

 	 im=new JLabel(img);
 	 
  p.add(im);setVisible(true);
  im.setBounds(10,75,1200, 800);
  im=new JLabel(img);
     }
	public void actionPerformed(ActionEvent e)
 	{
 		if(e.getSource()==kharip)
 		{
 			new kharip();
 		}
 		if(e.getSource()==rabi)
 		{
 			new  rabi();
 		}
 		if(e.getSource()== zaid)
 		{
 			new zaid();
 		}if(e.getSource()== back)
		{new farmerclass();
		}
 		
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new season();
	}

}
