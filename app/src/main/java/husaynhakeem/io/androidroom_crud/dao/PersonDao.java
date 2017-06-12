package husaynhakeem.io.androidroom_crud.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import husaynhakeem.io.androidroom_crud.entity.Person;

/**
 * Created by husaynhakeem on 6/12/17.
 */

@Dao
public interface PersonDao {

    @Insert
    void insert(Person... person);

    @Update
    void update(Person... person);

    @Delete
    void delete(Person... person);

    @Query("Select * FROM person")
    Person[] loadAll();
}
