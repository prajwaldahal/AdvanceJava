import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends JFrame {
    public KeyListenerExample(){
        JTextField jt = new JTextField(30);
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        });
        jt.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                jt.setText(e.getKeyChar()+" "+e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        add(jt);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
