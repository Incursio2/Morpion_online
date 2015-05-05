package UI;
//===============================================
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import Client.ThreadWin;
//===============================================

@SuppressWarnings("serial")
public class MorpionJPanel extends JPanel implements ActionListener {
	private int nbr_O = 0;
	private ArrayList<JButton> All_Btn;
	public MorpionJPanel(){
		Init();
		Init_Btn();		
		new Thread(new ThreadWin(this)).start();
	}
	
	public void Lanceur(boolean b){
		setVisible(b);
	}
	
	private void Init(){
		setLayout(new GridLayout(3,3,5,5));
	}
	
	private void Init_Btn(){
		All_Btn = new ArrayList<JButton>();
		for (int i = 0; i < 9; i++){
			All_Btn.add(new JButton("X"));			
		}			
		for (JButton b : All_Btn){
			b.addActionListener(this);
			add(b);
		}
	}
	
	public int Get_nbr_O(){
		return nbr_O;
	}

	public void actionPerformed(ActionEvent e) {
		JButton localBtn = (JButton)e.getSource();
		if (localBtn.getText() == "X"){
			localBtn.setText("O");
			nbr_O++;
		} else {
			localBtn.setText("X");
			nbr_O--;
		}				
	}
}
