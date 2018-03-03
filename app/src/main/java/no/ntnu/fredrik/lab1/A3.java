package no.ntnu.fredrik.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class A3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);

        Button B3 = findViewById(R.id.button3);
        final EditText editText2 = findViewById(R.id.editText2);

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = getIntent();
                String editTextValue = editText2.getText().toString();
                returnIntent.putExtra("writtenText",editTextValue);
                setResult(RESULT_OK,returnIntent);
                finish();
            }
        });

    }
}
