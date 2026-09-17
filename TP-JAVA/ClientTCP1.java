import java.io.*;
import java.net.*;

public class ClientTCP1 {
    public static void main(String[] args) {

        try {
            Socket socket =
                new Socket("localhost", 5000);

            DataOutputStream dOut =
                new DataOutputStream(socket.getOutputStream());

            dOut.writeUTF("Hello World");

            dOut.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
