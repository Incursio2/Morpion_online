package UI;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainWindow extends JFrame{
	private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	private MorpionJPanel PC;
	public MainWindow(){
		Init_Size();
		Init_Position();
		Init_Other();
		Init_PanelCase();
	}
	
	public void Lanceur(boolean b){
		setVisible(b);
	}
	
	private void Init_PanelCase(){
		PC = new MorpionJPanel();
		PC.Lanceur(true);
		add(PC);
	}
	
	private void Init_Size(){
		d.width /= 4;
		d.height /= 4;
		setSize(d);
		setPreferredSize(d);
	}
	
	private void Init_Position(){
		setLocation(new Point(d.width, d.height));
	}
	
	private void Init_Other(){
		setName("Morpion");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
