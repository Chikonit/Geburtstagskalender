import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {

    private JButton saveBtn,delthisBtn,delallBtn,loadBtn;
    private JTextField nameTf,birthdayTf;

    public View(int width, int height){

        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI();
        show();

    }

    private void createUI(){

        // 3 Panel für die Inhalte erzeugen
        JPanel topPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        //Inhalte UI-Elemente als Objekt erzeugen
        JLabel headline = new JLabel("Neuen Geburtstag anlegen");

        JLabel nameLabel = new JLabel("Name eingeben");
         nameTf = new JTextField();

        JLabel birthdayLabel = new JLabel("Birthday eingeben");
         birthdayTf = new JTextField();

        saveBtn = new JButton("Speichern");
        delthisBtn = new JButton("Datei löschen");
        delallBtn = new JButton("Alle Dateien löschen");
        loadBtn = new JButton("Laden");



        //Layout festlegen
        centerPanel.setLayout(new GridLayout(2,2, 5, 5));
        centerPanel.setBorder(new EmptyBorder(5,5,5,5));

        // befüllen des Toppanels
        topPanel.add(headline);

        //befüllen des centerPanels

        centerPanel.add(nameLabel);
        centerPanel.add(nameTf);
        centerPanel.add(birthdayLabel);
        centerPanel.add(birthdayTf);


        //befüllen des bottomPanels
        bottomPanel.add(saveBtn);
        bottomPanel.add(delthisBtn);
        bottomPanel.add(delallBtn);
        bottomPanel.add(loadBtn);

        // panel dem jframe hinzufügen
        add(topPanel,BorderLayout.NORTH);
        add(centerPanel,BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);


    }

    /**
     * Fügt dem Savebutton einen Eventlistener bzw.Actionlistener hinzu
     * @param listener - Eventlistener
     */
    public void addSaveHandler(ActionListener listener){
        saveBtn.addActionListener(listener);
    }

    public void addDeleteHandler(ActionListener listener){
        delthisBtn.addActionListener(listener);
    }

    public void addLoadHandler(ActionListener listener){
        loadBtn.addActionListener(listener);
    }

    public void addDeleteAllHandler(ActionListener listener){
        delallBtn.addActionListener(listener);
    }


    //Getter für Textfelder
    public String getNameText(){

        return nameTf.getText();
    }

    public String getDateText(){

        return birthdayTf.getText();
    }
//Dialog-Methoden

    public void showErrorDialog(String title, String text){
        JOptionPane.showMessageDialog( this ,text, title, JOptionPane.ERROR_MESSAGE );
    }


/**
 * Hausaufgabe: fügen sie noch eine Methode ""showInfoMessage"
 * und eine "show ConfirmMessage" hinzu, showConfirmMessage soll
 * true zurückgeben wenn "ok" gedrückt wurde, und false , wenn "cancel"
 * gedrückt wurde
 */



}


