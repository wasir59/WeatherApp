package data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

/**
 * Created by Mr. Wasir on 02,September,2018
 */
@Database(entities = {WeatherEntry.class}, version = 1)
@TypeConverters(DateConverter.class)
public abstract class WeatherDatabase extends RoomDatabase {
    private static final String DATABASE_NAME = "weather";

    public abstract WeatherDao weatherDao();

    private static final Object LOCK = new Object();
    private static WeatherDatabase instance = null;

    public static WeatherDatabase getInstance(Context context) {
        if (instance == null) {
            synchronized (LOCK) {
                instance = Room.databaseBuilder(context.getApplicationContext(), WeatherDatabase.class, WeatherDatabase.DATABASE_NAME).build();
                return instance;
            }
        }
        return instance;
    }
}
