//AUTHOR=====================================================================
//CAUP DORIAN B3B============================================================
//PACKAGE====================================================================
package Server;
//IMPORT====================================================================
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private int Port;
	private ServerSocket server;
	private Socket socket;
	
	//CONSTRUCTOR====================================================================
	public Server(int port){
		Port = port;
	}
	
	//LAUNCHER====================================================================
	public void Launch(){
		try{
			while(true){
				server = new ServerSocket(Port);
				socket = server.accept();			
				new Thread(new ThreadServerLauncheur(this)).start();
			}
		} catch(Exception e){ System.out.println(e.getMessage()); }
	}
	
	//Get/Set====================================================================
	public ServerSocket getServer() {
		return server;
	}

	public Socket getSocket() {
		return socket;
	}

}
