package com.mycompany.kcmit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;
/**
 *
 * @author prajwal
 */
public class Login extends JFrame{
   public Login(){
       JPanel jp = new JPanel();
       JLabel UsernameL = new JLabel("Username");
       JLabel PasswordL = new JLabel("Password");
       JTextField Username = new JTextField(30);
       JPasswordField Password = new JPasswordField(30);
       JButton LoginB = new JButton("Login");
       JButton Cancel= new JButton("Cancel");
       JButton SignUp= new JButton("SignUp");
       Password.setText("hello");
        LoginB.addActionListener(new ActionListener(){

           @Override
           public void actionPerformed(ActionEvent e) {
              if(Arrays.equals(Password.getPassword(),"123".toCharArray()) && Username.getText().equals("subhanjal")){
                  dispose(); 
                  CalculatorDrag cd=new CalculatorDrag();
                   cd.setVisible(true);
              } else {
                  JOptionPane.showMessageDialog(null, "invalid Username or password");
               }
           }
       });
       
       Cancel.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               Username.setText("");
           }
           
       });
       
       jp.add(UsernameL);
       jp.add(Username);
       jp.add(PasswordL);
       jp.add(Password);
       jp.add(LoginB);
       jp.add(Cancel);
       jp.add(SignUp);
       
       add(jp);
       
      
       
       setVisible(true);
       setLocationRelativeTo(null);
       setSize(400,400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
    public static void main(String[] args) {
        new Login();
    }
}