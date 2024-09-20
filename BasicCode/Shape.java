import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Shape extends JPanel {
    Graphics2D graphics2D;
    public Shape()
    {
        setVisible(true);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        graphics2D = (Graphics2D) g;

        Rectangle2D rectangle2D= new Rectangle2D.Double(100.0,100.0,100.0,100);
        graphics2D.draw(rectangle2D);

        Ellipse2D ellipse2D=new Ellipse2D.Double(100.0,100.0,300.0,150.0);
        graphics2D.draw(ellipse2D);
    }

    public static void main(String[] args) {
        JFrame jFrame=new JFrame("shape");
        jFrame.add(new Shape());
        jFrame.setVisible(true);
    }
}
