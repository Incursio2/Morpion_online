package UI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class MainWindow extends JFrame{
	private Container container = getContentPane();
	private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	private Dimension sizeD = new Dimension();
	private JButton join, refresh, creat;
	private JTextArea roomSelection;
	private JPanel southPanel;
	//private JPanel centerPanel;
	private GridLayout southGridLayout;
	public MainWindow(){
		Init_Size();
		Init_Position();
		Init_Panels();
		Init_Components();
		Init_Other();
	}
	
	public void Lanceur(boolean b){
		setVisible(b);
	}
	
	private void Init_Size(){		
		sizeD.width = d.width / 3;
		sizeD.height = d.height / 2;
		setSize(sizeD);
		setPreferredSize(sizeD);
	}
	
	private void Init_Panels(){
		setContentPane(container);
		southGridLayout = new GridLayout(1,3,0,0);
		southPanel = new JPanel(southGridLayout);
		container.add(southPanel, BorderLayout.SOUTH);
	}
	
	private void Init_Components(){
		join = new JButton("Join");
		//join.addKeyListener(l);
		refresh = new JButton("Refresh");
		//refresh.addKeyListener(l);
		creat = new JButton("Creat");
		//creat.addKeyListener(l);
		roomSelection = new JTextArea();
		southPanel.add(join);
		southPanel.add(refresh);
		southPanel.add(creat);
		container.add(roomSelection, BorderLayout.CENTER);
	}
	
	private void Init_Position(){
		setLocation(new Point(d.width / 2 - sizeD.width / 2, d.height / 2 - sizeD.height / 2));
	}
	
	private void Init_Other(){
		setName("Morpion Online");
		setTitle("Morpion Online");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
