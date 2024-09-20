import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class DrawVerticalHalfCircleExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        int centerX = getWidth() / 2; // X-coordinate of the center
        int centerY = getHeight() / 2; // Y-coordinate of the center
        int radius = 50; // Radius of the half-circle
        int startAngle = 90; // Starting angle (90 degrees for a vertically oriented half-circle)
        int extentAngle = 270; // Extent angle (180 degrees for a half-circle)

        // Create an Arc2D object representing a vertically oriented half-circle
        Arc2D verticalHalfCircle = new Arc2D.Double(centerX - radius, centerY - radius, 2 * radius, 2 * radius, startAngle, extentAngle, Arc2D.CHORD);

        // Set the color for drawing the half-circle
        g2d.setColor(Color.BLUE);

        // Fill the vertically oriented half-circle
        g2d.fill(verticalHalfCircle);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Draw Vertical Half-Circle Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new DrawVerticalHalfCircleExample());
            frame.setPreferredSize(new Dimension(200, 400));
            frame.pack();
            frame.setVisible(true);
        });
    }
}
