package husaynhakeem.io.androidroom_crud.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.graphics.Bitmap;

/**
 * Created by husaynhakeem on 6/12/17.
 */

@Entity (tableName = "person")
public class Person {

    @PrimaryKey (autoGenerate = true)
    public int id;

    @ColumnInfo (name = "first_name")
    public String firstName;

    @ColumnInfo (name = "last_name")
    public String lastName;

    @Ignore
    public Bitmap picture;

    @Embedded
    public Address address;
}