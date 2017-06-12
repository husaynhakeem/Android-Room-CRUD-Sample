package husaynhakeem.io.androidroom_crud.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import husaynhakeem.io.androidroom_crud.entity.Person;

/**
 * Created by husaynhakeem on 6/12/17.
 */

@Dao
public interface BaseDao {

    @Insert
    void insertPerson(Person person);

    @Query("SELECT * FROM person")
    Person[] loadAllPeople();
}
