package com.estf.tictactoegame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.estf.tictactoegame.models.Player;

import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity {
    private TextView namePlayer1;
    private TextView namePlayer2;
    private ImageView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Button resetBtn;
    private int counter = 0;
    private Player player1;
    private Player player2;
    private final int[][] winCases = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9},
            {1, 4, 7}, {2, 5, 8}, {3, 6, 9},
            {1, 5, 9}, {3, 5, 7}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        namePlayer1 = findViewById(R.id.namePlayer1);
        namePlayer2 = findViewById(R.id.namePlayer2);
        Intent intent = getIntent();
        this.player1 = (Player) intent.getSerializableExtra("player1");
        this.player2 = (Player) intent.getSerializableExtra("player2");
        namePlayer1.setText(player1.getName().toUpperCase());
        namePlayer2.setText(player2.getName().toUpperCase());
        resetBtn = findViewById(R.id.resetBtn);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetAll();
            }
        });
        btn1.setOnClickListener(v -> {
            counter++;

            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                player1.getMoves().add(1);
                btn1.setImageResource(R.drawable.cross);
                    if (checkIfPlayerWins(player1)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer1.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            } else {
                player2.getMoves().add(1);
                btn1.setImageResource(R.drawable.circle);
                    if (checkIfPlayerWins(player2)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer2.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            }
            btn1.setEnabled(false);
        });
        btn2.setOnClickListener(v -> {
            counter++;

            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                player1.getMoves().add(2);
                btn2.setImageResource(R.drawable.cross);
                    if (checkIfPlayerWins(player1)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer1.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            } else {
                player2.getMoves().add(2);
                btn2.setImageResource(R.drawable.circle);
                    if (checkIfPlayerWins(player2)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer2.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            }
            btn2.setEnabled(false);
        });

        //BTN 3

        btn3.setOnClickListener(v -> {
            counter++;

            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                player1.getMoves().add(3);
                btn3.setImageResource(R.drawable.cross);
                    if (checkIfPlayerWins(player1)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer1.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            } else {
                player2.getMoves().add(2);
                btn3.setImageResource(R.drawable.circle);
                    if (checkIfPlayerWins(player2)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer2.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            }
            btn3.setEnabled(false);
        });

        //BTN4

        btn4.setOnClickListener(v -> {
            counter++;

            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                player1.getMoves().add(4);
                btn4.setImageResource(R.drawable.cross);
                    if (checkIfPlayerWins(player1)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer1.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            } else {
                player2.getMoves().add(4);
                btn4.setImageResource(R.drawable.circle);
                    if (checkIfPlayerWins(player2)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer2.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            }
            btn4.setEnabled(false);
        });

        //BTN5

        btn5.setOnClickListener(v -> {
            counter++;

            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                player1.getMoves().add(5);
                btn5.setImageResource(R.drawable.cross);
                    if (checkIfPlayerWins(player1)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer1.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            } else {
                player2.getMoves().add(5);
                btn5.setImageResource(R.drawable.circle);
                    if (checkIfPlayerWins(player2)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer2.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            }
            btn5.setEnabled(false);
        });

        //BTN6

        btn6.setOnClickListener(v -> {
            counter++;

            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                player1.getMoves().add(6);
                btn6.setImageResource(R.drawable.cross);
                    if (checkIfPlayerWins(player1)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer1.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            } else {
                player2.getMoves().add(6);
                btn6.setImageResource(R.drawable.circle);
                    if (checkIfPlayerWins(player2)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer2.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            }
            btn6.setEnabled(false);
        });

        //BTN7

        btn7.setOnClickListener(v -> {
            counter++;

            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                player1.getMoves().add(7);
                btn7.setImageResource(R.drawable.cross);
                    if (checkIfPlayerWins(player1)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer1.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            } else {
                player2.getMoves().add(7);
                btn7.setImageResource(R.drawable.circle);
                    if (checkIfPlayerWins(player2)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer2.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            }
            btn7.setEnabled(false);
        });

        //BTN8

        btn8.setOnClickListener(v -> {
            counter++;

            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                player1.getMoves().add(8);
                btn8.setImageResource(R.drawable.cross);
                    if (checkIfPlayerWins(player1)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer1.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            } else {
                player2.getMoves().add(8);
                btn8.setImageResource(R.drawable.circle);
                    if (checkIfPlayerWins(player2)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer2.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            }
            btn8.setEnabled(false);
        });

        //BTN 9

        btn9.setOnClickListener(v -> {
            counter++;

            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
                player1.getMoves().add(9);
                btn9.setImageResource(R.drawable.cross);
                    if (checkIfPlayerWins(player1)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer1.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            } else {
                player2.getMoves().add(9);
                btn9.setImageResource(R.drawable.circle);
                    if (checkIfPlayerWins(player2)) {
                        new AlertDialog.Builder(this)
                                .setTitle("Congratulations : " + namePlayer2.getText().toString())
                                .setMessage("You won the game reset ?")
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        resetAll();
                                    }
                                })
                                .show();
                    }
            }
            btn9.setEnabled(false);
        });
    }




    public void resetAll() {
        btn1.setImageDrawable(null);
        btn1.setEnabled(true);
        btn2.setImageDrawable(null);
        btn2.setEnabled(true);
        btn3.setImageDrawable(null);
        btn3.setEnabled(true);
        btn4.setImageDrawable(null);
        btn4.setEnabled(true);
        btn5.setImageDrawable(null);
        btn5.setEnabled(true);
        btn6.setImageDrawable(null);
        btn6.setEnabled(true);
        btn7.setImageDrawable(null);
        btn7.setEnabled(true);
        btn8.setImageDrawable(null);
        btn8.setEnabled(true);
        btn9.setImageDrawable(null);
        btn9.setEnabled(true);
        counter = 0;
        player1.getMoves().clear();
        player2.getMoves().clear();
    }

    public boolean checkIfPlayerWins(Player player) {
        List<Integer> playerMoves = player.getMoves();
        for (int[] winCase : winCases) {
            boolean foundWin = true;
            for (int move : winCase) {
                if (!playerMoves.contains(move)) {
                    foundWin = false;
                    break;
                }
            }
            if (foundWin) {
                return true;
            }
        }
        return false;
    }


}