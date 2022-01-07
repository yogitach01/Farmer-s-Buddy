package clg;
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
public class farmerclass extends JFrame implements ActionListener {
	JFrame f;
	 JLabel l,im;
	 JComboBox c1;
	 JButton next,back;
	public farmerclass() {
		setLayout(new BorderLayout());
		JPanel p=new JPanel(); 
		 add(p,BorderLayout.CENTER);
		f=new JFrame("Class");
		 setVisible(true);
		p.setBackground(Color.GREEN);
		 setSize(1200,1000);setResizable(false);
	      l=new JLabel("select item :");
	      String s1[] = { "soil", "fertiltizer", "crop details", "market price", "storage tips" }; 
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
ImageIcon img=new ImageIcon("D:\\far.jpeg");

	 im=new JLabel(img);
	 
 p.add(im);setVisible(true);size=im.getPreferredSize();
 im.setBounds(100,75,1000, 800);
 im=new JLabel(img);
 	   p.setBackground(Color.GREEN);
	}	
 	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== next)
		{
			if(c1.getSelectedItem()=="soil") {
				new fsoil();
			}
if(c1.getSelectedItem()=="fertiltizer") {
				new ffertilizer();
			}
if(c1.getSelectedItem()=="crop details") {
	new season();
}
if(c1.getSelectedItem()=="market price") {
	new marketprice();
}
if(c1.getSelectedItem()=="storage tips") {
	new storage();
}
		} 
		
		if(e.getSource()== back)
		{new Login2();
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new farmerclass();
	}
}
