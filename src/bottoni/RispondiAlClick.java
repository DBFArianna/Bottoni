package bottoni;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

//classe concreta
//implementa ActionListener
//classe ascoltatore di JButton
public class RispondiAlClick implements ActionListener {
//    variabili e costanti globali

//    tre oggetto bottone
    JButton b1, b2, b3, b4;

//    costruttore con parametri
    public RispondiAlClick(JButton b1, JButton b2, JButton b3, JButton b4) {
//        assegno ai parametri il valore delle variabili globali
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
    }

//    sovrascrivo metodo astratto di ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
//        restituisce l'oggeto sul quale è partito evento
//        e lo mette all'interno di b
//        bisogna fare il cast perchè getSource vuole object
//        (JButton) e.getSource() --> cast
        JButton b = (JButton) e.getSource();
//        se b = b1
        if (b == b1) {
//            stampa la stringa
            System.out.println("Sono il primo bottone");
//          altrimenti se b = b2
        } else if (b == b2) {
//            stampa la stringa
            System.out.println("Sono il secondo bottone");
//          altrimenti
        } else if (b == b3) {
//            stampa la stringa
            System.out.println("Sono il terzo bottone");
        } else {
            System.out.println("Chi mi ha chiamato? Boh");
        }

    }

}
