package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Client.Client;

public class Controller_Create implements ActionListener {
	private Client client;
	private CreateWindow createWindow;
	public Controller_Create(Client C, CreateWindow CW){
		client = C;
		createWindow = CW;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton localBtn = (JButton)e.getSource();
		switch (localBtn.getText()){
		case "Create":
			String name = createWindow.getTFname().getText();
			char[] password = createWindow.getPFpassword().getPassword();
			break;
		case "Cancel":
			createWindow.setVisible(false);
			createWindow.dispose();
			break;
		}
	}

}
