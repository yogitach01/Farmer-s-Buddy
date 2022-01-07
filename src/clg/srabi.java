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
public class srabi extends JFrame implements ActionListener {
	JFrame f;
	 JButton wheat,barley,peas,sugar,mustard,back;
	 JTextArea ta;JLabel im;
	public srabi() {setLayout(new BorderLayout());
	JPanel p=new JPanel(); add(p,BorderLayout.CENTER); setVisible(true);
	setSize(1200,1000);setTitle("rabi");
	p.setBackground(Color.GREEN);ImageIcon whe=new ImageIcon("D:\\wheat.jpg");
	 wheat=new JButton(whe);	
	 p.add(wheat);setVisible(true);
	 wheat.addActionListener(this);
	 ImageIcon bar=new ImageIcon("D:\\barley.jpg");
	 barley=new JButton(bar);	
	 p.add(barley);setVisible(true);
	 barley.addActionListener(this);
	 
	 ImageIcon pe=new ImageIcon("D:\\peas.png");
	 peas=new JButton(pe);	
	 p.add(peas);setVisible(true);
	 peas.addActionListener(this);
	 ImageIcon s=new ImageIcon("D:\\su.jpg");
	 sugar=new JButton(s);	
	 p.add(sugar);setVisible(true);
	 sugar.addActionListener(this);
	 ImageIcon m=new ImageIcon("D:\\mu.jpg");
	 mustard=new JButton(m);	
	 p.add(mustard);setVisible(true);
	 mustard.addActionListener(this);
	 
 ta=new JTextArea("",30,100);
	 p.add(ta);setVisible(true);JScrollPane sc=new JScrollPane(ta);
	 p.add(sc);
	 wheat.setBounds(50, 50,150, 150);
     barley.setBounds(250,50 ,150, 150);
    peas.setBounds(450,50,150, 150);
     sugar.setBounds(650,50 ,150, 150);     mustard.setBounds(850,50 ,150, 150);
     
     ta.setBounds(100,300 ,150, 20);
     back=new JButton("<-");back.addActionListener(this);
     p.add(back); setVisible(true);
     back.setBounds(10,10 ,20, 10);
     
     }
	public void actionPerformed(ActionEvent e)
	{ crop a=new crop();
		if(e.getSource()==wheat)
		{
			ta.setText(a.fwheat());
		}
		if(e.getSource()==barley)
		{
			ta.setText(a.fbarley());
		}
		if(e.getSource()== peas)
		{
		ta.setText(a.fpeas());	
		}
		if(e.getSource()==sugar )
		{
			ta.setText(a.fsugar());
		}
		if(e.getSource()==mustard )
		{
		ta.setText(a.fmustard());	
		}if(e.getSource()== back)
		{new sseason();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new srabi();
	}

}
