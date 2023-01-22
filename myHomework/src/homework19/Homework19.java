package homework19;

/**
 * Java Prof. Homework #19
 *
 * @author Dzmitry Kryvialeu
 * @version 19.01 - 22.01
 */

import java.io.*;

public class Homework19 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.length());
        byteArrayStreamDemo();
        fileOutputStreamDemo();
        fileInputStreamDemo();
        fileWriterDemo();
        fileReaderDemo();
    }

    static void byteArrayStreamDemo() {
        byte[] buffer = {66, 67, 68};
        ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
        int x = 0;
        while((x = bais.read()) != -1){
            System.out.print(x + " ");
        }
    }

    static void fileOutputStreamDemo() {
        byte[] buffer = {66, 67, 68};
        try(FileOutputStream fos = new FileOutputStream("byte_file.bin")) {
            fos.write(buffer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    static void fileInputStreamDemo() {
        byte[] buffer = new byte[3];
        try(FileInputStream fis = new FileInputStream("byte_file.bin")) {
            fis.read(buffer);
        }catch (IOException e){
            e.printStackTrace();
        }
        for(byte b : buffer){
            System.out.println(b);
        }
    }

    static void fileWriterDemo() {
        try(FileWriter fw = new FileWriter("char_file.txt")){
            fw.write("Hello dudes!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    static void fileReaderDemo() {
        char[] buffer = new char[100];
        try(FileReader fr = new FileReader("char_file.txt")){
            fr.read(buffer);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(new String(buffer));
    }
}
