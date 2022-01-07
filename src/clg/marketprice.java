package clg;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class marketprice extends JFrame implements ActionListener
{
	JFrame f;
	JButton vegetable,fruit,wheat,back;
	 JTextArea ta;
		public marketprice()
	{ 
		setLayout(new BorderLayout());
		JPanel p=new JPanel(); 
		 add(p,BorderLayout.CENTER);
			f=new JFrame("main page");f.setTitle("farmer buddy");
		 setVisible(true);setSize(1200,1000);
		
		 vegetable=new JButton(" vegetable");
		 setVisible(true);
		 vegetable.addActionListener(this);
		p.add(vegetable);
		vegetable.setBackground(Color.WHITE);
	     
		fruit=new JButton("fruit");
		 setVisible(true);
		 fruit.addActionListener(this);
		 fruit.setBackground(Color.WHITE);
	     
	p.add(fruit);
	 
	wheat=new JButton("grains");
	 setVisible(true);
	 wheat.addActionListener(this);
	 wheat.setBackground(Color.WHITE);
    
p.add(wheat);

		add(p,BorderLayout.CENTER);
		 vegetable.setBounds(50, 100, 100, 20);
		wheat.setBounds(200, 100,100, 20);
	      fruit.setBounds(400,100,100, 20);
	      p.setBackground(Color.GREEN);
	      ta=new JTextArea("",25,80);
	      p.add(ta);setVisible(true);JScrollPane sc=new JScrollPane(ta);
	      p.add(sc);   
	      back=new JButton("<<---");back.addActionListener(this);
	      p.add(back); setVisible(true);
	      back.setBounds(10,10 ,50, 40);
	}
 	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== vegetable)
		{ta.setText(" Vegetable Prices (Rs./Quintal)\r\n"
				+ "	\r Min	Max\r\n"
				+ "Tomato		\r\n"
				+ "Deshi	1600	1900\r\n"
				+ "Hybrid	1000	2100\r\n"
				+ "Potato		\r\n"
				+ "Big	2400	3200\r\n"
				+ "Chips	1000	1600\r\n"
				+ "Desi	400	700\r\n"
				+ "Peas Wet	1000	3800\r\n"
				+ "Leafy Vegetable	1100	1550\r\n"
				+ "Onion	1600	2000\r\n"
				+ "Beetroot 600	800	\r\n"
				+ "Brinjal	1500	3500\r\n"
				+ "Cabbage	700	1200\r\n"
				+ "Carrot	700	1200\r\n"
				+ "Chilly Capsicum	1500	2200\r\n"
				+ "Green Chilly	2000	3200");
			} 
		
		if(e.getSource()==wheat)
		{ta.setText(" Quality	Mandi	Price Day Low (Per Quintal)	Price Day High (Per Quintal)\r\n"
				+ "Wheat Top	NCR	INR 2100	INR 2200\r\n"
				+ "Wheat Mill	NCR	INR 2050	INR 2100\r\n"
				+ "Wheat Mill	Rajasthan	INR 1850	INR 1940\r\n"
				+ "Wheat Top	Rajashtan	INR 2000	INR 2050\r\n"
				+ "Wheat Mill	Uttar Pradesh, Uttarakhand	INR 1970	INR 2035\r\n"
				+ "Wheat Top	Uttar Pradesh	INR 2050	INR 2100\r\n"
				+ "Wheat Mill	Punjab	INR 1980	INR 2060\r\n"
				+ "Wheat Dara	Gujarat	INR 1775	INR 1990\r\n"
				+ "Wheat Mill	Gujarat	INR 2200	INR 2250\r\n"
				+ "Wheat Mill	Chennai, Kerala, Tamil Nadu	INR 2475	INR 2550\r\n"
				+ "Wheat Sharbati	Madhya Pradesh	INR 2850	INR 3000\r\n"
				+ "Wheat Mill	Madhya Pradesh	INR 2100	INR 2200\r\n"
				+ "Wheat Dara	Madhya Pradesh	INR 1900	INR 2000\r\n"
				+ "Wheat Mill	West Bengal	INR 2050	INR 2100\r\n"
				+ "Wheat MP Sharbati (Retail)	National	INR 3400	INR 3700");
			}
		
		if(e.getSource()==fruit)
		{ta.setText(" Fruits Name	Unit	Market Price	Retail Price	Shopping Mall\r\n"
				+ "Apple washington	Kg / Pcs	 128	 147 - 163	 154 - 211\r\n"
				+ "Apple Simla	Kg / Pcs	 91	 105 - 116	 109 - 150\r\n"
				+ "Apple Green ( Smith )	Kg / Pcs	 144	 166 - 183	 173 - 238\r\n"
				+ "Apricot	Kg / Pcs	 154	 177 - 196	 185 - 254\r\n"
				+ "Avocado (Butterfruit)	Kg / Pcs	 222	 255 - 282	 266 - 366\r\n"
				+ "Banana Morris Kg	Kg / Pcs	 24	 28 - 30	 29 - 40\r\n"
				+ "Banana Regular	Kg / Pcs	 41	 47 - 52	 49 - 68\r\n"
				+ "Banana other	Kg / Pcs	 43	 49 - 55	 52 - 71\r\n"
				+ "Cantaloupe (Musk melon)	Kg / Pcs	 29	 33 - 37	 35 - 48\r\n"
				+ "Custard apple	Kg / Pcs	 42	 48 - 53	 50 - 69\r\n"
				+ "Gooseberry, Indian	Kg / Pcs	 74	 85 - 94	 89 - 122\r\n"
				+ "Grapes ( Black )	Kg / Pcs	 65	 75 - 83	 78 - 107\r\n"
				+ "Grapes ( Green )	Kg / Pcs	 70	 81 - 89	 84 - 116\r\n"
				+ "Guava	Kg / Pcs	 37	 43 - 47	 44 - 61\r\n"
				+ "Lychee	Kg / Pcs	 194	 223 - 246	 233 - 320\r\n"
				+ "Mango, ripe	Kg / Pcs	 86	 99 - 109	 103 - 142\r\n"
				+ "Mango, unripe	Kg / Pcs	 84	 97 - 107	 101 - 139\r\n"
				+ "Orange	Kg / Pcs	 49	 56 - 62	 59 - 81\r\n"
				+ "Orange Imported	Kg / Pcs	 62	 71 - 79	74 - 102\r\n"
				+ "Papaya	Kg / Pcs	 28	 32 - 36	 34 - 46\r\n"
				+ "Pears	Kg / Pcs	 114	 131 - 145   137 - 188\r\n"
				+ "Pineapple	Kg / Pcs	 28	 32 - 36	 34 - 46\r\n"
				+ "Pomegranate	Kg / Pcs	 92	 106 - 117	 110 - 152\r\n"
				+ "Sapota (Sapodilla)	Kg / Pcs	 44	 51 - 56	 53 - 73\r\n"
				+ "Sugar cane	Kg / Pcs	 29	 33 - 37	 35 - 48\r\n"
				+ "Sweet lime	Kg / Pcs	 55	 63 - 70	 66 - 91\r\n"
				+ "Watermelon	Kg / Pcs	 19   22 - 24	 23");
			}
		if(e.getSource()== back)
		{new farmerclass();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new marketprice();
	}

}
