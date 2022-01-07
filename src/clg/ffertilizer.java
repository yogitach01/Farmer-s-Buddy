package clg;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import javax.swing.JTextArea;
public class ffertilizer extends JFrame implements ActionListener {
	JFrame f;
	 JButton NITROGEN,PHOSPHOROUS,POTASSIUM,MICRONUTRIENT,PHENOPHASES,marathi,back;
	 JTextArea ta;JLabel im;
	public ffertilizer() {setLayout(new BorderLayout());
	JPanel p=new JPanel(); add(p,BorderLayout.CENTER); setVisible(true);
	setSize(1200,1000);p.setBackground(Color.GREEN);
	 setResizable(false);ImageIcon img=new ImageIcon("D:\\fertilizer.jpeg");

 	 im=new JLabel(img);
 	 
  p.add(im);setVisible(true);
  im.setBounds(10,75,1200, 800);
 
	
	 NITROGEN=new JButton("NITROGEN");	
	 p.add(NITROGEN);setVisible(true);
	 NITROGEN.addActionListener(this);
	 
	 PHOSPHOROUS=new JButton("PHOSPHOROUS");	
	 p.add(PHOSPHOROUS);setVisible(true);
	 PHOSPHOROUS.addActionListener(this);
	 
	 
	 POTASSIUM=new JButton("POTASSIUM");	
	 p.add(POTASSIUM);setVisible(true);
	 POTASSIUM.addActionListener(this);
	 
	 MICRONUTRIENT=new JButton("MICRONUTRIENT");	
	 p.add(MICRONUTRIENT);setVisible(true);
	 MICRONUTRIENT.addActionListener(this);
	 
	 PHENOPHASES=new JButton("PHENOPHASES");	
	 p.add(PHENOPHASES);setVisible(true);
	 PHENOPHASES.addActionListener(this); marathi=new JButton("marathi");	
	 p.add(marathi);setVisible(true);
	 marathi.addActionListener(this);
	 ta=new JTextArea("",30,80);
	 p.add(ta);setVisible(true);JScrollPane sc=new JScrollPane(ta);
	 p.add(sc);
	 Insets in=p.getInsets();
	 Dimension size=NITROGEN.getPreferredSize();
	 NITROGEN.setBounds(50, 50,150, 20);
     size=PHOSPHOROUS.getPreferredSize();
     PHOSPHOROUS.setBounds(50,100 ,150, 20);
     size=POTASSIUM.getPreferredSize();
     POTASSIUM.setBounds(50,150,150, 20);
     size=MICRONUTRIENT.getPreferredSize();
     MICRONUTRIENT.setBounds(50,100 ,150, 20);
     size=PHENOPHASES.getPreferredSize();
     PHENOPHASES.setBounds(50,150,150, 20);
     
     size=ta.getPreferredSize();
     ta.setBounds(50,300 ,150, 20);
     back=new JButton("<-");back.addActionListener(this);
     p.add(back); setVisible(true);
     size=back.getPreferredSize();
     back.setBounds(10,10 ,20, 10);
    	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==NITROGEN)
		{ 
			ta.setText(" The main nitrogen-based straight fertilizer is ammonia or its solutions.\n"
					+ " Ammonium nitrate (NH4NO3) is also widely used. Urea is another popular source of nitrogen,\n"
					+ " having the advantage that it is solid and non-explosive, unlike ammonia and ammonium nitrate, respectively\r\n"
					+ "Necessary for legumes and all the crops to maintain ratio of nitrogen");
		}
		if(e.getSource()==PHOSPHOROUS)
		{ 
			ta.setText("Phosphorus fertilizers are the main input of inorganic phosphorus in agricultural soils and approximately 70%�80% of phosphorus in cultivated soils is inorganic \r\n"
					+ "Stimulated root development\r\n"
					+ "Use for :\r\n"
					+ "Increased stalk and stem strength\r\n"
					+ "Improved flower formation and seed production\r\n"
					+ "More uniform and earlier crop maturity\r\n"
					+ "Increased nitrogen N-fixing capacity of legumes\r\n"
					+ "Improvements in crop quality\r\n"
					+ "Increased resistance to plant diseases\r\n"
					+ "Supports development throughout entire life cycle ");
		}
		
		if(e.getSource()== POTASSIUM)
		{ 
			ta.setText("Potassium is associated with the movement of water, nutrients and carbohydrates in plant tissue. It�s involved with enzyme activation within the plant, which affects protein, starch and adenosine triphosphate (ATP) production\r\n"
					+ "Increases root growth and improves drought resistance.\r\n"
					+ "Maintains turgor; reduces water loss and wilting.\r\n"
					+ "Aids in photosynthesis and food formation.\r\n"
					+ "Reduces respiration, preventing energy losses.\r\n"
					+ "Enhances translocation of sugars and starch.\r\n"
					+ "Produces grain rich in starch.\r\n"
					+ "Increases plants� protein content.\r\n"
					+ "Builds cellulose and reduces lodging.\r\n"
					+ "Helps retard crop diseases");
		}
		
		
	
		if(e.getSource()== MICRONUTRIENT)
		{ fer a=new fer();
			ta.setText(a.mi());
		}
		
		
		
		
		if(e.getSource()== PHENOPHASES)
		{
			ta.setText(" Use for :Water and nutrient additions had significant effects on resprouting tree phenological stages.\r\n"
					+ "�\r\n"
					+ "Leaf discolouration occurred earlier in unsupplemented trees compared to supplemented trees.\r\n"
					+ "�\r\n"
					+ "Fruit presence was mainly in supplemented resprouting trees, a year after cutting.");
		}
		
		if(e.getSource()==marathi)
	{
			try {
			Desktop.getDesktop().open(new java.io.File("File/fr.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	}	
		
		
		if(e.getSource()== back)
		{new farmerclass();
		                   }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ffertilizer();
	}
}
