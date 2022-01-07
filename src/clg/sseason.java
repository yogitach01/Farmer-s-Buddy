package clg;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class sseason extends JFrame implements ActionListener {
	JFrame f;
	 JButton kharip,rabi,zaid,back;
	 JLabel im;
	public sseason() {setLayout(new BorderLayout());
	JPanel p=new JPanel(); add(p,BorderLayout.CENTER); setVisible(true);
	setSize(1200,1000);
	 setResizable(false);
	 kharip=new JButton("KHARIP");	p.setBackground(Color.GREEN);
	 p.add(kharip);setVisible(true);
	 kharip.addActionListener(this);
	 
	 rabi=new JButton("RABI");	
	 p.add(rabi);setVisible(true);
	 rabi.addActionListener(this);
	 
	 
	 zaid=new JButton("ZAID");	
	 p.add(zaid);setVisible(true);
	 zaid.addActionListener(this);
	 Insets in=p.getInsets();
	 Dimension size=kharip.getPreferredSize();
	 kharip.setBounds(50, 50,100, 20);
     size=rabi.getPreferredSize();
     rabi.setBounds(50,100 ,100, 20);
     size=zaid.getPreferredSize();
     zaid.setBounds(50,150,100, 20);
     back=new JButton("<-");back.addActionListener(this);
     p.add(back); setVisible(true);
     size=back.getPreferredSize();
     back.setBounds(10,10 ,20, 10);
     ImageIcon img=new ImageIcon("D:\\season.jpeg");

 	 im=new JLabel(img);
 	 
  p.add(im);setVisible(true);size=im.getPreferredSize();
  im.setBounds(10,75,1200, 800);
  im=new JLabel(img);
     }
	public void actionPerformed(ActionEvent e)
 	{
 		if(e.getSource()==kharip)
 		{
 			new skharip();
 		}
 		if(e.getSource()==rabi)
 		{
 			new  srabi();
 		}
 		if(e.getSource()== zaid)
 		{
 			new szaid();
 		}
 		if(e.getSource()== back)
		{new studentclass();
			}
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new sseason();
	}

}
