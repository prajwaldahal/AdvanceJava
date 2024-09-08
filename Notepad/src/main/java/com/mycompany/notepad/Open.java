/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notepad;

import java.awt.event.*;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author prajwal
 */
public class Open extends JFrame  {
    public String Text=" ";
    private final JFileChooser fc;
    private JPanel jp;

    public String getString() {
        System.out.println(Text);
        return Text.trim();
       
    }
    public Open(){
        JPanel jp = new JPanel();
        fc = new JFileChooser();
        fc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fcActionperformed();
            }
        });
        jp.add(fc);
        add(jp);
        setVisible(true);
        setSize(600,400);
    }
    public void fcActionperformed(){
         int c;
                int result=fc.showSaveDialog(jp);
                if(result==JFileChooser.APPROVE_OPTION){
                    File selectedFile = fc.getSelectedFile();
                    System.out.println(getExtension(selectedFile.getName()));
                    if(!getExtension(selectedFile.getName()).equals(".txt")){
                            JOptionPane.showMessageDialog(null,"file format no supported");
                            dispose();
                            return;
                    }
                    String path = selectedFile.getPath();
                    try {
                        FileReader f1 = new FileReader(path);
                        while(true){
                           c=f1.read();
                           if(c==-1)
                             break;
                          Text+=(char)c;
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null,"file can't open");
                    }
                    finally{
                        dispose();
                    }
                }
                else if(result==JFileChooser.CANCEL_OPTION){
                    dispose();
                }
            }

    private String getExtension(String name) {
        int x=name.lastIndexOf('.');
        if(x>0){
            return name.substring(x);
        }
        return "";
    }
}
