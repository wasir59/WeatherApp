package ui.detail;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import data.database.WeatherEntry;

/**
 * Created by Mr. Wasir on 02,September,2018
 */
public class DetailActivityViewModel extends ViewModel {
    private MutableLiveData<WeatherEntry> mWeather;

    public DetailActivityViewModel() {
        mWeather = new MutableLiveData<>();
    }

    public MutableLiveData<WeatherEntry> getmWeather() {
        return mWeather;
    }

    public void setmWeather(WeatherEntry weather) {
        mWeather.postValue(weather);
    }
}
