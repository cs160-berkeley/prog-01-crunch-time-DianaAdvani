package com.example.diana.crunchtime;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    Button pushups,situps,jumpingjacks,jogging;
    EditText reps;
    TextView calories,suffix;
    public double cal,r;
    double s,ju,jo,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pushups = (Button) findViewById(R.id.pushups);
        situps = (Button) findViewById(R.id.situps);
        jumpingjacks = (Button) findViewById(R.id.jumpingjacks);
        jogging = (Button) findViewById(R.id.jogging);

        reps = (EditText)findViewById(R.id.reps);

        suffix = (TextView)findViewById(R.id.suffix);
        calories = (TextView)findViewById(R.id.calories);



        pushups.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                r = Double.parseDouble(reps.getText().toString());
                suffix.setText("push ups");

                cal = (.3 * r);
                calories.setText(Double.toString(cal) + " calories");

                s = .6 * r;
                ju = .02 *r;
                jo = .03 *r;

                situps.setText(Double.toString(s)+" reps");
                jumpingjacks.setText(Double.toString(ju)+" mins");
                jogging.setText(Double.toString(jo)+" mins");
                pushups.setText("");

            }
        });

        situps.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                r = Double.parseDouble(reps.getText().toString());
                suffix.setText("sit ups");

                cal = (.5 * r);
                calories.setText(Double.toString(cal) + " calories");

                p = 1.75 * r;
                ju = .05 * r;
                jo = .06 * r;

                pushups.setText(Double.toString(p)+" reps");
                jumpingjacks.setText(Double.toString(ju)+" mins");
                jogging.setText(Double.toString(jo)+" mins");
                situps.setText("");

            }
        });

        jumpingjacks.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                r = Double.parseDouble(reps.getText().toString());
                suffix.setText("minutes of jumping jacks");

                cal = (10 * r);
                calories.setText(Double.toString(cal) + " calories");

                s = 20 * r;
                p = 35 * r;
                jo = 1.2 * r;

                pushups.setText(Double.toString(p)+" reps");
                situps.setText(Double.toString(s)+" reps");
                jogging.setText(Double.toString(jo)+" mins");
                jumpingjacks.setText("");

            }
        });

        jogging.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                r = Double.parseDouble(reps.getText().toString());
                suffix.setText("minutes jogging");

                cal = (8.3 * r);
                calories.setText(Double.toString(cal) + " calories");

                s = 17 *r;
                p = 29 *r;
                ju = .8 *r;

                pushups.setText(Double.toString(p)+" reps");
                situps.setText(Double.toString(s)+" reps");
                jumpingjacks.setText(Double.toString(ju)+" mins");
                jogging.setText("");

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
