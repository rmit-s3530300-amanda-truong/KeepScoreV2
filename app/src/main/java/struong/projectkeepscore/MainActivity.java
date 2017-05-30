package struong.projectkeepscore;

import android.content.Context;
import android.content.SharedPreferences;
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
    private String name_p1 = null;
    private String name_p2 = null;

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

        //try to get it to retrieve the name from previous run
        /*if(name_p1 == null)
        {
            etName.setText(getName1(this));
        }
        if(name_p2 == null)
        {
            etName.setText(getName2(this));
        }*/

        name_p1 = etName.getText().toString();
        name_p2 = etName.getText().toString();
        setName(this,name_p1,name_p2);

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

    public void setName(Context context, String name1, String name2)
    {
        //trialing shared preferences to save name after close
        SharedPreferences pref = context.getSharedPreferences("myAppPackage",0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name1",name1);
        editor.putString("name2",name2);
        //consider using apply() look into this!!!
        editor.commit();
    }

    public String getName1(Context context)
    {
        SharedPreferences pref = context.getSharedPreferences("myAppPackage",0);
        return pref.getString("name1","");
    }

    public String getName2(Context context)
    {
        SharedPreferences pref = context.getSharedPreferences("myAppPackage",0);
        return pref.getString("name2","");
    }

}
