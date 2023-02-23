package homework28;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        new EchoClient();
    }

    public EchoClient() {
        String message = null;
        try (Socket socket = new Socket("localhost", 2048);
             PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("Connection to server...");
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("# ");
                message = scanner.nextLine();
                writer.println(message);
                writer.flush();
                System.out.println(reader.readLine());
            } while (!message.equals("exit"));
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
