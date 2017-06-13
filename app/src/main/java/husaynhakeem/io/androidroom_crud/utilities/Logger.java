package husaynhakeem.io.androidroom_crud.utilities;

import android.util.Log;

import husaynhakeem.io.androidroom_crud.entity.Address;
import husaynhakeem.io.androidroom_crud.entity.Cat;
import husaynhakeem.io.androidroom_crud.entity.Person;

/**
 * Created by husaynhakeem on 6/12/17.
 */

public class Logger {
    
    
    private static final String TAG = Logger.class.getName();
    
    
    public static void displayAdressesInLog(Address[] addresses) {
        
        if (addresses == null)
            return;
        
        for (Address address: addresses) {
            Log.d(TAG, "Address street: " + address.state + ", address city: " + address.city + ", address state: " + address.state + ", adress postal code: " + address.postCode);
        }
    }


    public static void displayPersonsInLog(Person[] persons) {

        if (persons == null)
            return;

        for (Person person: persons) {
            Log.d(TAG, "Person id: " + person.id + ", person name: " + person.firstName + " " + person.lastName);
        }
    }


    public static void displayCatsInLog(Cat[] cats) {

        if (cats == null)
            return;

        for (Cat cat: cats) {
            Log.d(TAG, "Cat id: " + cat.id + ", cat name: " + cat.name + ", cat age: " + cat.age + ", cat owner: " + cat.hoomanId);
        }
    }
}
