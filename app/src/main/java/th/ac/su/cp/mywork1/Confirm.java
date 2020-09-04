package th.ac.su.cp.mywork1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        final EditText et1 = findViewById(R.id.editTextTextPersonName);



        Button test = findViewById(R.id.button);

        test.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String numtext = et1.getText().toString();

                //-----------------------------------------------------
                Log.i("Confirmmsgg","current is "+numtext);

                if(numtext.length()!=13){
                    Toast t = Toast.makeText(
                            Confirm.this,
                            "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",
                            Toast.LENGTH_LONG
                    );
                    t.show();

                }
                else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Confirm.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    if(numtext.equalsIgnoreCase("1111111111111")||numtext.equalsIgnoreCase("2222222222222")){

                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                        dialog.setPositiveButton("OK",null);

                    }
                    else{
                        dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                        dialog.setPositiveButton("OK",null);
                    }
                    dialog.show();



                }


            }
        });



    }
}