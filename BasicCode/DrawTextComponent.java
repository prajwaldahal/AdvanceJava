import javax.swing.*;
import java.awt.*;

public class DrawTextComponent extends JComponent{
    public DrawTextComponent(){

    }
    public void paintComponent(Graphics g){
        Font sansbold14 = new Font("SansSerif", Font.BOLD, 14);
        Graphics2D graphics2D= (Graphics2D) g;
        graphics2D.setPaint(Color.RED);
        graphics2D.setFont(sansbold14);
        graphics2D.drawString("Warning!", 100, 100);
        super.paintComponent(g);
    }
}