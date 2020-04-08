import java.awt.event.*;
import javax.swing.*;
public class Ascoltatore implements ActionListener{
    public void actionPerformed(ActionEvent event){
        JButton numero = (JButton)event.getSource();
               
        double risultato=0;
        int bi;
        String num ,segno;
        
        num=numero.getText();
        
        bi =Integer.parseInt(num);
       
        if (bi<10){
        
        }
        //quindi i numeri
        else{

            switch (bi){
            case 13:segno="+";break;
            case 11:segno="-";break;
            case 12:segno="*";break;
            case 14:segno="/";break;
            case 777:
            JOptionPane.showMessageDialog(null,"il risultato è "+bi);//va messo risultato dopo
            break;
            }
        }
        
        
        
    }
}