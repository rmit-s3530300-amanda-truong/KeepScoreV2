package struong.projectkeepscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView score;
    private Button bPlus;
    private Button bMinus;
    private Button bSubmit;
    private TextView score2;
    private Button bPlus2;
    private Button bMinus2;
    private EditText tfReason;
    private EditText etName;
    private EditText etName2;

    private int intScore;
    private int intScore2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score = (TextView)findViewById(R.id.score);
        bPlus = (Button)findViewById(R.id.bPlus);
        bMinus = (Button)findViewById(R.id.bMinus);
        score2 = (TextView)findViewById(R.id.score2);
        bPlus2 = (Button)findViewById(R.id.bPlus2);
        bMinus2 = (Button)findViewById(R.id.bMinus2);
        bSubmit = (Button)findViewById(R.id.bSubmit);
        tfReason = (EditText)findViewById(R.id.tfReason);
        etName = (EditText) findViewById(R.id.etName);
        etName2 = (EditText) findViewById(R.id.etName2);

        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intScore = Integer.parseInt(score.getText().toString());
                intScore++;
                score.setText(String.valueOf(intScore));
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intScore = Integer.parseInt(score.getText().toString());
                intScore--;
                score.setText(String.valueOf(intScore));
            }
        });

        bPlus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intScore2 = Integer.parseInt(score2.getText().toString());
                intScore2++;
                score2.setText(String.valueOf(intScore2));
            }
        });

        bMinus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intScore2 = Integer.parseInt(score2.getText().toString());
                intScore2--;
                score2.setText(String.valueOf(intScore2));
            }
        });
    }


}
