package sg.com.hiraganaonly.learninghiragana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.github.pwittchen.swipe.library.rx2.SimpleSwipeListener;
import com.github.pwittchen.swipe.library.rx2.Swipe;

public class Main4Activity extends AppCompatActivity {

    private Swipe swipe;

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button b = (Button) findViewById(R.id.shashusho);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main4Activity.this, R.raw.shashusho);
                mp.start();
            }
        });
        Button b1 = (Button) findViewById(R.id.jajujo);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main4Activity.this, R.raw.jajujo);
                mp.start();
            }
        });
        Button b2 = (Button) findViewById(R.id.chachucho);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main4Activity.this, R.raw.chachucho);
                mp.start();
            }
        });
        Button b3 = (Button) findViewById(R.id.nyanyunyo);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main4Activity.this, R.raw.nyanyunyo);
                mp.start();
            }
        });
        Button b4 = (Button) findViewById(R.id.hyahyuhyo);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main4Activity.this, R.raw.hyahyuhyo);
                mp.start();
            }
        });
        Button b5 = (Button) findViewById(R.id.byabyubyo);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main4Activity.this, R.raw.byabyubyo);
                mp.start();
            }
        });
        Button b6 = (Button) findViewById(R.id.ryaryuryo);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main4Activity.this, R.raw.ryaryuryo);
                mp.start();
            }
        });
        Button b7 = (Button) findViewById(R.id.pyapyupyo);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main4Activity.this, R.raw.pyapyupyo);
                mp.start();
            }
        });
        Button b8 = (Button) findViewById(R.id.myamyumyo);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main4Activity.this, R.raw.myamyumyo);
                mp.start();
            }
        });
        Button b9 = findViewById(R.id.home);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(i);
            }
    });
        swipe = new Swipe();
        swipe.setListener(new SimpleSwipeListener() {
            @Override
            public boolean onSwipedRight(MotionEvent event) {
                Intent i = new Intent (Main4Activity.this, MainActivity.class);
                startActivity(i);
                return super.onSwipedRight(event);
            }

            @Override
            public boolean onSwipedLeft(MotionEvent event) {
                Intent i = new Intent (Main4Activity.this, Main5Activity.class);
                startActivity(i);
                return super.onSwipedLeft(event);
            }});
}}
