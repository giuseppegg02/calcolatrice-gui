import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

 public class MyFrame extends JFrame
      {
                 public static void main(String args[]) 
            {
                
                JFrame frame = new JFrame("CALCOLATRICE");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 400);
                frame.setResizable(true);
             
               
                 
                 
                JButton zero =               new JButton("0");
                JButton uno =                new JButton("1");
                JButton due =                new JButton("2");
                JButton tre =                new JButton("3");
                JButton quattro =            new JButton("4");
                JButton cinque =             new JButton("5");
                JButton sei =                new JButton("6");
                JButton sette =              new JButton("7");
                JButton otto =               new JButton("8");
                JButton nove =               new JButton("9");
                JButton piu =                new JButton("+");//13
                JButton meno =               new JButton("-");//11
                JButton per =                new JButton("x");//12
                JButton diviso =             new JButton(":");//14
                JButton uguale =             new JButton("=");//777
                JLabel txt =                new JLabel();
                
                Ascoltatore segno = new Ascoltatore();
                Ascoltatore operazione = new Ascoltatore();
               
               
               
                  
                   
                   
                 //implementazione dei numeri  
                JPanel panel = new JPanel();
                panel.add(sette);sette.addActionListener(segno);
                panel.add(otto);otto.addActionListener(segno);
                panel.add(nove);due.addActionListener(segno);
                panel.add(quattro);quattro.addActionListener(segno);
                panel.add(cinque);cinque.addActionListener(segno);
                panel.add(sei);sei.addActionListener(segno);
                panel.add(uno);uno.addActionListener(segno);
                panel.add(due);due.addActionListener(segno);
                panel.add(tre);tre.addActionListener(segno);
                panel.add(zero);zero.addActionListener(segno);
                
                //implementazione dei segni  
                JPanel esegui = new JPanel();
                esegui.add(piu);piu.addActionListener(operazione);
                esegui.add(meno);meno.addActionListener(operazione);
                esegui.add(diviso);diviso.addActionListener(operazione);
                esegui.add(uguale);uguale.addActionListener(operazione);
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