package in.ac.iiitd.psingh.mc16.objectivequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayHintActivity extends AppCompatActivity {

    private static final String TAG = "QuizActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_hint);

        Intent intent1 = getIntent();
        String message = intent1.getStringExtra(QuizActivity.EXTRA_MESSAGE1);
        TextView textView = (TextView) findViewById(R.id.textView);
        //textView.setTextSize(28);
        textView.setText(message);
        Log.d(TAG,"You're in the second activity");
    }
}
