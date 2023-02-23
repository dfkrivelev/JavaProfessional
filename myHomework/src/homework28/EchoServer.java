package homework28;

/**
 * Java Prof. Homework #27
 *
 * @author Dzmitry Kryvialeu
 * @version 16.02 - 18.02
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        new EchoServer();
    }

    public EchoServer() {
        try (ServerSocket server = new ServerSocket(2048)) {
            System.out.println("Server started...");
            while (true) {
                Socket socket = server.accept();
                System.out.println("client connected...");
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String message;
                do {
                    message = reader.readLine();
                    System.out.println("Client say: " + message);
                    writer.println("Echo " + message);
                    writer.flush();
                } while (!message.equals("exit"));
                reader.close();
                writer.close();
                System.out.println("client disconnect.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
