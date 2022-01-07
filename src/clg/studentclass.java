package clg;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class studentclass extends JFrame implements ActionListener {
	JFrame f;
	 JLabel l;
	 JComboBox c1;
	 JButton next,back;
	public studentclass() {
		setLayout(new BorderLayout());
		JPanel p=new JPanel();
	     
		f=new JFrame("Class");
		 setVisible(true);
		 add(p,BorderLayout.CENTER);
		 setSize(1200,1000);setResizable(false);p.setBackground(Color.GREEN);
	      l=new JLabel("select item :");
	      String s1[] = { "orchads","orchids" ,"fertiltizer", "crop", "soil" }; 
	      next=new JButton("CONTINUE");	
	      c1 = new JComboBox(s1);
	      c1.setSelectedIndex(0); 
p.add(l);setVisible(true);
p.add(c1);setVisible(true);
p.add(next);setVisible(true);

Insets in=p.getInsets();
Dimension size=l.getPreferredSize();
l.setBounds(100, 100, 100, 20);
size=c1.getPreferredSize();
c1.setBounds(100,140, 100, 20);

size=next.getPreferredSize();
next.setBounds(100, 300, 100, 20);
next.addActionListener(this);
back=new JButton("<-");back.addActionListener(this);
p.add(back); setVisible(true);
size=back.getPreferredSize();
back.setBounds(10,10 ,20, 10);
	}	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== next)
		{
			if(c1.getSelectedItem()=="soil") {
		 new ssoil();
			}
if(c1.getSelectedItem()=="fertiltizer") {
				new sfertilizer();
			}
if(c1.getSelectedItem()=="crop") {
	new sseason();
}
if(c1.getSelectedItem()=="orchids") {
	new orchids();
}
if(c1.getSelectedItem()=="orchads") {
	new sorchads();
}	} 
		if(e.getSource()== back)
		{new Login();
	}}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new	studentclass();
	}

}
