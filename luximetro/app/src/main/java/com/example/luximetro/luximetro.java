package com.example.luximetro;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class luximetro extends AppCompatActivity {

    private SensorManager sensorManager;
    private Sensor sensor;
    private SensorEventListener sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {

                float value = sensorEvent.values[0];
                float maximo = 0;
                float minimo = 0;

                if (value > maximo) {
                    maximo = value;
                }

                if (value < minimo) {
                    minimo = value;
                }


                TextView txtResultadoProg = (TextView) findViewById(R.id.txtResultado);
                txtResultadoProg.setText("Luminosidade: " + value + " lx");

                TextView txtMaximoProg = (TextView) findViewById(R.id.txtMaximo);
                txtMaximoProg.setText("Luminosidade Máxima: " + maximo + " lx");

                TextView txtMinimoProg = (TextView) findViewById(R.id.txtMinimo);
                txtMinimoProg.setText("Luminosidade Mínima: " + minimo + " lx");

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luximetro);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        if (sensor == null) {
            Toast.makeText(this, "O dispositivo não possui sensor de luz!",Toast.LENGTH_SHORT).show();
            finish();
        }
        }
    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(sensorEventListener, sensor, SensorManager.SENSOR_DELAY_FASTEST);
    }
    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(sensorEventListener);
    }
}
