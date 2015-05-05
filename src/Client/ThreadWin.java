package Client;
//===============================================
import UI.MorpionJPanel;
//===============================================
public class ThreadWin implements Runnable {
	MorpionJPanel PanCase;
	public ThreadWin(MorpionJPanel panCase) {
		PanCase = panCase;
	}
	
	public void run() {
		while(true){
			try {
				Thread.sleep(500);
				if (PanCase.Get_nbr_O() ==3) {
					Main.infoBox("Vous avez gagné !", "Victoire");
					System.exit(0);
				}
					
			} catch (InterruptedException e) {e.printStackTrace();}
			
		}
	}
	

}
