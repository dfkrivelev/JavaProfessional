package homework28;

/**
 * Java Prof. Homework #28
 *
 * @author Dzmitry Kryvialeu
 * @version 20.02 - 23.02
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class SwingClient extends JFrame {

    JTextField message;
    JTextArea dialogue;
    JButton connect;

    PrintWriter writer;
    BufferedReader reader;

    public static void main(String[] args) {
        new SwingClient();
    }

    public SwingClient() {
        setTitle("Client for network chat");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                if (writer != null) {
                    writer.println("exit");
                    writer.flush();
                }
            }
        });

        dialogue = new JTextArea();
        dialogue.setLineWrap(true);
        dialogue.setEditable(false);
        JScrollPane scroll = new JScrollPane(dialogue);

        message = new JTextField();
        connect = new JButton("Connect");
        JButton send = new JButton("Send");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(message);
        panel.add(send);

        send.addActionListener(e -> {
            try {
                writer.println(message.getText());
                writer.flush();
                String echo;

                echo = reader.readLine();

                dialogue.append(echo + "\n");
                message.setText(null);
                if (echo.equals("exit")) {
                    connect.setEnabled(true);
                }
            } catch (SocketException ex) {
                System.out.println("Connection to server lost");
                connect.setEnabled(true);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        });

        add(BorderLayout.CENTER, scroll);
        add(BorderLayout.SOUTH, panel);
        setVisible(true);

        connect();
    }

    private void connect() {
        try {
            Socket socket = new Socket("localhost", 2048);
            writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Connection to server...");
            connect.setEnabled(false);
        } catch (IOException e) {
            System.out.println("Can't connect to server");
        }
    }
}
