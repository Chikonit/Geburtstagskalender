import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//DAO = Data Acces Objekt
public class BirthdayDAO {

    private final String  SAVE_PATH = "saveData.csv";
    private final String   SEPERATOR = ",";
    private final NL = System.lineSeparator();


    private ArrayList<Birthday> birthdayList;

    public BirthdayDAO() {
        birthdayList = new ArrayList<>();
    }

    public void addBirthday(String name, String date) {

        //ToDO; in Liste speichern
        birthdayList.add(new Birthday(name,date));
        System.out.println("Birthdaylist Size: " + birthdayList.size());
    }
    public boolean deleteAll(){

        if(birthdayList != null) {
            birthdayList.clear();
        }
        return true;
    }

    public void save(){

    FileWriter csv =  null;

    try{
        csv = new FileWriter(SAVE_PATH);
        for(Birthday bday : birthdayList){
            if(bday != null){
                String line = bday.getName() + SEPERATOR +  bday.getDate() + "\n";

            }
        }

    }catch (IOException e){
        throw new RuntimeException(e);
    }

    }
    public void load(){

    }



}
