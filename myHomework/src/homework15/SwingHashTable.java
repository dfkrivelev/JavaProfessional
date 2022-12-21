package homework15;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.*;

public class SwingHashTable extends JFrame {
    private final int WIDTH_SIZE = 1024;
    private final int HEIGHT_SIZE = 600;
    private HashTable<String, String> table = new HashTable();

    public static void main(String[] args) {
        new SwingHashTable();
    }

    public SwingHashTable() {
        setTitle("HashTable");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setPreferredSize(new Dimension(WIDTH_SIZE, HEIGHT_SIZE));
        canvasPanel.setBackground(Color.lightGray);

        JTextField textField = new JTextField();
        JButton enterButton = new JButton("Enter");
        enterButton.addActionListener(e -> {
            // TODO
            String[] tokens = textField.getText().split((" "));
            if (tokens[0].equals("put")) {
                table.put(tokens[1], tokens[2]);
            }
            canvasPanel.repaint();
        });
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
        bottomPanel.add(textField);
        bottomPanel.add(enterButton);

        add(canvasPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class CanvasPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            HashTable<String, String>.Entry<String, String>[] t = table.getTable();
            for (int i = 0; i < t.length; i++) {
                int link = 0;
                int x = 10 + i * 70;
                int y = 20;
                int dx = 66;
                int dy = 66;
                if (t[i] != null) {
                    g.setColor(Color.CYAN);
                    g.fillRect(x, y, dx, dy);
                    g.setColor(Color.black);
                    g.drawString(String.format("%d %s", i, t[i].key), x + 5, y + 25);
                    g.drawString(t[i].value, x + 5, y + 40);
                    String next = (t[i].next == null) ? "n -> null" : "n -> " + t[i].next.key;
                    g.drawString(next, x + 5, y + 55);
                    HashTable<String, String>.Entry<String, String> pointer = t[i];
                    while (pointer.next != null) {
                        y = 20 + 65 + dy * link + 10 * (link - 1);
                        link++;
                        g.setColor(Color.CYAN);
                        g.fillRect(x, y, dx, dy);
                        g.setColor(Color.black);
                        g.drawString(String.format("%d %s", i, pointer.next.key), x + 5, y + 25);
                        g.drawString(pointer.next.value, x + 5, y + 40);
                        String next2 = (pointer.next.next == null) ? "n->null" : "n-> " + pointer.next.next.key;
                        g.drawString(next2, x + 5, y + 55);
                        pointer = pointer.next;
                    }
                } else {
                    g.setColor(Color.GRAY);
                    g.drawRect(x, y, dx, dy);
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(i), x + 5, y + 25);

                }
            }
        }
    }
}
