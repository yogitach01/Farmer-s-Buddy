package clg;
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
public class orchids extends JFrame implements ActionListener {
	JFrame f;
	 JLabel l,im;
	 JComboBox c1;
	 JButton next,back;JTextArea ta;
	public orchids(){
		setLayout(new BorderLayout());
		JPanel p=new JPanel();
		p.setBackground(Color.GREEN);
		f=new JFrame("Class");
		 setVisible(true);
		 add(p,BorderLayout.CENTER);
		 setSize(1200,1000);setResizable(false);
	      l=new JLabel("select flower");ImageIcon img=new ImageIcon("D:\\orchids.jpeg");

	      im=new JLabel(img);
	      
	     p.add(im);setVisible(true);
	     im.setBounds(10,75,1200, 800);

	      String s1[] = { "marigold","rose", "chrysanthemum", "gladiolus" ,"aster", "jasmine","  mogra"}; 
	      next=new JButton("CONTINUE");	
	      c1 = new JComboBox(s1);
	      c1.setSelectedIndex(0); 
	      
p.add(l);setVisible(true);
p.add(c1);setVisible(true);
p.add(next);setVisible(true);

ta=new JTextArea("",20,70);
p.add(ta);setVisible(true);JScrollPane sc=new JScrollPane(ta);
p.add(sc);
l.setBounds(100, 100, 100, 20);
c1.setBounds(100,140, 100, 20);
next.setBounds(100, 300, 100, 20);
ta.setBounds(100, 330, 100, 20);

next.addActionListener(this);
back=new JButton("<-");back.addActionListener(this);
p.add(back); setVisible(true);
back.setBounds(10,10 ,20, 10);

	}
	public void actionPerformed(ActionEvent e)
	  	{ful f=new ful();
	  		if(e.getSource()== next)
	  		{
	  			if(c1.getSelectedItem()=="marigold") {
	  				ta.setText(f.mari());
	  			}
	  if(c1.getSelectedItem()=="rose") {
	  				ta.setText(f.rose());
	  			}
	  if(c1.getSelectedItem()=="chrysanthemum") {
	  	ta.setText(f.Chrysanthemum());
	  }
	  if(c1.getSelectedItem()=="gladiolus") {
ta.setText(f.gladiolus());
	  }
	  if(c1.getSelectedItem()=="aster") {
	  	ta.setText(f.aster());
	  }if(c1.getSelectedItem()=="Jasmine") {
	  	ta.setText(f.jasmine());
	  }if(c1.getSelectedItem()=="mogra") {
	  	ta.setText(f.mogra());
	  }}if(e.getSource()== back)
		{new studentclass();
		}
	  		}
	  	public static void main(String[] args) {
	  		// TODO Auto-generated method stub
	  new orchids();
	  	}
	  }