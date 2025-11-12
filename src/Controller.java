import java.awt.event.ActionEvent;

public class Controller {

    private View mainView;
    private BirthdayDAO dao;
    //ToDo:test
    public Controller(){
        //ToDo : mainView erzeugen
        this.mainView = new View(600,300);
        this.mainView.addSaveHandler(this::onClickSave);
        this.mainView.addDeleteHandler(this::onClickDelete);
        this.mainView.addLoadHandler(this::onClickLoad);
        this.mainView.addDeleteAllHandler(this::onClickDeleteAll);
        this.dao= new BirthdayDAO();
    }

    private void onClickSave (ActionEvent  event){
        System.out.print(event.getActionCommand());

        //Vorgehensweise
        //1.Daten holen (Namen,Geburtsdatum)
        String name = mainView.getNameText();
        String date = mainView.getDateText();

        //2.Daten validieren(Daten auf Zuverlässigkeit prüfen)
        if(name.trim().length()< 2){
                mainView.showErrorDialog("Feheler","Der Namen muss mindestens 3 Buchstaben enthalten");

            return;
        }


        if(date.trim().length()< 2){
            mainView.showErrorDialog("Fehler","sei kein spast");
            return;
        }
        //Hier wissen wir, dass die Daten valide sind
        //3.vom DAO die addBirthday-Methoden nutzen
        dao.addBirthday(name,date);

    }
    private void onClickDelete (ActionEvent  event){
        System.out.print(event.getActionCommand());
    }
    private void onClickLoad (ActionEvent  event){
        System.out.print(event.getActionCommand());
    }
    private void onClickDeleteAll (ActionEvent  event){
        System.out.print(event.getActionCommand());
    }

}
