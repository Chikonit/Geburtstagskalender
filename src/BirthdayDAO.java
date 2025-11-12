import java.util.ArrayList;

//DAO = Data Acces Objekt
public class BirthdayDAO {

    private ArrayList<Birthday> birthdayList;

    public BirthdayDAO() {
        birthdayList = new ArrayList<>();
    }

    public void addBirthday(String name, String date) {

        //ToDO; in Liste speichern
        birthdayList.add(new Birthday(name,date));
        System.out.println("Birthdaylist Size: " + birthdayList.size());
    }

    public void save(){

    }
    public void load(){

    }



}
