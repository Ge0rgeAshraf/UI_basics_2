package com.example.uibasics2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;

    public void btnClicked(View view)
    {
        switch (view.getId()) {
            case R.id.btn:;
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
            textView.setText("Hello " + editText.getText().toString());
            break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this::btnClicked);

        editText = findViewById(R.id.edttext);
        editText = findViewById(R.id.edttext);

    }
}