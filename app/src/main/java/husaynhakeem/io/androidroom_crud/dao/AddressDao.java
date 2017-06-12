package husaynhakeem.io.androidroom_crud.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import husaynhakeem.io.androidroom_crud.entity.Address;

/**
 * Created by husaynhakeem on 6/12/17.
 */

@Dao
public interface AddressDao {

    @Insert
    void insert(Address... address);

    @Update
    void update(Address... address);

    @Delete
    void delete(Address... address);

    @Query("Select * FROM address")
    Address[] loadAll();
}