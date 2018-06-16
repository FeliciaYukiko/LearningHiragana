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

public class Main3Activity extends AppCompatActivity {

    private Swipe swipe;

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button b = (Button) findViewById(R.id.gagigugego);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main3Activity.this, R.raw.gagigugego);
                mp.start();
            }
        });
        Button b1 = (Button) findViewById(R.id.zajizuzezo);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main3Activity.this, R.raw.zajizuzezo);
                mp.start();
            }
        });
        Button b2 = (Button) findViewById(R.id.dajizudedo);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main3Activity.this, R.raw.dajizudedo);
                mp.start();
            }
        });
        Button b3 = (Button) findViewById(R.id.babibubebo);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main3Activity.this, R.raw.babibubebo);
                mp.start();
            }
        });
        Button b4 = (Button) findViewById(R.id.papipupepo);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main3Activity.this, R.raw.papipupepo);
                mp.start();
            }
        });
        Button b5 = (Button) findViewById(R.id.kyakyukyo);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main3Activity.this, R.raw.kyakyukyo);
                mp.start();
            }
        });
        Button b6 = (Button) findViewById(R.id.gyagyugyo);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main3Activity.this, R.raw.gyagyugyo);
                mp.start();
            }
        });
        Button button1 = findViewById(R.id.home);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
        swipe = new Swipe();
        swipe.setListener(new SimpleSwipeListener() {
            @Override
            public boolean onSwipedRight(MotionEvent event) {
                Intent i = new Intent (Main3Activity.this, MainActivity.class);
                startActivity(i);
                return super.onSwipedRight(event);
            }

            @Override
            public boolean onSwipedLeft(MotionEvent event) {
                Intent i = new Intent (Main3Activity.this, Main4Activity.class);
                startActivity(i);
                return super.onSwipedLeft(event);
            }});
    }}