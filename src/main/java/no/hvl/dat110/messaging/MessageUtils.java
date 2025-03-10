package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = null;
		byte[] data;
		
		// TODO - START
		
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer
        data = message.getData();
        segment = new byte[128];
        segment[0] = (byte) data.length;
        System.arraycopy(data, 0, segment, 1, data.length);
		
		//if (true)
			// throw new UnsupportedOperationException(TODO.method());
			
		// TODO - END
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		
		// TODO - START
		// decapsulate segment and put received payload data into a message
		
		// if (true)
		//	throw new UnsupportedOperationException(TODO.method());
        
        if (segment == null || segment.length != 128) {
            throw new IllegalArgumentException("MessageUtils.java | Invalid segment");
        }
        int length = Byte.toUnsignedInt(segment[0]);
        byte[] data = new byte[length];
        System.arraycopy(segment, 1, data, 0, length);
        message = new Message(data);
		
		// TODO - END
		
		return message;
		
	}
	
}
