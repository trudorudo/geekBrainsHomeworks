package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static final int SERVER_PORT = 8080;

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(SERVER_PORT);){
            System.out.println("Waiting for server connection...");
            Socket clientSocket= serverSocket.accept();
            System.out.println("Connected to Server");

            DataInputStream in= new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            while(true){
                String message = in.readUTF();
                System.out.println("Message: " + message);
                if(message.equals("/exit")){
                    break;
                }
                out.writeUTF("Server response" + message.toUpperCase());
            }
            System.out.println("Server has stopped running");
        } catch (IOException e) {
            System.out.println("Port is already in use");
            e.printStackTrace();
        }
    }
}
