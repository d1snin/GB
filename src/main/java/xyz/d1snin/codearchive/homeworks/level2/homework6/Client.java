package xyz.d1snin.codearchive.homeworks.level2.homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static Socket socket;
    private static DataInputStream input;
    private static DataOutputStream output;
    private static final String IP = "localhost";
    private static final int PORT = 8188;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            socket = new Socket(IP, PORT);
            System.out.println(" - Successfully connected to the server: " + socket.getRemoteSocketAddress());
            input = new DataInputStream(socket.getInputStream());
            output = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                try {
                    while (true) {
                        String str = input.readUTF();
                        System.out.println(" - Server: " + str);
                    }
                }catch (IOException e){
                    e.printStackTrace();
                } finally {
                    try {
                        socket.close();
                        input.close();
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrase();
                    }
                }
            }).start();
            while (true) {
                String str = scanner.nextLine();
                if (str.isEmpty()) continue;
                output.writeUTF(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
    }
}
