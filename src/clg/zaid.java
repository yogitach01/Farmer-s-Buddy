package clg;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class zaid extends JFrame implements ActionListener {
	JFrame f;
	 JButton seasonalfruits,vegetables,flowers,back;
	 JTextArea ta;JLabel im;
	public zaid() {setLayout(new BorderLayout());setTitle("zaid");
	JPanel p=new JPanel(); add(p,BorderLayout.CENTER); setVisible(true);
	setSize(1200,1000);p.setBackground(Color.GREEN);
	 setResizable(false);     ImageIcon fr=new ImageIcon("D:\\fr.jpg");

	 seasonalfruits=new JButton(fr);	
	 p.add(seasonalfruits);setVisible(true);
	 seasonalfruits.addActionListener(this);
     ImageIcon ve=new ImageIcon("D:\\vegetable.jpg");

	 vegetables=new JButton(ve);	
	 p.add(vegetables);setVisible(true);
	 vegetables.addActionListener(this);
     ImageIcon fl=new ImageIcon("D:\\flower.jpg");
	 flowers =new JButton(fl);	
	 p.add(flowers);setVisible(true);
	 flowers.addActionListener(this);
	 seasonalfruits.setBounds(50, 50,150, 20);
     vegetables.setBounds(50,100 ,150, 20);
     flowers.setBounds(50,150,150, 20);
     
    
     back=new JButton("<<--");back.addActionListener(this);
     p.add(back); setVisible(true);
     back.setBounds(10,10 ,20, 10);

 	 }
	public void actionPerformed(ActionEvent e)
	{crop a=new crop();
		if(e.getSource()==seasonalfruits)
		{
			new fruits();
		}
		if(e.getSource()==vegetables)
		{
			new vegetables();
		}
		if(e.getSource()== flowers)
		{
			new flowers();
			 
		}if(e.getSource()== back)
		{new season();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new zaid();
	}

}
