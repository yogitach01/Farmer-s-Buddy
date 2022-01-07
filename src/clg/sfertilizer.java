package clg;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class sfertilizer extends JFrame implements ActionListener {
	JFrame f;
	 JButton NITROGEN,PHOSPHOROUS,POTASSIUM,MICRONUTRIENT,PHENOPHASES,back;
	 JTextArea ta;JLabel im;
	public sfertilizer() {setLayout(new BorderLayout());
	JPanel p=new JPanel(); add(p,BorderLayout.CENTER); setVisible(true);
	setSize(1200,1000);
	 setResizable(false);p.setBackground(Color.GREEN);ImageIcon img=new ImageIcon("D:\\fer.jpeg");

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
	 PHENOPHASES.addActionListener(this);
	 ta=new JTextArea("",20,100);
	 p.add(ta);setVisible(true);
	 JScrollPane sc=new JScrollPane(ta);
	 p.add(sc);
	 NITROGEN.setBounds(50, 50,150, 20);
     PHOSPHOROUS.setBounds(50,100 ,150, 20);
     POTASSIUM.setBounds(50,150,150, 20);
     MICRONUTRIENT.setBounds(50,100 ,150, 20);
     PHENOPHASES.setBounds(50,150,150, 20);
     
     ta.setBounds(50,300 ,150, 20);
     back=new JButton("<-");back.addActionListener(this);
     p.add(back); setVisible(true);
     back.setBounds(10,10 ,20, 10);
	}

	public void actionPerformed(ActionEvent e)
	{fer s=new fer();
		if(e.getSource()==NITROGEN)
		{
			ta.setText(s.Nitrogen());
		}
		if(e.getSource()==PHOSPHOROUS)
		{ta.setText(s.pho());
		}
		if(e.getSource()== POTASSIUM)
		{
			ta.setText(s.pot());
		}if(e.getSource()== MICRONUTRIENT)
		{
			ta.setText(s.mi());
		}if(e.getSource()== PHENOPHASES)
		{
			ta.setText(s.p());
		}
		if(e.getSource()== back)
		{new studentclass();
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
new sfertilizer();
	}

}
