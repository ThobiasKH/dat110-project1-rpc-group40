package no.hvl.dat110.rpc;

import java.nio.ByteBuffer;
import java.util.Arrays;
import no.hvl.dat110.TODO;

public class RPCUtils {
	
	public static byte[] encapsulate(byte rpcid, byte[] payload) {
		
		byte[] rpcmsg = null;
		
		// TODO - START
		
		// Encapsulate the rpcid and payload in a byte array according to the RPC message syntax / format
		
		// if (true)
		//	throw new UnsupportedOperationException(TODO.method());
		rpcmsg = new byte[1 + payload.length];
        rpcmsg[0] = rpcid;
        System.arraycopy(payload, 0, rpcmsg, 1, payload.length);
		// TODO - END
		
		return rpcmsg;
	}
	
	public static byte[] decapsulate(byte[] rpcmsg) {
		
		byte[] payload = null;
		
		// TODO - START
		
		// Decapsulate the rpcid and payload in a byte array according to the RPC message syntax
		
		// if (true)
		//	throw new UnsupportedOperationException(TODO.method());
        payload = new byte[rpcmsg.length - 1];
        System.arraycopy(rpcmsg, 1, payload, 0, rpcmsg.length - 1);
		
		// TODO - END
		
		return payload;
		
	}

	// convert String to byte array
	public static byte[] marshallString(String str) {
		
		byte[] encoded = null;
		
		// TODO - START 
		
		// if (true)
		//	throw new UnsupportedOperationException(TODO.method());
        encoded = str.getBytes();
		
		// TODO - END
		
		return encoded;
	}

	// convert byte array to a String
	public static String unmarshallString(byte[] data) {
		
		String decoded = null; 
		
		// TODO - START 
		
		// if (true)
		//	throw new UnsupportedOperationException(TODO.method());
		
        decoded = new String(data);

		// TODO - END
		
		return decoded;
	}
	
	public static byte[] marshallVoid() {
		
		byte[] encoded = null;
		
		// TODO - START 
		
		// if (true)
		//	throw new UnsupportedOperationException(TODO.method());
		
        encoded = new byte[0];
		// TODO - END
		
		return encoded;
		
	}
	
	public static void unmarshallVoid(byte[] data) {
		
		// TODO
		
		//if (true)
		//	throw new UnsupportedOperationException(TODO.method());
		
	}

	// convert boolean to a byte array representation
	public static byte[] marshallBoolean(boolean b) {
		
		byte[] encoded = new byte[1];
				
		if (b) {
			encoded[0] = 1;
		} else
		{
			encoded[0] = 0;
		}
		
		return encoded;
	}

	// convert byte array to a boolean representation
	public static boolean unmarshallBoolean(byte[] data) {
		
		return (data[0] > 0);
		
	}

	// integer to byte array representation
	public static byte[] marshallInteger(int x) {
		
		byte[] encoded = null;
		
		// TODO - START 
		
		// if (true)
		//	throw new UnsupportedOperationException(TODO.method());
        
        ByteBuffer buf = ByteBuffer.allocate(4);
        buf.putInt(x);
        encoded = buf.array();
		
		// TODO - END
		
		return encoded;
	}
	
	// byte array representation to integer
	public static int unmarshallInteger(byte[] data) {
		
		int decoded = 0;
		
		// TODO - START 
		
		// if (true)
		//	throw new UnsupportedOperationException(TODO.method());
        
        ByteBuffer buf = ByteBuffer.wrap(data);
        decoded = buf.getInt();
		
		// TODO - END
		
		return decoded;
		
	}
}
