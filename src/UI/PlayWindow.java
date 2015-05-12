package UI;
//===============================================
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//===============================================
@SuppressWarnings("serial")
public class PlayWindow extends JFrame {
	private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	private Container container = getContentPane();
	private MorpionJPanel PC;
	private JTextArea TAinfo;
	private JButton Bquit;
	private JScrollPane SPinfo;
	public PlayWindow(){
		Init_Size();
		Init_Position();
		Init_Other();
		Init_PanelCase();
	}
	
	public void Lanceur(boolean b){
		setVisible(b);
	}
	
	private void Init_PanelCase(){
		setContentPane(container);
		TAinfo = new JTextArea(3,20);
		SPinfo = new JScrollPane(TAinfo);
		TAinfo.setEditable(false);
		Bquit = new JButton("quit");
		PC = new MorpionJPanel();
		PC.Lanceur(true);
		container.add(PC,BorderLayout.CENTER);
		container.add(Bquit, BorderLayout.SOUTH);
		container.add(SPinfo, BorderLayout.NORTH);
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
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
