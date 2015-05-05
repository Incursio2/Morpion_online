package UI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Client.Client;

@SuppressWarnings("serial")
public class CreateWindow extends JFrame{

	private Container container = getContentPane();
	private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	private Dimension sizeD = new Dimension();
	private JLabel Lname, Lpassword;
	public JTextField getTFname() {
		return TFname;
	}

	public JPasswordField getPFpassword() {
		return PFpassword;
	}

	private JTextField TFname;
	private JPasswordField PFpassword;
	private JButton Bcreate, Bcancel;
	private JPanel centerPanel;
	private GridLayout centerGridLayout;
	private Controller_Create ActionController;
	
	public CreateWindow(Client C){
		ActionController = new Controller_Create(C, this);
		Init_Size();
		Init_Position();
		Init_Other();
		Init_Panels();
	}
	
	public void Lanceur(boolean b){
		setVisible(b);
	}
	
	
	private void Init_Size(){
		sizeD.width = d.width /= 4;
		sizeD.height = d.height /= 4;
		setSize(d);
		setPreferredSize(d);
	}
	
	private void Init_Position(){
		setLocation(new Point(d.width, d.height));
	}
	
	private void Init_Other(){
		setName("Create a new game");
		setTitle("Create a new game");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	private void Init_Panels(){
		setContentPane(container);
		
		centerGridLayout = new GridLayout(3,2,0,0);
		centerPanel = new JPanel(centerGridLayout);
		Lname = new JLabel("Name");
		TFname = new JTextField();
		Lpassword = new JLabel("Password");
		PFpassword = new JPasswordField();
		Bcreate = new JButton("Create");
		Bcreate.addActionListener(ActionController);
		Bcancel = new JButton("Cancel");
		Bcancel.addActionListener(ActionController);
		
		centerPanel.add(Lname);
		centerPanel.add(TFname);
		centerPanel.add(Lpassword);
		centerPanel.add(PFpassword);
		centerPanel.add(Bcreate);
		centerPanel.add(Bcancel);
		container.add(centerPanel, BorderLayout.CENTER);
	}
}
