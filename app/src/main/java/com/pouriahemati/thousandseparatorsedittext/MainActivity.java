package com.pouriahemati.thousandseparatorsedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_number = findViewById(R.id.edt_number);
        edt_number.addTextChangedListener(new NumberTextWatcher(edt_number));
    }
}
