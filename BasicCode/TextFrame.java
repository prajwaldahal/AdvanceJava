import javax.swing.*;
public class TextFrame extends JFrame{
    public TextFrame(){
        add(new DrawTextComponent());
        setVisible(true);
        setSize(500,500);
    }

    public static void main(String[] args) {
        new TextFrame();
    }
}
