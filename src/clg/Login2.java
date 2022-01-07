package clg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Login2 extends JFrame implements ActionListener {
	JButton loginButton,resetButton,back;JTextField userTextField,passwordField;
	JLabel l3;
	String username,password;
 Login2(){
	 JPanel container=new JPanel();
	 add(container,BorderLayout.CENTER);
	 setTitle("Login Form");
 setVisible(true);container.setBackground(Color.GREEN);
 setSize(1200,1000);
 setResizable(false);
    JLabel userLabel=new JLabel("   USERNAME   ");
    
     userTextField=new JTextField(30);	
    JLabel l2=new JLabel(" ");
    JLabel passwordLabel=new JLabel("   PASSWORD   ");
    
    
     passwordField=new JPasswordField(30);	
     l3=new JLabel(" ");
     loginButton=new JButton("LOGIN");	
     resetButton=new JButton("RESET");	
 	loginButton.addActionListener(this);
 	resetButton.addActionListener(this);
 	resetButton.setBackground(Color.WHITE);
    loginButton.setBackground(Color.WHITE);
    
       container.add(userLabel);setVisible(true);
     container.add(userTextField);setVisible(true); 
     container.add(passwordLabel);setVisible(true);
       container.add(passwordField);setVisible(true);
      container.add(loginButton);setVisible(true);
       container.add(resetButton);setVisible(true);
       container.add(l3);setVisible(true);
       Insets in=container.getInsets();
       Dimension size=userLabel.getPreferredSize();
       userLabel.setBounds(100, 100, 100, 20);
       size=userTextField.getPreferredSize();
       userTextField.setBounds(200+in.right, 100, 100, 20);
       size=passwordLabel.getPreferredSize();
       passwordLabel.setBounds(100,140, 100, 20);
       size=passwordField.getPreferredSize();
       passwordField.setBounds(200+in.right,140, 100, 20);
       size=loginButton.getPreferredSize();
       loginButton.setBounds(100, 220, 100, 20);
       size=resetButton.getPreferredSize();
       resetButton.setBounds(200+in.right, 220, 100, 20);
       
       size=l3.getPreferredSize();
       l3.setBounds(100, 260, 100, 20); back=new JButton("<-");back.addActionListener(this);
       container.add(back); setVisible(true);
       size=back.getPreferredSize();
       back.setBounds(10,10 ,20, 10);back.setBackground(Color.WHITE);
       
   }
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==loginButton)
		{  username=userTextField.getText();
		password=passwordField.getText();
		Farmer f=new Farmer();
	if(password==f.check(username))	{
			new farmerclass();
			}
	else {
		new farmerclass();
	}
	}
    	if(e.getSource()==resetButton)
		{
    		userTextField.setText(" ");
    		passwordField.setText("");
		}
    	
    	if(e.getSource()== back)
		{new signUp2();
			}
    }   public static void main(String[] a){
      new Login2();
   }
 
}