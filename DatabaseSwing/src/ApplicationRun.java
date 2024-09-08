/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.Component;
import javax.swing.JFrame;

/**
 *
 * @author prajwal
 */
public class ApplicationRun extends JFrame{

    public ApplicationRun() {
        View v= new View();
        Model m = new Model();
        Controller c =new Controller(m,v);
        getContentPane().add(v.getPn());
        setVisible(true);
        setSize(400,400);
    }
    public static void main(String[] args) {
        new ApplicationRun();
    }
}
