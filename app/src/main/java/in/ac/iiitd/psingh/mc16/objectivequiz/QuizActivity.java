package in.ac.iiitd.psingh.mc16.objectivequiz;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;

    Random rn = new Random();

    private static final String TAG = "QuizActivity";
    private TextView mNumberBox;

    public int checkPrime(int num) {
        int i,m=0,flag=0;
        m=num/2;
        for(i=2;i<=m;i++){
            flag=0;
            if(num%i==0){
                flag=1;
                break;
            }
        }
        return flag;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mNumberBox = (TextView) findViewById(R.id.textView);

        android.widget.LinearLayout.LayoutParams params = (android.widget.LinearLayout.LayoutParams)mNumberBox.getLayoutParams();
        params.setMargins(0, 0, 0, 30); //substitute parameters for left, top, right, bottom
        mNumberBox.setLayoutParams(params);

        mTrueButton = (Button) findViewById(R.id.TrueButton);
        android.widget.LinearLayout.LayoutParams trueparams = (android.widget.LinearLayout.LayoutParams)mTrueButton.getLayoutParams();
        trueparams.setMargins(0, 0, 50, 20); //substitute parameters for left, top, right, bottom
        mTrueButton.setLayoutParams(trueparams);

        mTrueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d(TAG, "Clicked True");
                int ans = rn.nextInt(1000) + 1;
                String answer = String.valueOf(ans);
                Log.d(TAG,answer);
                int c = checkPrime(ans);
                if (c == 0) {
                    Log.d(TAG,"It is prime. You are correct");
                    Toast.makeText(getApplicationContext(), "It is prime. You are correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    Log.d(TAG,"It is not prime. You are incorrect");
                    Toast.makeText(getApplicationContext(), "It is not prime. You are incorrect", Toast.LENGTH_SHORT).show();
                }
                mNumberBox.setText(answer);
            }
        });

        mFalseButton = (Button) findViewById(R.id.FalseButton);
        android.widget.LinearLayout.LayoutParams falseparams = (android.widget.LinearLayout.LayoutParams)mFalseButton.getLayoutParams();
        falseparams.setMargins(50, 0, 0, 20); //substitute parameters for left, top, right, bottom
        mFalseButton.setLayoutParams(falseparams);
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d(TAG, "Clicked False");
                int ans = rn.nextInt(1000) + 1;
                String answer = String.valueOf(ans);
                Log.d(TAG,answer);
                int c = checkPrime(ans);
                if (c == 0) {
                    Log.d(TAG,"It is prime. You are incorrect");
                    Toast.makeText(getApplicationContext(), "It is prime. You are incorrect", Toast.LENGTH_SHORT).show();
                }
                else {
                    Log.d(TAG,"It is not prime. You are correct");
                    Toast.makeText(getApplicationContext(), "It is not prime. You are correct", Toast.LENGTH_SHORT).show();
                }
                mNumberBox.setText(answer);

            }
        });
        mNextButton = (Button) findViewById(R.id.next_button);
        android.widget.LinearLayout.LayoutParams nextparams = (android.widget.LinearLayout.LayoutParams)mNextButton.getLayoutParams();
        nextparams.setMargins(0, 50, 100, 0); //substitute parameters for left, top, right, bottom
        mNextButton.setLayoutParams(nextparams);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d(TAG, "Clicked True");
                int ans = rn.nextInt(1000) + 1;
                String answer = String.valueOf(ans);
                mNumberBox.setText(answer);
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "Inside onSaveInstance");
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(TAG, "Inside OnStart");
        int ans = rn.nextInt(1000) + 1;
        String answer = String.valueOf(ans);
        mNumberBox.setText(answer);
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(TAG,"Inside OnPause");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG,"Inside OnREsume");

    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "Inside OnSTop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Inside OnDestroy");
    }
}
