

import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prajwal
 */
public class Model {
    private String Fname;

    public void setFname(String Fname) {
        this.Fname = Fname;
    }
   public String getFname(){
      return this.Fname;
   }
   
   public void insertDb(){
       Connection c;
       try {
           c=DriverManager.getConnection("jdbc:mysql://localhost:3307/AdvanceJava", "root", "");
           
           String sql="insert into user values(?)";
           PreparedStatement  x= c.prepareStatement(sql);
           x.setString(1, Fname);
           x.execute();
           JOptionPane.showMessageDialog(null, "Inserted");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "connection error");
       }
       
   }
}
 