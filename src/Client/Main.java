package Client;
import javax.swing.JOptionPane;

import UI.MainWindow;


public class Main {

	public static void main(String[] args) {
		Client C = new Client("localhost",1237);
		C.Launch();	
		MainWindow w = new MainWindow(C);
		w.Lanceur(true);
	}
	
	static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
