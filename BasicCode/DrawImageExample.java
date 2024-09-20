import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DrawImageExample extends JPanel {
    private BufferedImage image;

    public DrawImageExample() {
        try {
            // Load the image using a relative path
            image = ImageIO.read(getClass().getResource("image.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the image on the panel
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Draw Image Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new DrawImageExample());
            frame.setPreferredSize(new Dimension(400, 300));
            frame.pack();
            frame.setVisible(true);
        });
    }
}
