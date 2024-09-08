import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;

public class Home extends JFrame {
    
   Connection c;
   JPanel AddPanel, SelectPanel,UpdatePanel,DeletePanel;
   JTabbedPane MainPane;
   JLabel IDL,NameL,PriceL,IDDPL,NameUPL,PriceUPL,IDUPl;
   JTextField ID,Name,Price,IDDP,NameUP,PriceUP,IDUP;
   JButton Add,Update,Delete;
    DefaultTableModel dtm;
   
    public Home(){
        
       try {
           c=DriverManager.getConnection("jdbc:mysql://localhost:3307/AdvanceJava", "root", "");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "connection error");
           dispose();
       }
      
        
        
        
        AddPanel = new JPanel(null);
        SelectPanel = new JPanel();
        UpdatePanel= new JPanel(null);
        DeletePanel=new JPanel();
        
        IDL=new JLabel("ID");
        IDL.setBounds(10,2,40,30);
        IDDPL=new JLabel("ID");
        IDDPL.setBounds(10,2,40,30);
        IDUPl=new JLabel("ID");
        IDUPl.setBounds(10,2,40,30);
        
        
        NameL=new JLabel("Name");
        NameL.setBounds(10,65,40,30);
        NameUPL=new JLabel("Name");
        NameUPL.setBounds(10,65,40,30);
        
        
        PriceL=new JLabel("price");
        PriceL.setBounds(10,128,40,30);
        PriceUPL=new JLabel("price");
        PriceUPL.setBounds(10,128,40,30);
        
        ID =new JTextField(30);
        ID.setBounds(15,35,150,30);
        IDDP =new JTextField(30);
        IDDP.setBounds(15,35,150,30);
        IDUP =new JTextField(30);
        IDUP.setBounds(15,35,150,30);
        
        Name=new JTextField(30);
        Name.setBounds(15,98,150,30);
        NameUP=new JTextField(30);
        NameUP.setBounds(15,98,150,30);
        
        Price=new JTextField(30);
        Price.setBounds(15,161,150,30);
        PriceUP=new JTextField(30);
        PriceUP.setBounds(15,161,150,30);
        
        String[]Column={"ID","Name","Price"};
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(Column);
        addData(dtm);
        
        Delete = new JButton("Delete");
        Delete.addActionListener(new ActionListener(){

           @Override
           public void actionPerformed(ActionEvent e) {
               delete();
           }

           private void delete() {
               int id = Integer.parseInt(IDDP.getText());
               try {
                   Statement s = c.createStatement();
                   s.executeUpdate("Delete from product where ID="+id);
                   JOptionPane.showMessageDialog(null,"deleted");
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,"operation error");
               }
              finally{
                   IDDP.setText("");
              }
           }
        });
        
        JTable tb = new JTable(dtm);
        JScrollPane jsp = new JScrollPane(tb);
        SelectPanel.add(jsp);
        
        Add=new JButton("Add");
        Add.setBounds(15,200,100,40);
        Add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AddItem();
            }

            private void AddItem() {
               int id=Integer.parseInt(ID.getText());
               String n=Name.getText();
               Double p = Double.valueOf(Price.getText());
               
                try {
                    
                    
                    PreparedStatement pst = c.prepareStatement("insert into product values(?,?,?)");
                    pst.setInt(1, id);
                    pst.setString(2,n);
                    pst.setDouble(3, p);
                    
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(null, "one item inserted");
                   
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null, "operational error");
                }
                finally{
                   ID.setText("");
                   Name.setText("");
                   Price.setText("");
              }
            }
        
        });
        AddPanel.add(IDL);
        AddPanel.add(ID);
        AddPanel.add(NameL);
        AddPanel.add(Name);
        AddPanel.add(PriceL);
        AddPanel.add(Price);
        AddPanel.add(Add);
        
        DeletePanel.add(IDDPL);
        DeletePanel.add(IDDP);
        DeletePanel.add(Delete);
        
        Update=new JButton("Update");
        
        Update.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               int id=Integer.parseInt(IDUP.getText());
               String n=NameUP.getText();
               Double p = Double.valueOf(PriceUP.getText());
                try {
                   PreparedStatement pst = c.prepareStatement("Update product set Name=?,Price=? where ID=?");
                   pst.setInt(3, id);
                    pst.setString(1,n);
                    pst.setDouble(2, p);
                   pst.execute();
                   JOptionPane.showMessageDialog(null,"Updated");
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,"operation error");
               }
              finally{
                   IDUP.setText("");
                   NameUP.setText("");
                   PriceUP.setText("");
              }
           }
        
        
        });
        Update.setBounds(Add.getBounds());
        UpdatePanel.add(IDUPl);
        UpdatePanel.add(IDUP);
        UpdatePanel.add(NameUPL);
        UpdatePanel.add(NameUP);
        UpdatePanel.add(PriceUPL);
        UpdatePanel.add(PriceUP);
        UpdatePanel.add(Update);
        
              
        MainPane = new JTabbedPane();
        MainPane.add(AddPanel,"Add");     
        MainPane.add(SelectPanel,"show");
        MainPane.add(UpdatePanel,"Update");
        MainPane.add(DeletePanel,"Delete");
        
        add(MainPane);
        setVisible(true);
        setSize(500,500);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Home();
    }

    private void addData(DefaultTableModel dtm) {
        Object[] row=new Object[3];
       try {
           Statement s = c.createStatement();
           ResultSet r =s.executeQuery("select * from product");
           while(r.next()){
               row[0]=r.getInt("ID");
               row[1]=r.getString("Name");
               row[2]=r.getDouble("Price");
               dtm.addRow(row);
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "operational error");
       }
    }
}
