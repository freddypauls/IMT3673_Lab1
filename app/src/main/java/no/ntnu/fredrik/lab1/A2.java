package no.ntnu.fredrik.lab1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class A2 extends AppCompatActivity {
    private int REQUEST_CODE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra("name");

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText("Hello " + message);

        //On click listener
        Button B2 = findViewById(R.id.button2);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent (getApplicationContext(),A3.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });
    }

    //Prints the text you get from A3
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        TextView resultFromA3 = findViewById(R.id.textView2);
        if(resultCode == RESULT_OK) {
            resultFromA3.setText("From A3: " + data.getExtras().get("writtenText"));
        }
        else if (resultCode == RESULT_CANCELED) {
            resultFromA3.setText("From A3:");
        }
    }
}
