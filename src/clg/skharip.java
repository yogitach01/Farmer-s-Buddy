package clg;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class skharip extends JFrame implements ActionListener {
	JFrame f;
	 JButton rice,maize,jowar,bajra,tur,moong,urad,cotton,jute,groundnut,soybean,back;
	 JTextArea ta;JLabel im;JComboBox c1;
	public skharip() {setLayout(new BorderLayout());
	JPanel p=new JPanel(); add(p,BorderLayout.CENTER); setVisible(true);
	setSize(1200,1000);setTitle("kharip");
	 setResizable(false);p.setBackground(Color.GREEN);
	 ImageIcon img=new ImageIcon("D:\\rice.jpeg");

	 rice=new JButton(img);	
	 p.add(rice);setVisible(true);
	 rice.addActionListener(this);
	 
	 ImageIcon ma=new ImageIcon("D:\\maize.jpg");

	 maize=new JButton(ma);	
	 p.add(maize);setVisible(true);
	 maize.addActionListener(this);
	 
	 
	 ImageIcon j=new ImageIcon("D:\\ja.jpg");
jowar=new JButton(j);	
	 p.add(jowar);setVisible(true);
	 jowar.addActionListener(this);
	 
	 ImageIcon b=new ImageIcon("D:\\ba.jpg");

	 bajra=new JButton(b);	
	 p.add(bajra);setVisible(true);
	 bajra.addActionListener(this);
	 ImageIcon t=new ImageIcon("D:\\t.jpg");

	 tur=new JButton(t);	
	 p.add(tur);setVisible(true);
	 tur.addActionListener(this);
	 ImageIcon mo=new ImageIcon("D:\\mong.jpg");

	 moong=new JButton(mo);	
	 p.add(moong);setVisible(true);
	 moong.addActionListener(this);
	 
	 ImageIcon ur=new ImageIcon("D:\\ur.jpg");
 
	 urad=new JButton(ur);	
	 p.add(urad);setVisible(true);
	 urad.addActionListener(this);
	 
	 ImageIcon c=new ImageIcon("D:\\cotton.jpeg");

	 cotton=new JButton(c);	
	 p.add(cotton);setVisible(true);
	 cotton.addActionListener(this);
	 
	 ImageIcon ju=new ImageIcon("D:\\ju.jpg");

	 jute=new JButton(ju);	
	 p.add(jute);setVisible(true);
	 jute.addActionListener(this);
	 ImageIcon g=new ImageIcon("D:\\gro.jpeg");
	 
	 groundnut=new JButton(g);	
	 p.add(groundnut);setVisible(true);
	 groundnut.addActionListener(this);
	 ImageIcon s=new ImageIcon("D:\\soy.jpeg");

	 
	 soybean=new JButton(s);	
	 p.add(soybean);setVisible(true);
			 soybean.addActionListener(this);
			 ta=new JTextArea("",20,100);
			 p.add(ta);setVisible(true);JScrollPane sc=new JScrollPane(ta);
			 p.add(sc);
			 
			 rice.setBounds(70, 10,100, 20);
		     maize.setBounds(50,40 ,100, 20);
		     jowar.setBounds(50,70,100, 20);
		     bajra.setBounds(50,100 ,100, 20);
		     tur.setBounds(50,130 ,100, 20);

		     moong.setBounds(50,160 ,100, 20);
		     urad.setBounds(50,190,100, 20);
		     cotton.setBounds(50,220 ,100, 20);
		     jute.setBounds(50,250 ,100, 20);
		     groundnut.setBounds(50,280,100, 20);
		  
		     soybean.setBounds(50,310 ,100, 20);
		     
		     ta.setBounds(100,300 ,150, 20);
		     back=new JButton("<-");back.addActionListener(this);
		     p.add(back); setVisible(true);
		  
		     back.setBounds(10,10 ,50, 20);

	}
	public void actionPerformed(ActionEvent e)
	{crop j=new crop();
		if(e.getSource()==rice)
		{	ta.setText(j.frice());
					
		}
		if(e.getSource()==maize)
		{	ta.setText(j.maize());
		}
		if(e.getSource()== jowar)
		{	ta.setText(j.fjowar());
		}
		if(e.getSource()==bajra )
		{ta.setText(j.fbajra());
		}
		if(e.getSource()==moong )
		{
			ta.setText(j.fmoong());
		}
		if(e.getSource()==urad)
		{
			ta.setText(j.furad());
		}
		if(e.getSource()== jute)
		{
			ta.setText(j.fjute());
		}
		if(e.getSource()==groundnut )
		{
			ta.setText(j.fgr());
		}
		if(e.getSource()==soybean )
		{
			ta.setText(j.fso());
		}
		if(e.getSource()== back)
		{new sseason();
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new skharip();
	}

}
