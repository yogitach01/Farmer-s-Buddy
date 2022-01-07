package clg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Login extends JFrame implements ActionListener {
	JButton loginButton,resetButton,back;JTextField userTextField,passwordField;
	JLabel l3;
	String username,password;
 public Login(){
	 JPanel p=new JPanel();
	 setTitle("login");
 setVisible(true);setSize(1200,1000);
 setLayout(new BorderLayout());add(p,BorderLayout.CENTER);
  p.setBackground(Color.GREEN);	JLabel userLabel=new JLabel("   USERNAME   ");
    
     userTextField=new JTextField(30);	
    JLabel passwordLabel=new JLabel("   PASSWORD   ");
     passwordField=new JPasswordField(30);	
     loginButton=new JButton("LOGIN");	
     resetButton=new JButton("RESET");	
	 
     resetButton.setBackground(Color.WHITE);
     loginButton.setBackground(Color.WHITE);
     
     loginButton.addActionListener(this);
  	resetButton.addActionListener(this);
  	back=new JButton("<-");back.addActionListener(this);
    p.add(back); setVisible(true);

  	p.add(userLabel);setVisible(true);
  	p.add(userTextField);setVisible(true); 
   	p.add(passwordLabel);setVisible(true);
 	p.add(passwordField);setVisible(true);
  	p.add(loginButton);setVisible(true);
  	p.add(resetButton);setVisible(true);
       userLabel.setBounds(100, 100, 100, 20);
       userTextField.setBounds(300, 100, 100, 20);
       passwordLabel.setBounds(100,140, 100, 20);
     
       passwordField.setBounds(300,140, 100, 20);
          loginButton.setBounds(100, 220, 100, 20);
      resetButton.setBounds(300, 220, 100, 20);
      
       loginButton.addActionListener(this);
       resetButton.addActionListener(this);         back.setBounds(10,10 ,20, 10);
       back.setBackground(Color.WHITE);
       
   }
   public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==loginButton)
		{  
   	new studentclass();
		
			} 
    	if(e.getSource()==resetButton)
		{
    		userTextField.setText(" ");
    		passwordField.setText("");
		}
    	
    	if(e.getSource()== back)
		{new signUp();
		
			}
    }    public static void main(String[] a){
      new Login();
    }
}
