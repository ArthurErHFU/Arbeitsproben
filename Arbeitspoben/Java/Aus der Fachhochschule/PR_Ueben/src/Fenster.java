import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Fenster extends JFrame implements ActionListener, MouseListener{
	//Label
	private JLabel lb_1 = new JLabel("Ferienwohnungen Willberger");
	private JLabel lb_2 = new JLabel("Anreise:");
	private JLabel lb_3 = new JLabel("Tag");
	private JLabel lb_4 = new JLabel("Monat");
	private JLabel lb_5 = new JLabel("Jahr");
	private JLabel lb_6 = new JLabel("Abreise: ");
	private JLabel lb_7 = new JLabel("Tag");
	private JLabel lb_8 = new JLabel("Monat");
	private JLabel lb_9 = new JLabel("Jahr");
	private JLabel lb_10 = new JLabel("Anzahl der Personen: ");

	//Textfelder
	private JTextField tf_1 = new JTextField ("dd");
	private JTextField tf_2 = new JTextField ("mm");
	private JTextField tf_3 = new JTextField ("yyyy");
	private JTextField tf_4 = new JTextField ("dd");
	private JTextField tf_5 = new JTextField ("mm");
	private JTextField tf_6 = new JTextField ("yyyy");
	
	/*Combobox und deren Listen
	Die Liste kann der Combobox beim Konstruktoraufruf mitgegeben werden*/
	private String[] comboBoxListe_1 = {"1", "2", "3", "4", "5","6", "7", "8", "9"};		
	private JComboBox comboBox_1 = new JComboBox(comboBoxListe_1);
	
//	Color
	private Color darkBlue = new Color(40,90,100);
	private Color blue = new Color(102,204,204);
	
	//Panels
	private Panel pnl_1 = new Panel();
	private Panel pnl_2 = new Panel();
	private Panel pnl_3 = new Panel();	
	private Panel pnl_4 = new Panel();	
	private Panel pnl_5 = new Panel();
	private Panel pnl_6 = new Panel();
	
	//Abmaße Textfelder
	private Dimension dim_1 = new Dimension(25,25);
	private Dimension dim_2 = new Dimension(40,25);
	
//	Abmaße Fenster
	private Dimension dim_f = new Dimension(430,250);
	
	private GridLayout grid= new GridLayout(3,1);
	private BorderLayout bord = new BorderLayout();
	private FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 15, 7);
	
//	Fonts
	Font calibriTitel = new Font("Calibri",Font.PLAIN, 18);
	Font calibriText = new Font("Calibri",Font.BOLD, 15);
	Font calibirButton = new Font("Calibri",Font.BOLD, 15);
	
	//Button
	private JButton btn = new JButton("Anfrage senden");
		
	
	//Bild - Ein Bildlabel kann wie ein herkömmliches Label benutzt werden.
	private Icon bild = new ImageIcon("huette_mit_teich.jpg");
	private JLabel bildLabel = new JLabel(bild);
	
	//Konstruktor
	public Fenster(){
//		Layout,Label und weiteres für das Frame
		this.setTitle("Willbergers Verwaltungssoftware");
		this.setSize(dim_f);
		this.setLayout(bord);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	
//		Panel 1
		pnl_1.add(bildLabel);
		lb_1.setFont(calibriTitel);
		lb_1.setForeground(Color.WHITE);
		pnl_1.add(lb_1);
		pnl_1.setBackground(darkBlue);
		
//		Panel 3
		lb_2.setFont(calibriText);
		pnl_3.add(lb_2);
		lb_3.setFont(calibriText);
		pnl_3.add(lb_3);
		
		tf_1.addMouseListener(this); 
		tf_1.setPreferredSize(dim_1);
		pnl_3.add(tf_1);
		
		lb_4.setFont(calibriText);
		pnl_3.add(lb_4);
		tf_2.setPreferredSize(dim_1);
		pnl_3.add(tf_2);
		
		lb_5.setFont(calibriText);
		pnl_3.add(lb_5);
		tf_3.setPreferredSize(dim_2);
		pnl_3.add(tf_3);
		pnl_3.setLayout(flow);
		
//		Panel 4
		lb_6.setFont(calibriText);
		pnl_4.add(lb_6);
		lb_7.setFont(calibriText);
		pnl_4.add(lb_7);
		
		tf_4.setPreferredSize(dim_1);
		pnl_4.add(tf_4);
		
		lb_8.setFont(calibriText);
		pnl_4.add(lb_8);
		tf_5.setPreferredSize(dim_1);
		pnl_4.add(tf_5);
		
		lb_9.setFont(calibriText);
		pnl_4.add(lb_9);
		tf_6.setPreferredSize(dim_2);
		pnl_4.add(tf_6);
		pnl_4.setLayout(flow);

		
//		Panel 5
		lb_10.setFont(calibriText);
		pnl_5.add(lb_10);
		pnl_5.add(comboBox_1);
		pnl_5.setLayout(flow);
		
		
//		Panel 6
		btn.setFont(calibirButton);
		btn.addActionListener(this);
		pnl_6.add(btn);
		pnl_6.setBackground(darkBlue);
		
//		Panel 3-5 werden dem Panel 2 zugewiesen
		pnl_2.setLayout(grid);
		pnl_2.add(pnl_3);
		pnl_2.add(pnl_4);
		pnl_2.add(pnl_5);
		pnl_2.setBackground(blue);
		
//		Panel 1 bis dem Frame hinzufügen
		this.add(pnl_1, BorderLayout.NORTH);
		this.add(pnl_2, BorderLayout.CENTER);
		this.add(pnl_6, BorderLayout.SOUTH);
												
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			System.out.println("Buchung eingegangen!");
			System.out.println("Anreiße: " + tf_1.getText() + "." + tf_2.getText() + "." + tf_3.getText());
			System.out.println("Abreiße: " + tf_4.getText() + "." + tf_5.getText() + "." + tf_6.getText());
			System.out.println("Mit " + comboBox_1.getSelectedItem() + " Presonen");
		}
	}
	public void mouseEntered(MouseEvent  m) {
		if(m.getComponent() == tf_1) {
			System.out.println("TEST");
		}
	}
	public void mouseExited(MouseEvent m) {
		
	}
	public void mouseClicked(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent m) {
		// TODO Auto-generated method stub		
	}
	public void mouseReleased(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}
} 
