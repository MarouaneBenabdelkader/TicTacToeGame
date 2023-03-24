package com.estf.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.estf.tictactoegame.actions.StartAction;

public class MainActivity extends AppCompatActivity {

    private EditText name1Input;
    private EditText name2Input;

    public EditText getName1Input() {
        return name1Input;
    }

    public EditText getName2Input() {
        return name2Input;
    }

    private Button startBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1Input = findViewById(R.id.inputName1);
        name2Input = findViewById(R.id.inputName2);
        startBtn = findViewById(R.id.startBtn);
        StartAction startAction = new StartAction(this);
        startBtn.setOnClickListener(startAction);
    }
}