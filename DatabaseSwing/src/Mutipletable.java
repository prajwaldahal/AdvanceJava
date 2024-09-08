
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author prajwal
 */
public class Mutipletable extends JFrame {
    JTextArea jta;
    JTextField jt;
    JButton jb;
    Connection c;
    public Mutipletable() {
       jt = new JTextField(30);
       jb= new JButton("search");
       jta = new JTextArea(10,30);
       jb.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   c=DriverManager.getConnection("jdbc:mysql://localhost:3307/AdvanceJava", "root", "");
                   PreparedStatement  pst= c.prepareStatement("select * from user,details where user.id=? and user.id=details.id");
                   pst.setInt(1,Integer.parseInt(jt.getText()));
                   ResultSet r =pst.executeQuery();
                   jt.setText("");
                   String messg =" ";
                   while(r.next()){
                      messg=r.getInt("id")+"\n"+r.getString("Name")+"\n"+r.getString("Contact")+"\n"+r.getString("Address");
                   }
                   jta.setText(messg);
               } catch (Exception ex) {
                   ex.printStackTrace();
                   JOptionPane.showMessageDialog(null, "errror");
               }
           }
       });
       add(jt);
       add(jb);
        add(jta);
       setVisible(true);
       setSize(300,400);
               setLayout(new FlowLayout());
       
    }

    public static void main(String[] args) {
        new Mutipletable();
    }
    
}
