import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JList Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            // Create an array of items to display in the JList
            String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            // Create a JList with the array of items
            JList<String> itemList = new JList<>(items);

            // Create a JButton to get the selected item
            JButton getSelectedItemButton = new JButton("Get Selected Item");

            // Create a JLabel to display the selected item
            JLabel selectedItemLabel = new JLabel("Selected Item: ");

            // Add an ActionListener to the button to get the selected item
            getSelectedItemButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Get the selected item(s) from the JList
                    String selectedItems = String.join(", ", itemList.getSelectedValuesList());
                    selectedItemLabel.setText("Selected Item(s): " + selectedItems);
                    itemList.addListSelectionListener(new ListSelectionListener() {
                        @Override
                        public void valueChanged(ListSelectionEvent e) {
                        }
                    });
                }
            });

            JPanel panel = new JPanel(new FlowLayout());
            panel.add(new JScrollPane(itemList)); // Add a scroll pane for a long list
            panel.add(getSelectedItemButton);
            panel.add(selectedItemLabel);

            frame.getContentPane().add(panel);
            frame.setVisible(true);
        });
    }
}
