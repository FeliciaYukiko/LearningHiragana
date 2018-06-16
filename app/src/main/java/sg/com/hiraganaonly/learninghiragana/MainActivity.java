package sg.com.hiraganaonly.learninghiragana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.pwittchen.swipe.library.rx2.SimpleSwipeListener;
import com.github.pwittchen.swipe.library.rx2.Swipe;

public class MainActivity extends AppCompatActivity {

    private Swipe swipe;

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.l1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);

                Toast.makeText(MainActivity.this, "Welcome to Lesson 1", Toast.LENGTH_SHORT).show();
            }

        });
        Button button1 = findViewById(R.id.l2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(i);

                Toast.makeText(MainActivity.this, "Welcome to Lesson 2", Toast.LENGTH_SHORT).show();
            }
        });
        Button button2 = findViewById(R.id.l3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(i);

                Toast.makeText(MainActivity.this, "Welcome to Lesson 3", Toast.LENGTH_SHORT).show();
            }
        });
        Button button3 = findViewById(R.id.l4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(i);

                Toast.makeText(MainActivity.this, "Welcome to Lesson 4", Toast.LENGTH_SHORT).show();
            }
        });
        Button button4 = findViewById(R.id.l5);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(i);

                Toast.makeText(MainActivity.this, "Welcome to Lesson 5", Toast.LENGTH_SHORT).show();
            }
        });
        Button button5 = findViewById(R.id.l6);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main7Activity.class);
                startActivity(i);

                Toast.makeText(MainActivity.this, "Welcome to Lesson 6", Toast.LENGTH_SHORT).show();
            }
        });
        swipe = new Swipe();
        swipe.setListener(new SimpleSwipeListener() {
            @Override
            public boolean onSwipedLeft(MotionEvent event) {
                Intent i = new Intent (MainActivity.this, Main2Activity.class);
                startActivity(i);
                return super.onSwipedLeft(event);
            }

            @Override
            public boolean onSwipedRight(MotionEvent event) {
                Intent i = new Intent (MainActivity.this, Main.class);
                startActivity(i);
                return super.onSwipedRight(event);
    }})
    ;
}}
