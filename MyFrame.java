import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

 public class MyFrame extends JFrame
      {
          JButton zero =               new JButton("0");
                 private JButton uno;
                JButton due ;
                JButton tre;
                JButton quattro ;
                JButton cinque;
                JButton sei;
                JButton sette;
                JButton otto;
                JButton nove ;
                JButton piu ;//13
                JButton meno;//11
                JButton per;//12
                JButton diviso;//14
                JButton uguale ;//777
                JLabel txt;
                
                 public static void main(String args[]) 
            {
                
                JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(532,325));
		contentPane.setBackground(new Color(192,192,192));
		
                JFrame frame = new JFrame("CALCOLATRICE");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 400);
                frame.setResizable(true);
             
               
                Ascoltatore segno = new Ascoltatore();
                Ascoltatore operazione = new Ascoltatore();
               
                
               
                  
                   
                   
                 //implementazione dei numeri  
                JPanel panel = new JPanel();
                sette= new JButton();
                panel.add(sette);sette.addActionListener(segno);sette.setBounds(390,100,90,35);

                panel.add(otto);otto.addActionListener(segno);otto.setBounds(390,280,90,35);
                
                panel.add(nove);due.addActionListener(segno);due.setBounds(150,220,90,35);
                
                panel.add(quattro);quattro.addActionListener(segno);quattro.setBounds(40,160,90,35);
                
                panel.add(cinque);cinque.addActionListener(segno);cinque.setBounds(150,160,90,35);
                
                panel.add(sei);sei.addActionListener(segno);sei.setBounds(260,160,90,35);
                
                panel.add(uno);uno.addActionListener(segno);uno.setBounds(40,220,90,35);
                
                panel.add(due);due.addActionListener(segno);due.setBounds(150,220,90,35);
                
                panel.add(tre);tre.addActionListener(segno);tre.setBounds(260,220,90,35);
               
                panel.add(zero);zero.addActionListener(segno);zero.setBounds(150,280,90,35);
                
                
                
                
                //implementazione dei segni  
                JPanel esegui = new JPanel();
                esegui.add(piu);piu.addActionListener(operazione);piu.setBounds(390,280,90,35);
                esegui.add(meno);meno.addActionListener(operazione);meno.setBounds(390,220,90,35);
                esegui.add(diviso);diviso.addActionListener(operazione);diviso.setBounds(390,100,90,35);
                esegui.add(uguale);uguale.addActionListener(operazione);uguale.setBounds(390,40,90,35);
                esegui.add(per);per.addActionListener(operazione);per.setBounds(390,160,90,35);
                //esegui.setSize(400, 400);
                
                
                //implementazione della box   
                JPanel risultato= new JPanel();
                risultato.add(txt);
               
                frame.getContentPane().add(BorderLayout.SOUTH, risultato);
                frame.getContentPane().add(BorderLayout.WEST, esegui);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                
                frame.setVisible(true);
                
                }
    }