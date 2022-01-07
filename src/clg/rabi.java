package clg;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;
public class rabi extends JFrame implements ActionListener {
	JFrame f;
	 JButton wheat,mwheat,barley,mbarley,peas,mpeas,sugar,msugar,mustard,mmustard,back,im;
	 JTextArea ta;JComboBox c1;
	public rabi() {setLayout(new BorderLayout());
	JPanel p=new JPanel(); add(p,BorderLayout.CENTER); setVisible(true);
	setSize(1200,1000);setTitle("rabi");
	p.setBackground(Color.GREEN); 
	String s1[] = { "MARATHI", "ENGLISH" }; 
	c1 = new JComboBox(s1);
    c1.setSelectedIndex(0);
    p.add(c1);
	ImageIcon whe=new ImageIcon("D:\\wheat.jpg");
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
		
 ta=new JTextArea("",30,100); p.add(ta);setVisible(true);
 JScrollPane sc=new JScrollPane(ta);
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
	{ 	crop a=new crop();if(e.getSource()==wheat)
	{ if(c1.getSelectedItem()=="ENGLISH") {
		ta.setText(a.fwheat());
	}
	
		if(c1.getSelectedItem()=="MARATHI")
	{
			try {
			Desktop.getDesktop().open(new java.io.File("File/WHEAT.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	}}
	
		if(e.getSource()==barley)
		{
			if(c1.getSelectedItem()=="ENGLISH") {
				ta.setText(a.fbarley());
			}
			
				if(c1.getSelectedItem()=="MARATHI")
			{
					try {
					Desktop.getDesktop().open(new java.io.File("File/barley.txt"));	
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	}
		}
		if(e.getSource()== peas)
		{
			if(c1.getSelectedItem()=="ENGLISH") {
				ta.setText(a.fpeas());
			}
			
				if(c1.getSelectedItem()=="MARATHI")
			{
					try {
					Desktop.getDesktop().open(new java.io.File("File/peas.txt"));	
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	}
		}
		if(e.getSource()==sugar )
		{if(c1.getSelectedItem()=="ENGLISH") {
			ta.setText(a.fsugar());
		}
		
			if(c1.getSelectedItem()=="MARATHI")
		{
				try {
				Desktop.getDesktop().open(new java.io.File("File/sugar.txt"));	
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	}
		}
		if(e.getSource()==mustard )
		{if(c1.getSelectedItem()=="ENGLISH") {
			ta.setText(a.fmustard());
		}
		
			if(c1.getSelectedItem()=="MARATHI")
		{
				try {
				Desktop.getDesktop().open(new java.io.File("File/mustard.txt"));	
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	}}
		if(e.getSource()== back)
		{
			new season();
			
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new rabi();
	}

}
