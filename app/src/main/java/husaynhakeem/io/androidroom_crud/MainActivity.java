package husaynhakeem.io.androidroom_crud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import husaynhakeem.io.androidroom_crud.database.AppDataBase;
import husaynhakeem.io.androidroom_crud.entity.Cat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDataBase db = AppDataBase.getAppDatabase(this);

        db.catDao().insert(DataGenerator.catInstance("Tony", 3, 1));
        Cat[] cats = db.catDao().loadAll();
        for (Cat cat: cats)
            Log.d("Hooman", "Hooman name: " + cat.name + " " + cat.age);
    }
}
