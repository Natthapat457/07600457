package th.ac.su.cp.mywork1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button scorebutton = findViewById(R.id.checkbutton);
        scorebutton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,Confirm.class);

                startActivity(i);
            }
        });
    }
}