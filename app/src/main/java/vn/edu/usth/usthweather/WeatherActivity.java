package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(TAG, "this is onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "this is onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "this is onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "this is onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "this is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "this is onDestroy");
    }
}