package husaynhakeem.io.androidroom_crud.utilities;

import husaynhakeem.io.androidroom_crud.database.AppDataBase;
import husaynhakeem.io.androidroom_crud.entity.Address;
import husaynhakeem.io.androidroom_crud.entity.Cat;
import husaynhakeem.io.androidroom_crud.entity.Person;

/**
 * Created by husaynhakeem on 6/12/17.
 */

public class DataGenerator {


    private static DataGenerator instance;
    private static AppDataBase dataBase;


    public static DataGenerator with(AppDataBase appDataBase) {

        if (dataBase == null)
            dataBase = appDataBase;

        if (instance == null)
            instance = new DataGenerator();

        return instance;
    }


    public void generatePeople() {
        if (dataBase == null)
            return;

        Person[] persons = new Person[4];
        persons[0] = personInstance(1, "Husayn", "Hakeem");
        persons[1] = personInstance(2, "Afafe", "Mokhtari");
        persons[2] = personInstance(3, "Abderrahmane", "Bachiri");
        persons[3] = personInstance(4, "Jalal", "Khaldouni");

        dataBase.personDao().insert(persons);
    }


    private Address addressInstance(String street, String state, String city, int postCode) {
        Address address = new Address();

        address.street = street;
        address.state = state;
        address.city = city;
        address.postCode = postCode;

        return address;
    }


    private Person personInstance(int id, String firstName, String lastName) {
        Person person = new Person();

        person.id = id;
        person.firstName = firstName;
        person.lastName = lastName;

        Address address = addressInstance("Some street name", "Some state", "Some city", 19421);
        dataBase.addressDao().insert(address);

        person.address = address;

        return person;
    }


    public void generateCats() {

        if (dataBase == null)
            return;

        Cat[] cats = new Cat[5];
        cats[0] = catInstance("Tony", 3, 1);
        cats[1] = catInstance("Tiger", 1, 1);
        cats[2] = catInstance("Misty", 2, 2);
        cats[3] = catInstance("Oscar", 5, 3);
        cats[4] = catInstance("Puss", 4, 4);

        dataBase.catDao().insert(cats);
    }


    private Cat catInstance(String name, int age, int owner) {
        Cat cat = new Cat();

        cat.name = name;
        cat.age = age;
        cat.hoomanId = owner;

        return cat;
    }
}
