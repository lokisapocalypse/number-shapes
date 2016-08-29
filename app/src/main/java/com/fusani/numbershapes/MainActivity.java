package com.fusani.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void checkNumberShape(View view) {
        EditText myNumberField = (EditText) findViewById(R.id.numberField);
        int num = 0;

        try {
            num = Integer.parseInt(myNumberField.getText().toString());
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Please enter an integer.", Toast.LENGTH_SHORT).show();
        }

        Number number = new Number(num);
        String message = "";

        if (number.isSquare() && number.isTriangular()) {
            message = num + " is square and triangular.";
        } else if (number.isSquare()) {
            message = num + " is square.";
        } else if (number.isTriangular()) {
            message = num + " is triangular.";
        } else {
            message = num + " is not triangular or square.";
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
