import java.io.*;
import java.net.*;

public class ServeurUDP {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(5000);

            byte[] data = new byte[1024];

            DatagramPacket packet =
                new DatagramPacket(data, data.length);

            socket.receive(packet);

            String message =
                new String(packet.getData(), 0, packet.getLength());

            System.out.println("Reçu : " + message);

            // Préparation de la réponse
            byte[] responseData = message.getBytes();

            DatagramPacket response =
                new DatagramPacket(
                    responseData,
                    responseData.length,
                    packet.getAddress(),
                    packet.getPort()
                );

            socket.send(response);

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
