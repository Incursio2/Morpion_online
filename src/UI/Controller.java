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

public class Controller implements ActionListener {
	private Client client;
	public Controller(Client C){
		client = C;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton localBtn = (JButton)e.getSource();
		switch (localBtn.getText()){
		case "Join":
			break;
		case "Creat":
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
