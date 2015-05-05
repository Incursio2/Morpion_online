package Client;

import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	private String Ip;
	private int Port;
	private Socket socket;
	private JSON_Communication JSON = new JSON_Communication();
	private PrintWriter out;
	//CONSTRUCTOR=====================================================================
	public Client(String ip, int port){
		Ip = ip;
		Port = port;
	}
	//ACTIONS
	public void Exit_Pressed(){
		JSON.Create_Request("Exit");
		Send_Message();
		try {
			socket.close();
		} catch (Exception e) {e.getMessage();}
	}
	public void Refresh_Pressed(){
		JSON.Create_Request("Refresh");
		Send_Message();
	}
	private void Send_Message(){
		try {
			out = new PrintWriter(socket.getOutputStream(), true);
			out.println(JSON.getJson());
		} catch (Exception e) {System.out.println(e.getMessage());}
	}
	//LAUCHER=====================================================================
	public void Launch(){
		try {
			socket = new Socket(Ip, Port);
		} catch (Exception e) { System.out.println(e.getMessage());}
	}
}
