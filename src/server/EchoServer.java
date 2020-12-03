package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static final int SERVER_PORT = 8080;

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(SERVER_PORT);){
            System.out.println("Waiting for server connection...");
            Socket clientSocket= serverSocket.accept();
            System.out.println("Connected to Server");

            DataInputStream in= new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            Thread inputThread = null;
            inputThread = runInputThread(in);
            runOutputThread(out);
            System.out.println("Server has stopped running");
        } catch (IOException e) {
            System.out.println("Port is already in use");
            e.printStackTrace();
        }
    }

    private static void runOutputThread(DataOutputStream out) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String message = scanner.next();
            out.writeUTF(message);
            if(message.equals("/end")){
                break;
            }
        }
    }

    private static Thread runInputThread(DataInputStream in) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    String message = in.readUTF();
                    System.out.println("Message: " + message);
                    if (message.equals("/exit")) {
                        break;
                    }
                } catch (IOException e) {
                    System.out.println("Connection was closed");
                    break;
                }
            }
            });
        thread.start();
        return thread;
    }
}