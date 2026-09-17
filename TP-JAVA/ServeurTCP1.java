import java.io.*;
import java.net.*;

public class ServeurTCP1 {
    public static void main(String[] args) {

        try {
            ServerSocket socketserver =
                new ServerSocket(5000);

            Socket socket =
                socketserver.accept();

            DataInputStream dIn =
                new DataInputStream(socket.getInputStream());

            String message = dIn.readUTF();

            System.out.println("Message reçu : " + message);

            dIn.close();
            socket.close();
            socketserver.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
