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

public class Main5Activity extends AppCompatActivity {

    private Swipe swipe;

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button b = (Button) findViewById(R.id.ohayo);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.ohayo);
                mp.start();
            }
        });
        Button b1 = (Button) findViewById(R.id.konichiwa);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.konichiwa);
                mp.start();
            }
        });
        Button b2 = (Button) findViewById(R.id.konbanwa);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.konbanwa);
                mp.start();
            }
        });
        Button b3 = (Button) findViewById(R.id.yoroshiku);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.yoroshiku);
                mp.start();
            }
        });
        Button b4 = (Button) findViewById(R.id.oyasumi);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.oyasumi);
                mp.start();
            }
        });
        Button b5 = (Button) findViewById(R.id.gomenasai);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.gomenasai);
                mp.start();
            }
        });
        Button b6 = (Button) findViewById(R.id.ogenki);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.ogenki);
                mp.start();
            }
        });
        Button b7 = (Button) findViewById(R.id.wakarimashita);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.wakarimashita);
                mp.start();
            }
        });
        Button b8 = (Button) findViewById(R.id.wakarimasen);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.wakarimasen);
                mp.start();
            }
        });
        Button b9 = (Button) findViewById(R.id.onamae);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.namae);
                mp.start();
            }
        });
        Button b10 = (Button) findViewById(R.id.oikutsu);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.oikutsu);
                mp.start();
            }
        });
        Button b11 = (Button) findViewById(R.id.sumimasen);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main5Activity.this, R.raw.sumimasen);
                mp.start();
            }
        });
        Button b12 = findViewById(R.id.home);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
        swipe = new Swipe();
        swipe.setListener(new SimpleSwipeListener() {
            @Override
            public boolean onSwipedRight(MotionEvent event) {
                Intent i = new Intent (Main5Activity.this, MainActivity.class);
                startActivity(i);
                return super.onSwipedRight(event);
            }

            @Override
            public boolean onSwipedLeft(MotionEvent event) {
                Intent i = new Intent (Main5Activity.this, Main6Activity.class);
                startActivity(i);
                return super.onSwipedLeft(event);
            }});
    }}
