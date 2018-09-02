package data.database;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by Mr. Wasir on 02,September,2018
 */
public class DateConverter {
    @TypeConverter
    public static Date toDate(Long timeStamp) {
        return timeStamp == null ? null : new Date(timeStamp);
    }

    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
