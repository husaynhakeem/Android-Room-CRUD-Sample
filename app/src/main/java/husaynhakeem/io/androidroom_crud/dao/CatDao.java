package husaynhakeem.io.androidroom_crud.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import husaynhakeem.io.androidroom_crud.entity.Cat;

/**
 * Created by husaynhakeem on 6/12/17.
 */

@Dao
public interface CatDao {

    @Insert
    void insert(Cat... cat);

    @Update
    void update(Cat... cat);

    @Delete
    void delete(Cat... cat);

    @Query("Select * FROM cat")
    Cat[] loadAll();

    @Query("Select * FROM cat WHERE hooman_id == :owner")
    Cat[] loadAllCatOwners(int owner);
}
