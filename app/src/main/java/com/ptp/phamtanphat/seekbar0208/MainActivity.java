package com.ptp.phamtanphat.seekbar0208;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    SeekBar SeekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar = (SeekBar) findViewById(R.id.seekBar);
        SeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.d("AAA","Thay doi gia tri " + " Vi tri cua seek bar " + i + "Da cham vao thumb " + b);
                int curent = seekBar.getProgress();
                int secondariprogress = seekBar.getSecondaryProgress();
                if (curent >= secondariprogress ){
                    seekBar.setProgress(secondariprogress);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("AAA","Bat dau");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("AAA","Ket thuc");

            }
        });
    }
}
