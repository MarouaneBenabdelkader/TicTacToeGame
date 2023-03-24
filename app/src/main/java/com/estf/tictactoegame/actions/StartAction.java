package com.estf.tictactoegame.actions;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.estf.tictactoegame.GameActivity;
import com.estf.tictactoegame.MainActivity;
import com.estf.tictactoegame.models.Player;

import java.util.ArrayList;

public class StartAction implements View.OnClickListener {
        private MainActivity activity;
        private EditText name1;
        private EditText name2;

    public StartAction(MainActivity activity) {
        this.activity = activity;
        name1 = activity.getName1Input();
        name2 = activity.getName2Input();
    }

    @Override
    public void onClick(View view) {
        Player player1 = new Player(name1.getText().toString(),new ArrayList<>());
        Player player2 = new Player(name2.getText().toString(),new ArrayList<>());
        Intent intent = new Intent(activity, GameActivity.class);
        Toast.makeText(activity, "Let's go", Toast.LENGTH_SHORT).show();
        intent.putExtra("player1",player1);
        intent.putExtra("player2",player2);
        activity.startActivity(intent);
        activity.finish();
    }
}
