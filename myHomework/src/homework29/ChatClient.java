package homework29;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static homework29.ChatServer.*;

public class ChatClient {
    public static void main(String[] args) {
        new ChatClient();
    }

    public ChatClient() {
        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
             PrintWriter writer = new PrintWriter(socket.getOutputStream());
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("Connection to server...");
            new Thread(new CommandHandler(writer)).start();
            String message;
            do {
                message = reader.readLine();
                System.out.println(message);
            } while (!message.equalsIgnoreCase(EXIT_CMD));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Connection closed.");
    }

    private class CommandHandler implements Runnable {
        private PrintWriter writer;
        private Scanner scanner;

        public CommandHandler(PrintWriter writer) {
            this.writer = writer;
            this.scanner = new Scanner(System.in);
        }

        @Override
        public void run() {
            String message;
            do {
                message = scanner.nextLine();
                writer.println(message);
                writer.flush();
            } while (!message.equals("exit"));
        }
    }
}
