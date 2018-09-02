package data.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.Date;

/**
 * Created by Mr. Wasir on 02,September,2018
 */
@Dao
public interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void buldInsert(WeatherEntry... weather);

    @Query("SELECT * from weather WHERE date = :date")
    WeatherEntry getWeatherByDate(Date date);
}
