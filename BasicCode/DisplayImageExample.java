import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class DisplayImageExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image Display Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            URL imageURL = DisplayImageExample.class.getResource("/image.png"); // Make sure the image is in the same folder as your class

            if (imageURL != null) {
                ImageIcon imageIcon = new ImageIcon(imageURL);

                JLabel imageLabel = new JLabel(imageIcon);

                frame.getContentPane().add(imageLabel);
                frame.pack();
                frame.setVisible(true);
            } else {
                System.err.println("Image not found.");
            }
        });
    }
}
