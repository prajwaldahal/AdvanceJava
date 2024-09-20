import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame {
    MouseListenerExample(){
        JTextField textField= new JTextField(30);
        JTextField textField1=new JTextField(30);

        JTextField textField2=new JTextField(30);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                String value=textField.getText();
                String value2=textField1.getText();

                if(!(value.isEmpty() || value2.isEmpty())){
                    textField2.setText(String.valueOf(Integer.parseInt(value)+Integer.parseInt(value2)));
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                String value=textField.getText();
                String value2=textField1.getText();

                if(!(value.isEmpty() || value2.isEmpty())){
                    textField2.setText(String.valueOf(Integer.parseInt(value)-Integer.parseInt(value2)));
                }
            }
        });

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });


        setVisible(true);
        add(textField);
        add(textField1);
        add(textField2);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
