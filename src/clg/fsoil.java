package clg;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import java.awt.event.ActionListener;

public class fsoil extends JFrame implements ActionListener {
	JFrame f;
	 JButton black,loamy,sandy,red,back;
	 JLabel scroll,im;
	 JTextArea ta;JComboBox c1;
	public fsoil() {
		setLayout(new BorderLayout());
		JPanel p=new JPanel(); add(p,BorderLayout.CENTER); setVisible(true);
		 setSize(1200,1000);
		 setResizable(false);p.setBackground(Color.GREEN);
		 String s1[] = { "MARATHI", "ENGLISH" }; 
			c1 = new JComboBox(s1);
		    c1.setSelectedIndex(0);
		    p.add(c1);
			
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
		 ta=new JTextArea("",2,100);
		 p.add(ta);setVisible(true);
	     black.setBounds(150, 50,200, 200);
	      loamy.setBounds(400,50 ,200, 200);
	      red.setBounds(650,50,200, 200);
	      sandy.setBounds(900,50 ,200, 200);
	      ta.setBounds(50,300 ,100, 20);
	      back=new JButton("<-");back.addActionListener(this);
	     p.add(back); back.setBounds(10,10 ,20, 10);
	     
		 }
	public void actionPerformed(ActionEvent e)
	{   
		if(e.getSource()==black)
		{if(c1.getSelectedItem()=="ENGLISH") {
			ta.setText("Crops Suitable for Black Soil\r\n"
				+ "Black soil derives its color from various salts and humus. \n Black soil contains a large quantity of clay but is also sandy in hillier regions\n "
				+ "and this soil contains small quantities of phosphorus but is \n"
				+ " low in nitrogen content. This soil form is used in corn, wheat, sugar cane, and cotton.\n"
				+ " It is further used for the cultivation of groundnut, millet, and oilseeds.\r\n"
				+ "Black soil is ideally suited for growing cotton, sugar cane, tobacco, wheat, millets, and oilseed crops.\n Black soil is to be the best soil type for cotton cultivation.\n"
				+ " It is also suitable for the production of cereals, oilseeds, citrus fruits and vegetables, \n tobacco and sugar cane, in addition to cotton.\n"
				+ " The retentiveness to moisture makes them ideal for dry farming.");
		}
		
		if(c1.getSelectedItem()=="MARATHI")
	{
			try {
			Desktop.getDesktop().open(new java.io.File("File/black.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	}
		}
		if(e.getSource()==loamy)
		{if(c1.getSelectedItem()=="ENGLISH") {
			ta.setText("Loamy soil is ideal for growing several crops that are wheat, sugarcane, cotton, pulses, and oilseeds.\n"
					+ " Vegetables also grow well in this loam soil.\n"
					+ " Some examples of common vegetables and crops that grow well in \n"
					+ "loamy soil are tomatoes, peppers, green beans, cucumbers, onions, and lettuce. \r\n"
					+ "because sand, silt, and clay together provide desirable characteristics.\n"
					+ " First, the different-sized particles leave spaces in the soil for air\n"
					+ " and water to flow and roots to penetrate. ... \n"
					+ "Silt-sized grains also contain nutrients and help make a soil workable.");
		}
		
		if(c1.getSelectedItem()=="MARATHI")
	{ 
			try {
			Desktop.getDesktop().open(new java.io.File("File/loamy.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	}
		}
		if(e.getSource()== sandy)
		{if(c1.getSelectedItem()=="ENGLISH") {
			ta.setText("Sandy soil contains more than 60% sand and clay.\n"
					+ " It contains very little clay and silt, so it is porous.\n"
					+ " The size of soil particles in sandy soil is from 0.2mm to 2.0mm.\n"
					+ " The water building capacity of a sandy soil is very poor.\n"
					+ " Hence, there is a lot of air present in this type of soil.\r\n"
					+ "Suitable Crops: Sandy soil is not good for plants.\n However, melon and coconut grow in sandy soil.\n"
					+ " If water is available for irrigation then crops such as maize, millets,\n barley can be grown in desert soil. Cactus also grows in this soil.");
		}
		
		if(c1.getSelectedItem()=="MARATHI")
	{
			try {
			Desktop.getDesktop().open(new java.io.File("File/sandy.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	}
		}
		if(e.getSource()==red )
		{if(c1.getSelectedItem()=="ENGLISH") {
			ta.setText(" The red color of soil is due to the presence of iron oxide. \n"
					+ "It appears yellow when it contains less iron or more water.\n"
					+ " Red soil contains a mixture of clay and sand, antis not fertile.\n"
					+ " However, the soil can be fertile by adding manures and fertilizers.\n"
					+ "Suitable Crops: It is suitable for growing groundnuts, pulses, millet, cotton and tobacco.");
		}
		
		if(c1.getSelectedItem()=="MARATHI")
	{
			try {
			Desktop.getDesktop().open(new java.io.File("File/red.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	}
		}
		if(e.getSource()== back)
		{new farmerclass();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new fsoil();
	}

}
