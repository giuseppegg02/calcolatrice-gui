/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_project extends JFrame {

	
	private JButton sette ;
	private JButton quatro;
	private JButton nove;
	private JButton diviso;
	private JButton per;
	private JButton meno;
	private JButton piuu;
	private JButton uguale;
	private JButton uno;
	private JButton zero;
	private JButton due;
	private JButton cinque;
	private JButton otto;
	private JButton tre;
	private JButton sei;
	private JLabel testo;

	//Constructor 
	public GUI_project(){

		this.setTitle("CALCOLATRICE");
		this.setSize(532,325);
		//menu generate method
	
		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(532,325));
		//contentPane.setBackground(new Color(160,160,160));

												//addActionListener(segno)
		sette = new JButton();
		sette.setBounds(40,100,90,35);
		sette.setBackground(new Color(214,217,223));
		sette.setForeground(new Color(0,0,0));
		sette.setEnabled(true);
		sette.setFont(new Font("sansserif",0,12));
		sette.setText("7");
		sette.setVisible(true);

		quatro = new JButton();
		quatro.setBounds(40,160,90,35);
		quatro.setBackground(new Color(214,217,223));
		quatro.setForeground(new Color(0,0,0));
		quatro.setEnabled(true);
		quatro.setFont(new Font("sansserif",0,12));
		quatro.setText("4");
		quatro.setVisible(true);

		nove = new JButton();
		nove.setBounds(259,99,90,35);
		nove.setBackground(new Color(214,217,223));
		nove.setForeground(new Color(0,0,0));
		nove.setEnabled(true);
		nove.setFont(new Font("sansserif",0,12));
		nove.setText("9");
		nove.setVisible(true);

		diviso = new JButton();
		diviso.setBounds(390,100,90,35);
		diviso.setBackground(new Color(214,217,223));
		diviso.setForeground(new Color(0,0,0));
		diviso.setEnabled(true);
		diviso.setFont(new Font("sansserif",0,12));
		diviso.setText("/");
		diviso.setVisible(true);

		per = new JButton();
		per.setBounds(390,160,90,35);
		per.setBackground(new Color(214,217,223));
		per.setForeground(new Color(0,0,0));
		per.setEnabled(true);
		per.setFont(new Font("sansserif",0,12));
		per.setText("x");
		per.setVisible(true);

		meno = new JButton();
		meno.setBounds(390,220,90,35);
		meno.setBackground(new Color(214,217,223));
		meno.setForeground(new Color(0,0,0));
		meno.setEnabled(true);
		meno.setFont(new Font("sansserif",0,12));
		meno.setText("-");
		meno.setVisible(true);

		piuu = new JButton();
		piuu.setBounds(390,280,90,35);
		piuu.setBackground(new Color(214,217,223));
		piuu.setForeground(new Color(0,0,0));
		piuu.setEnabled(true);
		piuu.setFont(new Font("sansserif",0,12));
		piuu.setText("+");
		piuu.setVisible(true);

		uguale = new JButton();
		uguale.setBounds(390,40,90,35);
		uguale.setBackground(new Color(214,217,223));
		uguale.setForeground(new Color(0,0,0));
		uguale.setEnabled(true);
		uguale.setFont(new Font("sansserif",0,12));
		uguale.setText("=");
		uguale.setVisible(true);

		uno = new JButton();
		uno.setBounds(40,220,90,35);
		uno.setBackground(new Color(214,217,223));
		uno.setForeground(new Color(0,0,0));
		uno.setEnabled(true);
		uno.setFont(new Font("sansserif",0,12));
		uno.setText("1");
		uno.setVisible(true);

		zero = new JButton();
		zero.setBounds(150,280,90,35);
		zero.setBackground(new Color(214,217,223));
		zero.setForeground(new Color(0,0,0));
		zero.setEnabled(true);
		zero.setFont(new Font("sansserif",0,12));
		zero.setText("0");
		zero.setVisible(true);

		due = new JButton();
		due.setBounds(150,220,90,35);
		due.setBackground(new Color(214,217,223));
		due.setForeground(new Color(0,0,0));
		due.setEnabled(true);
		due.setFont(new Font("sansserif",0,12));
		due.setText("2");
		due.setVisible(true);

		cinque = new JButton();
		cinque.setBounds(150,160,90,35);
		cinque.setBackground(new Color(214,217,223));
		cinque.setForeground(new Color(0,0,0));
		cinque.setEnabled(true);
		cinque.setFont(new Font("sansserif",0,12));
		cinque.setText("5");
		cinque.setVisible(true);

		otto = new JButton();
		otto.setBounds(150,100,90,35);
		otto.setBackground(new Color(214,217,223));
		otto.setForeground(new Color(0,0,0));
		otto.setEnabled(true);
		otto.setFont(new Font("sansserif",0,12));
		otto.setText("8");
		otto.setVisible(true);

		tre = new JButton();
		tre.setBounds(260,220,90,35);
		tre.setBackground(new Color(214,217,223));
		tre.setForeground(new Color(0,0,0));
		tre.setEnabled(true);
		tre.setFont(new Font("sansserif",0,12));
		tre.setText("3");
		tre.setVisible(true);

		sei = new JButton();
		sei.setBounds(260,160,90,35);
		sei.setBackground(new Color(214,217,223));
		sei.setForeground(new Color(0,0,0));
		sei.setEnabled(true);
		sei.setFont(new Font("sansserif",0,12));
		sei.setText("6");
		sei.setVisible(true);

		testo = new JLabel();
		testo.setBounds(22,20,283,51);
		testo.setBackground(new Color(214,217,223));
		testo.setForeground(new Color(0,0,0));
		testo.setEnabled(true);
		testo.setFont(new Font("sansserif",0,12));
		testo.setText("label");
		testo.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(sette);
		contentPane.add(quatro);
		contentPane.add(nove);
		contentPane.add(diviso);
		contentPane.add(per);
		contentPane.add(meno);
		contentPane.add(piuu);
		contentPane.add(uguale);
		contentPane.add(uno);
		contentPane.add(zero);
		contentPane.add(due);
		contentPane.add(cinque);
		contentPane.add(otto);
		contentPane.add(tre);
		contentPane.add(sei);
		contentPane.add(testo);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

		 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUI_project();
			}
		});
	}

}