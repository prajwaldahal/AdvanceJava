/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author prajwal
 */
public class Notepad extends JFrame{
    JPanel Container1;
    JTextArea editWindow;
    public Notepad(){
        Container1 = new JPanel(null);
        
        
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("file");
        JMenu edit = new JMenu("edit");
        JMenu view = new JMenu("view");
        
        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveAs = new JMenuItem("Saveas");
        JMenuItem open = new JMenuItem("Open");
        
        editWindow = new JTextArea();
        editWindow.setBounds(0,21,500,579);
        
        save.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                saveActionPerformed();
            }
        });
        
        saveAs.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               saveAsActionPerformed();
            }
        });
       
        open.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                openActionPerformed();
            }
        });
                
        
        menubar.add(file);
        menubar.add(edit);
        menubar.add(view);
        
        menubar.setBounds(1,1,500,20);
        
        file.add(save);
        file.add(saveAs);
        file.add(open);
        
        Container1.add(menubar);
        Container1.add(editWindow);
        
        add(Container1);
        
        setVisible(true);
        setSize(500,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Notepad();
    }
    
    private void saveActionPerformed(){
               
    }
    
    private void saveAsActionPerformed() {
    
    }
    private void openActionPerformed(){
        Open O= new Open();
        System.out.println(O.getString()+"hello");
        
    }
}
