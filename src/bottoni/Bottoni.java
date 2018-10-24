package bottoni;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

//classe concreta bottoni
//deriva da JFrame (finestra)
//implementa ActionListener
public class Bottoni extends JFrame {//implements ActionListener {
//    variabili e costanti globali

//    altezza e larghezza max  
    public static final int MAX_WIDTH = 600;
    public static final int MAX_HEIGHT = 500;
    JButton b1, b2, b3, b4, b5, b6;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;

//    costruttore
    public Bottoni() {
//        richiamiamo il costruttore di JFrame
        super("Intercettiamo degli eventi");
//        setta dimensioni
        setPreferredSize(new Dimension(MAX_WIDTH, MAX_HEIGHT));
//        setta cosa deve fare alla chiusura
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setta layout
        setLayout(new BorderLayout());

//        creiamo classi JButton
        b1 = new JButton("OK");
        b2 = new JButton("Annulla");
        b3 = new JButton("Reset");
        b4 = new JButton("Insert");

//        aggiungi un ascolatotre ai bottoni
//        ascoltatore = qualcuno in grado di intercettare il click
//        METODO 2:
        b1.addActionListener(new RispondiAlClick(b1, b2, b3, b4));
        b2.addActionListener(new RispondiAlClick(b1, b2, b3, b4));
        b3.addActionListener(new RispondiAlClick(b1, b2, b3, b4));
        b4.addActionListener(new RispondiAlClick(b1, b2, b3, b4));

//        Creiamo JPanel
        JPanel pSouth = new JPanel();

//        settiamo layout JPanel
//        allineiamo a i bottoni destra
        pSouth.setLayout(new FlowLayout(FlowLayout.RIGHT));
//        settiamo colore sfondo
        pSouth.setBackground(Color.DARK_GRAY);

//        aggiungiamo bottoni al Panel
        pSouth.add(b1);
        pSouth.add(b2);

//        aggiungiamo Panel al Frame
//        allineiamo il Panel in basso
        add(pSouth, BorderLayout.SOUTH);

//        Creiamo JPanel        
        JPanel pEast = new JPanel();

//        settiamo layout JPanel
//        allineiamo i bottoni a destra  
        pEast.setLayout(new BoxLayout(pEast, BoxLayout.Y_AXIS));

//        setta l'allineamento verticale dei bottoni
//        centrati nel pannello
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);

//        settiamo colore sfondo
        pEast.setBackground(Color.DARK_GRAY);

//        aggiungiamo bottoni al Panel
        pEast.add(b3);
        pEast.add(b4);

//        aggiungiamo il Panel al Frame
//        allineiamo il Panel a destra
        add(pEast, BorderLayout.EAST);

//        Creiamo JPanel
        JPanel pCenter = new JPanel();
        pCenter.setLayout(new GridLayout(5, 2));

//        creiamo classe JLabel
        l1 = new JLabel("Cognome: ");
        l2 = new JLabel("Nome: ");
        l3 = new JLabel("Impiego: ");
//        creiamo classe JTextField
        t1 = new JTextField("<cognome>");
        t2 = new JTextField("<nome>");
        t3 = new JTextField("<impiego>");

//        setto allineamento verticale JLabel
        l1.setAlignmentX(Component.RIGHT_ALIGNMENT);
        l2.setAlignmentX(Component.RIGHT_ALIGNMENT);
        l3.setAlignmentX(Component.RIGHT_ALIGNMENT);

//        setto allineamento verticale JTextField
        t1.setAlignmentX(Component.LEFT_ALIGNMENT);
        t2.setAlignmentX(Component.LEFT_ALIGNMENT);
        t3.setAlignmentX(Component.LEFT_ALIGNMENT);

//        aggiungi un ascolatotre alle text
//        ascoltatore = qualcuno in grado di intercettare il click
//        METODO 2:
        t1.addActionListener(new RispondiAInvio(t1, t2, t3));
        t2.addActionListener(new RispondiAInvio(t1, t2, t3));
        t3.addActionListener(new RispondiAInvio(t1, t2, t3));

//        aggiungiamo label e text al Panel
        pCenter.add(l1);
        pCenter.add(t1);
        pCenter.add(l2);
        pCenter.add(t2);
        pCenter.add(l3);
        pCenter.add(t3);

//        aggiungiamo bottoni al Frame
//        decidiamo allineamento
        add(pCenter, BorderLayout.CENTER);

//        aggiungiamo le componenti grafiche  
        pack();

//        settiamo visibilità a true
        setVisible(true);
    }

//    metodo test
    public static void test() {
//        creiamo un nuovo bottone
        Bottoni b = new Bottoni();
    }

}
