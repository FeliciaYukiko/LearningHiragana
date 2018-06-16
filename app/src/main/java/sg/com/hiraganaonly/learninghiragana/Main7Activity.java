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

public class Main7Activity extends AppCompatActivity {

    private Swipe swipe;

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Button b = (Button) findViewById(R.id.mizu);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.mizu);
                mp.start();
            }
        });
        Button b1 = (Button) findViewById(R.id.help);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.help);
                mp.start();
            }
        });
        Button b2 = (Button) findViewById(R.id.waifai);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.waifai);
                mp.start();
            }
        });
        Button b3 = (Button) findViewById(R.id.menu);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.menu);
                mp.start();
            }
        });
        Button b4 = (Button) findViewById(R.id.eigomenu);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.eigomenu);
                mp.start();
            }
        });
        Button b5 = (Button) findViewById(R.id.check);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.check);
                mp.start();
            }
        });
        Button b6 = (Button) findViewById(R.id.creditcard);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.creditcard);
                mp.start();
            }
        });
        Button b7 = (Button) findViewById(R.id.shashin);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.shashin);
                mp.start();
            }
        });
        Button b8 = (Button) findViewById(R.id.map);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.map);
                mp.start();
            }
        });
        Button b9 = (Button) findViewById(R.id.reservation);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.reservation);
                mp.start();
            }
        });
        Button b10 = (Button) findViewById(R.id.eigo);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.eigo);
                mp.start();
            }
        });
        Button b11 = (Button) findViewById(R.id.koreokudasai);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main7Activity.this, R.raw.koreokudasai);
                mp.start();
            }
        });
        Button b12 = findViewById(R.id.home);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main7Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
        swipe = new Swipe();
        swipe.setListener(new SimpleSwipeListener() {
            @Override
            public boolean onSwipedRight(MotionEvent event) {
                Intent i = new Intent (Main7Activity.this, MainActivity.class);
                startActivity(i);
                return super.onSwipedRight(event);
            }});
    }
}