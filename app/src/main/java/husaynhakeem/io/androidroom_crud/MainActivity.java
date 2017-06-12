package husaynhakeem.io.androidroom_crud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import husaynhakeem.io.androidroom_crud.database.AppDataBase;
import husaynhakeem.io.androidroom_crud.entity.Address;
import husaynhakeem.io.androidroom_crud.entity.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDataBase db = AppDataBase.getAppDatabase(this);

        populateWithTestData(db);
        Person[] hoomans = db.dao().loadAllPeople();
        for (Person hooman: hoomans)
            Log.d("Hooman", "Hooman name: " + hooman.firstName + " " + hooman.lastName);
    }

    private static Person addPerson(final AppDataBase db, Person person) {
        db.dao().insertPerson(person);
        return person;
    }

    private static void populateWithTestData(AppDataBase db) {
        Person person = new Person();
        person.firstName = "Husayn";
        person.lastName = "Hakeem";
        person.address = new Address();
        person.address.city = "Casablanca";
        person.address.state = "Casablanca";
        person.address.street = "Florida";
        person.address.postCode = 20000;
        addPerson(db, person);
    }
}
