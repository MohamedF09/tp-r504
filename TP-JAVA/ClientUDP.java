import java.io.*;
import java.net.*;

public class ClientUDP {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();

            InetAddress adresse = InetAddress.getByName("localhost");

            String s = "Hello World";
            byte[] data = s.getBytes();

            DatagramPacket packet =
                new DatagramPacket(data, data.length, adresse, 5000);

            socket.send(packet);

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
