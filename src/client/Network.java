package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Network {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 8080;

    private final String host;
    private final int port;

    private DataOutputStream dataOutputStream;
    private DataInputStream dataInputStream;

    private Socket socket;

    public Network() {
        this(SERVER_ADDRESS, SERVER_PORT);
    }

    public Network(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public DataOutputStream getDataOutputStream() {
        return dataOutputStream;
    }

    public DataInputStream getDataInputStream() {
        return dataInputStream;
    }

    public boolean connect(){
        try {
            socket = new Socket("localhost", 8080);
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            return true;
        } catch (IOException e) {
            System.out.println("Connection was not set up");
            e.printStackTrace();
            return false;
        }
    }



    public void close() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void waitMessage(ViewController viewController) {

        Thread thread = new Thread(() -> {
           try {
               while (true) {
                   String message = dataInputStream.readUTF();
                   viewController.appendMessage(message);
               }
           } catch (IOException e){
               e.printStackTrace();
               System.out.println("Connection is lost");
           }
        });
        thread.setDaemon(true);
        thread.start();
    }
}
