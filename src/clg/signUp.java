package clg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signUp extends JFrame implements ActionListener {
	JButton logButton,loginButton,back;
	String p, name,username,password;
	JTextField userTextField,usernam,passwordField;
	JLabel l2;JFrame f;
signUp(){ 
	 JPanel container=new JPanel();
	 add(container,BorderLayout.CENTER);
	 setTitle("Login Form");
 setVisible(true);JFrame f=new JFrame();
 setSize(1200,1000);
setResizable(false);container.setBackground(Color.GREEN);
    
    JLabel userLabel=new JLabel("   enter your name   ");
    
     userTextField=new JTextField(30);
JLabel createLabel=new JLabel("   username   ");
    
     usernam=new JTextField(30);
     l2= new JLabel("");
   
    JLabel passwordLabel=new JLabel("   create password   ");
     passwordField=new JPasswordField(30);	
   
     loginButton=new JButton("confirm");loginButton.addActionListener(this);
   
     loginButton.setBackground(Color.WHITE);
     
    JLabel detail=new JLabel("already have account  ");
     logButton=new JButton("click here");logButton.addActionListener(this);	
     logButton.setBackground(Color.WHITE);
     
       container.add(userLabel);setVisible(true);
     container.add(userTextField);setVisible(true); 
     container.add(createLabel);setVisible(true);
     container.add(usernam);setVisible(true); 
     container.add(passwordLabel);setVisible(true);
       container.add(passwordField);setVisible(true);
      container.add(loginButton);setVisible(true);
       container.add(detail);setVisible(true);
       container.add(logButton);setVisible(true);
       container.add(l2);setVisible(true);
       Insets in=container.getInsets();
	      Dimension size=userLabel.getPreferredSize();
       userLabel.setBounds(100, 60, 150, 20);
       size=userTextField.getPreferredSize();
       userTextField.setBounds(370, 60, 100, 20);
       size=createLabel.getPreferredSize();
       createLabel.setBounds(100, 100, 150, 20);
       size=usernam.getPreferredSize();
       usernam.setBounds(370, 100, 100, 20);
       size=passwordLabel.getPreferredSize();
       passwordLabel.setBounds(100,140, 200, 20);
       size=passwordField.getPreferredSize();
       passwordField.setBounds(370,140, 100, 20);
       size=loginButton.getPreferredSize();
       loginButton.setBounds(100, 220, 100, 20);
       size=detail.getPreferredSize();
       detail.setBounds(100, 260, 200, 20);
       size=logButton.getPreferredSize();
       logButton.setBounds(370, 260, 100, 20);
       size=l2.getPreferredSize();
      
       l2.setBounds(250,300, 100, 20);
       back=new JButton("<-");back.addActionListener(this);
       container.add(back); setVisible(true);
       size=back.getPreferredSize();
       back.setBounds(10,10 ,20, 10);     back.setBackground(Color.WHITE);
        
   }public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==loginButton)
		{
			name=userTextField.getText();
			username=usernam.getText();
			password=passwordField.getText();
			p=password; boolean num=true;
			   for(int i=0;i<p.length();i++) {
				   if(p.charAt(i)>=0||p.charAt(i)<=9) {
					num=true;
				   }
				   else {num=false;
				   }
			   }
			if(!((p.length()>=6)&&(p.length()<=10))) {
				  l2.setText("password length must be 6 to 10 character");passwordField.setText("");
			   }
	                         if(p.contains(" ")) {
	                   	 l2.setText("password doesnt contain space");passwordField.setText("");
			   }

			  
			   else if(num==false) {
				   l2.setText("password must contain no between 0 to 9");passwordField.setText("");
			   }
			   else if(!(p.contains("@")||p.contains("#")))
			   {
				   l2.setText("password must contain special character @ or #");passwordField.setText("");
			   }
			   else {
				   agriculturestudent a =new agriculturestudent();
				  a.item(name,username,password);
				
				  new Login();dispose();
			   }
			} 
	  	if(e.getSource()==logButton)
		{
			new Login();
			dispose();
			} 
    	if(e.getSource()== back)
		{new MainPage();dispose();
			}
    }public static void main(String[] a){
        new signUp();
    }
}