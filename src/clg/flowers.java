package clg;
import java.awt.event.*;
import java.io.IOException;
import java.awt.*; 
import javax.swing.*; 
public class flowers extends JFrame implements ActionListener {
	JFrame f;
	 JLabel l,im;
	 JComboBox c1;
	 JButton next,back,m;JTextArea ta;
	public flowers(){
		setLayout(new BorderLayout());
		JPanel p=new JPanel();
		p.setBackground(Color.GREEN);
		f=new JFrame("Class");
		 setVisible(true);
		 add(p,BorderLayout.CENTER);
		 setSize(1200,1000);setResizable(false);ImageIcon img=new ImageIcon("D:\\orchids.jpeg");

		 im=new JLabel(img);
		 
		p.add(im);setVisible(true);;
		im.setBounds(10,75,1200, 800);

	      l=new JLabel("select flower");
	      String s1[] = { "marigold","rose", "chrysanthemum", "gladiolus" ,"aster", "jasmine","  mogra"}; 
	      next=new JButton("english");	
	      c1 = new JComboBox(s1);
	      c1.setSelectedIndex(0); 
	      m=new JButton("marathi");
p.add(l);setVisible(true);
p.add(c1);setVisible(true);
p.add(next);setVisible(true);
p.add(m);setVisible(true);
ta=new JTextArea("",20,50);
p.add(ta);setVisible(true);JScrollPane sc=new JScrollPane(ta);
p.add(sc);
l.setBounds(100, 100, 100, 20);
c1.setBounds(100,140, 100, 20);
next.setBounds(100, 300, 100, 20);
ta.setBounds(100, 330, 100, 20);

next.addActionListener(this);m.addActionListener(this);
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
	  }}
	  		if(e.getSource()== m)
			{
				if(c1.getSelectedItem()=="marigold") {
					try {Desktop.getDesktop().open(new java.io.File("File/marigold.txt"));	
					
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}		}
	if(c1.getSelectedItem()=="rose") {
		try {
			Desktop.getDesktop().open(new java.io.File("File/rose.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			}
	if(c1.getSelectedItem()=="chrysanthemum") {
		try {
			Desktop.getDesktop().open(new java.io.File("File/chrysanthemum.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
	}
	if(c1.getSelectedItem()=="gladiolus") {
		try {
			Desktop.getDesktop().open(new java.io.File("File/gladiolus.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	}
	if(c1.getSelectedItem()=="aster") {
		try {
			Desktop.getDesktop().open(new java.io.File("File/aster.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	}
	if(c1.getSelectedItem()=="Jasmine") {
		try {
			Desktop.getDesktop().open(new java.io.File("File/jasmine.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	}
	if(c1.getSelectedItem()=="mogra") {
		try {
			Desktop.getDesktop().open(new java.io.File("File/mogra.txt"));	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	}
			}
	
	  		if(e.getSource()== back)
		{new zaid();
		}
	  		}
	  	public static void main(String[] args) {
	  		// TODO Auto-generated method stub
	  new flowers();
	  	}
	  }