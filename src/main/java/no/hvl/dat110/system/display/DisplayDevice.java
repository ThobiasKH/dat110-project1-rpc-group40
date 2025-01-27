package no.hvl.dat110.system.display;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.RPCServer;
import no.hvl.dat110.system.controller.Common;


public class DisplayDevice {
	
	public static void main(String[] args) {
		
		System.out.println("Display server starting ...");
		
		// TODO - START
		// implement the operation of the display RPC server
		// see how this is done for the sensor RPC server in SensorDevice
				
//		if (true)
//			throw new UnsupportedOperationException(TODO.method());
        
        RPCServer displayServer = new RPCServer(Common.DISPLAYPORT);
        DisplayImpl displayImpl = new DisplayImpl((byte) Common.WRITE_RPCID, displayServer); 
        displayServer.run();
        
        //try {
          //  displayServer.join();
        //}
        //catch (InterruptedException e) {
          //  e.printStackTrace();
        //}
        displayServer.stop();
		
		// TODO - END
		
		System.out.println("Display server stopping ...");
		
	}
}
