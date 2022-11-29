package com.example.grapher;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView accCur, accRetarded, acc;
    ProgressBar progers;
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private SensorEventListener sensorEventListener = new SensorEventListener()
    {
        @Override
        public void onSensorChanged(SensorEvent sensorEvent)
        {
            float[] xyz={0,0,0};
            accel
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i)
        {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        accCur= findViewById(R.id.accCur);
        accRetarded= findViewById(R.id.AccRetarded);
        acc= findViewById(R.id.accelerate);
        progers=findViewById(R.id.ligma);

        mSensorManager= (SensorManager)getSystemService(SENSOR_SERVICE);
        mAccelerometer= mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

    }
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(sensorEventListener, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(sensorEventListener);
    }
}