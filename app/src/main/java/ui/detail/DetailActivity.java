package ui.detail;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import wasir.weatherapp.R;

public class DetailActivity extends AppCompatActivity {
    private DetailActivityViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mViewModel = ViewModelProviders.of(this).get(DetailActivityViewModel.class);

        mViewModel.getmWeather().observe(this, weatherEntry -> {

        });
    }
}
