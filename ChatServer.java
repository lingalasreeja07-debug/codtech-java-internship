import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1234);
        System.out.println("Server started");

        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String msg;
        while ((msg = in.readLine()) != null) {
            System.out.println("Client: " + msg);
        }
    }
}