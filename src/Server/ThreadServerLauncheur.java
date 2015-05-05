package Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import org.json.JSONObject;

public class ThreadServerLauncheur implements Runnable {
	
	private Server sl;
	private BufferedReader in;
	private PrintWriter out;
	private String commande;
	private JSON_Communication JSON = new JSON_Communication();
	public ThreadServerLauncheur(Server SL) {
		sl = SL;
	}
	
	@Override
	public void run() {	
		try {
			in = new BufferedReader(new InputStreamReader(sl.getSocket().getInputStream()));
			out = new PrintWriter(sl.getSocket().getOutputStream(), true);
			while(true){
				JSONObject JSON = new JSONObject(in.readLine());
				commande = (String)JSON.get("Command");
				switch (commande){
				case "Refresh":
					break;
				case "Informations":
					break;
				case "Exit":
					in.close();
					sl.getSocket().close();
					sl.getServer().close();
					break;			
				}
			} 
		} catch (Exception e) { e.getMessage(); }
	}
}
