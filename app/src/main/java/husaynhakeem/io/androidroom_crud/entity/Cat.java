package husaynhakeem.io.androidroom_crud.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by husaynhakeem on 6/12/17.
 */

@Entity(foreignKeys = @ForeignKey(entity = Person.class,
        parentColumns = "id",
        childColumns = "hooman_id"),
        indices = {@Index("hooman_id")})
public class Cat {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public String name;
    public int age;

    @ColumnInfo(name = "hooman_id")
    public int hoomanId;
}
