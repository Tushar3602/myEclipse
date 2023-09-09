import java.util.*;

public class SlidingWindowProtocol {

    private static final int WINDOW_SIZE = 5;

    public static void main(String[] args) {
        // Data to be transmitted
        String data = "Hello, World!";

        // Split the data into packets
        List<String> packets = splitDataIntoPackets(data);

        // Initialize the window
        int base = 0;
        int nextSeqNum = 0;
        int windowEnd = base + WINDOW_SIZE - 1;

        // Loop until all packets have been transmitted
        while (base < packets.size()) {
            // Transmit packets up to the window end
            for (int i = base; i <= windowEnd && i < packets.size(); i++) {
                sendPacket(packets.get(i), nextSeqNum++);
            }

            // Wait for an ACK
            int ack = receiveAck();

            // If the ACK is for the first packet in the window, move the window
            if (ack == base) {
                base++;
                windowEnd++;
            }
        }
    }

    // Split the data into packets
    private static List<String> splitDataIntoPackets(String data) {
        List<String> packets = new ArrayList<>();
        int offset = 0;
        while (offset < data.length()) {
            packets.add(data.substring(offset, Math.min(offset + WINDOW_SIZE, data.length())));
            offset += WINDOW_SIZE;
        }
        return packets;
    }

    // Simulate sending a packet with a sequence number
    private static void sendPacket(String packet, int seqNum) {
        System.out.println("Sending packet: " + packet + ", seqNum: " + seqNum);
    }

    // Simulate receiving an ACK
    private static int receiveAck() {
        Random random = new Random();
        return random.nextInt(2) == 0 ? -1 : (int) (Math.random() * WINDOW_SIZE);
    }
}
