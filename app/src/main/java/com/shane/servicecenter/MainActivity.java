package com.shane.servicecenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;

import com.shane.intents.ShaneIntentService;

public class MainActivity extends AppCompatActivity {

    public static final int StaffValidation_ID=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=new Intent(this, ShaneIntentService.class);
        startService(intent);

        Button newUser=(Button)findViewById(R.id.button);
        Button existingUser=(Button)findViewById(R.id.button2);
        Button exit=(Button)findViewById(R.id.button3);

        newUser.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {

                    }
                }
        );


        existingUser.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent i=new Intent(v.getContext(),ValidateUserActivity.class);
                        MainActivity.this.startActivity(i);
                    }
                }
        );

        exit.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        //Close the Application...
                    }
                }
        );


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
