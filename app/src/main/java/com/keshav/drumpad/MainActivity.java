package com.keshav.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;
    int[] magic = {R.drawable.magic,R.drawable.magic1,R.drawable.magic2,R.drawable.magic3,R.drawable.magic4,R.drawable.magic5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = MediaPlayer.create(MainActivity.this, R.raw.one);
        m2 = MediaPlayer.create(MainActivity.this, R.raw.two);
        m3 = MediaPlayer.create(MainActivity.this, R.raw.three);
        m4 = MediaPlayer.create(MainActivity.this, R.raw.four);
        m5 = MediaPlayer.create(MainActivity.this, R.raw.fv);
        m6 = MediaPlayer.create(MainActivity.this, R.raw.sixth);
        m7 = MediaPlayer.create(MainActivity.this, R.raw.seventh);
        m8 = MediaPlayer.create(MainActivity.this, R.raw.eighth);
    }

    @Override
    public void onClick(View view) {

        //randomize colors
        int ran = (int) Math.abs(Math.round(Math.random()*magic.length-1));

        int id = view.getId();

        view.setBackgroundResource(magic[ran]);

        switch (id){
            case R.id.one:
                m1.start();
                break;
            case R.id.two:
                m2.start();
                break;
            case R.id.three:
                m3.start();
                break;
            case R.id.four:
                m4.start();
                break;
            case R.id.five:
                m5.start();
                break;
            case R.id.six:
                m6.start();
                break;
            case R.id.seven:
                m7.start();
                break;
            case R.id.eight:
                m8.start();
                break;
        }
    }
}
