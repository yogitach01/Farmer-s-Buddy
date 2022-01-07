package clg;


import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
public class sfuit extends JFrame implements ActionListener {
	JFrame f;
	 JLabel l,im;
	 JComboBox c1;
	 JButton next,back;JTextArea ta;
	public sfuit() {
		setLayout(new BorderLayout());
		JPanel p=new JPanel();
	     
		f=new JFrame("Class");p.setBackground(Color.GREEN);
		 setVisible(true);
		 add(p,BorderLayout.CENTER);
		 setSize(1200,1000);setResizable(false);ImageIcon img=new ImageIcon("D:\\fruit.jpeg");
	      l=new JLabel(img);
	      String s1[] = { "banana", "orange", "chiku", "mosambi","custard apple","guava" }; 
	      next=new JButton("CONTINUE");	
	      c1 = new JComboBox(s1);
	      c1.setSelectedIndex(0); 
	      
p.add(l);setVisible(true);
p.add(c1);setVisible(true);
p.add(next);setVisible(true);

ta=new JTextArea("",25,80);
p.add(ta);setVisible(true);JScrollPane sc=new JScrollPane(ta);
p.add(sc);
Insets in=p.getInsets();
Dimension size=l.getPreferredSize();
l.setBounds(10, 10, 100, 20);
size=c1.getPreferredSize();
c1.setBounds(100,140, 100, 20);

size=next.getPreferredSize();
next.setBounds(100, 300, 100, 20);
size=ta.getPreferredSize();
ta.setBounds(100, 330, 100, 20);

next.addActionListener(this);
back=new JButton("<-");back.addActionListener(this);
p.add(back); setVisible(true);
back.setBounds(10,10 ,20, 10);

	}	

 	public void actionPerformed(ActionEvent e)
	{fal f=new fal();
		if(e.getSource()== next)
		{
			if(c1.getSelectedItem()=="banana") {
			ta.setText(f.banana());	
			}
if(c1.getSelectedItem()=="orange") {
	ta.setText(f.orange());	
			}

if(c1.getSelectedItem()=="chiku") {
	ta.setText(f.chiku());
}
if(c1.getSelectedItem()=="mosambi") {
	ta.setText(f.mosambi());
}if(c1.getSelectedItem()=="custard apple") {
	ta.setText(f.custard());
}if(c1.getSelectedItem()=="guava") {
	ta.setText(f.guava());
}}if(e.getSource()== back)
{new sorchads();
}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new sfuit();
	}

}
