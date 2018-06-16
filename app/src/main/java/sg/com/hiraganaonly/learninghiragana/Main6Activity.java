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

public class Main6Activity extends AppCompatActivity {

    private Swipe swipe;

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button b = (Button) findViewById(R.id.hajimemashite);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.hajimemashite);
                mp.start();
            }
        });
        Button b1 = (Button) findViewById(R.id.sayonara);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.sayonara);
                mp.start();
            }
        });
        Button b2 = (Button) findViewById(R.id.dozo);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.dozo);
                mp.start();
            }
        });
        Button b3 = (Button) findViewById(R.id.eki);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.eki);
                mp.start();
            }
        });
        Button b4 = (Button) findViewById(R.id.domo);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.domo);
                mp.start();
            }
        });
        Button b5 = (Button) findViewById(R.id.hai);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.hai);
                mp.start();
            }
        });
        Button b6 = (Button) findViewById(R.id.iie);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.iie);
                mp.start();
            }
        });
        Button b7 = (Button) findViewById(R.id.koreikura);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.koreikura);
                mp.start();
            }
        });
        Button b8 = (Button) findViewById(R.id.soreikura);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.soreikura);
                mp.start();
            }
        });
        Button b9 = (Button) findViewById(R.id.areikura);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.areikura);
                mp.start();
            }
        });
        Button b10 = (Button) findViewById(R.id.jamata);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.jamata);
                mp.start();
            }
        });
        Button b11 = (Button) findViewById(R.id.arigato);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main6Activity.this, R.raw.arigato);
                mp.start();
            }
        });
        Button b12 = findViewById(R.id.home);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
        swipe = new Swipe();
        swipe.setListener(new SimpleSwipeListener() {
            @Override
            public boolean onSwipedRight(MotionEvent event) {
                Intent i = new Intent (Main6Activity.this, MainActivity.class);
                startActivity(i);
                return super.onSwipedRight(event);
            }

            @Override
            public boolean onSwipedLeft(MotionEvent event) {
                Intent i = new Intent (Main6Activity.this, Main7Activity.class);
                startActivity(i);
                return super.onSwipedLeft(event);
            }});
    }

}
