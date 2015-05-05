//AUTHOR=====================================================================
//CAUP DORIAN B3B============================================================
//PACKAGE====================================================================
package UI;
//IMPORT===================================================================
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import Client.Client;
//===================================================================

public class Controller_Main implements ActionListener {
	private Client client;
	public Controller_Main(Client C){
		client = C;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton localBtn = (JButton)e.getSource();
		switch (localBtn.getText()){
		case "Join":
			break;
		case "Create":
			CreateWindow CW = new CreateWindow(client);
			CW.Lanceur(true);
			break;
		case "Refresh":
			client.Refresh_Pressed();
			break;
		case "Exit":
			client.Exit_Pressed();
			break;
		}
	}

}
