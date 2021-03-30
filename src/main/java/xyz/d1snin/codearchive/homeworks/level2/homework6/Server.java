package xyz.d1snin.codearchive.homeworks.level2.homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private static ServerSocket server;
    private static Socket socket;
    private static DataInputStream input;
    private static DataOutputStream output;
    private static int PORT = 8188;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        try {
            server = new ServerSocket(PORT);
            System.out.println(" - Server has started up! Listening on port: " + server.getLocalPort());
            socket = server.accept();
            System.out.println(" - Client connected!");
            input = new DataInputStream(socket.getInputStream());
            output = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                try {
                    while (true) {
                        String str = input.readUTF();
                        System.out.println(" - Client: " + str);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        socket.close();
                        server.close();
                        input.close();
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
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
}