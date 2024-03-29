package in.ac.iiitd.psingh.mc16.objectivequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayHintActivity extends AppCompatActivity {

    private static final String TAG = "QuizActivity";
    private Button mBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_hint);

        Intent intent1 = getIntent();
        String message = intent1.getStringExtra(QuizActivity.EXTRA_MESSAGE1);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
        Log.d(TAG,"You're in the second activity");
    }

    public void backPress(View view) {
        finish();
    }
}
