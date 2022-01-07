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
public class szaid extends JFrame implements ActionListener {
	JFrame f;
	 JButton seasonalfruits,vegetables,flowers,back;
	 JTextArea ta;JLabel im;
	public szaid() {setLayout(new BorderLayout());
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
	{ 
		if(e.getSource()==seasonalfruits)
		{
			new sfuit();
		}
		if(e.getSource()==vegetables)
		{
			new veg();
			}
		if(e.getSource()== flowers)
		{
			new orchids();
			}
		if(e.getSource()== back)
		{new sseason();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new szaid();
	}

}
