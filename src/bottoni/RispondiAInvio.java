package bottoni;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

//classe concreta
//implementa ActionListener
//classe ascoltatore di JTextField
public class RispondiAInvio implements ActionListener {
//    variabili globali

//    tre oggetti JTextField
    JTextField t1, t2, t3;

//    costruttore con parametri
    public RispondiAInvio(JTextField t1, JTextField t2, JTextField t3) {
//        assegno ai parametri il valore delle variabili globali
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

//    sovrascrivo metodo astratto di ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (t1 == o) {
            System.out.println("Sono t1");
        } else if (t2 == o) {
            System.out.println("Sono t2");
        } else if (t3 == o) {
            System.out.println("Sono t3");
        } else {
            System.out.println("Non so chi sono");
        }
    }

}
