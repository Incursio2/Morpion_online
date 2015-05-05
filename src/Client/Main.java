package Client;
import javax.swing.JOptionPane;

import UI.MainWindow;


public class Main {

	public static void main(String[] args) {
		MainWindow w = new MainWindow();
		w.Lanceur(true);
	}
	
	static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
