package husaynhakeem.io.androidroom_crud;

import husaynhakeem.io.androidroom_crud.entity.Cat;

/**
 * Created by husaynhakeem on 6/12/17.
 */

public class DataGenerator {


    public static void insertCats() {

    }


    public static Cat catInstance(String name, int age, int owner) {
        Cat cat = new Cat();

        cat.name = name;
        cat.age = age;
        cat.hoomanId = owner;

        return cat;
    }
}
