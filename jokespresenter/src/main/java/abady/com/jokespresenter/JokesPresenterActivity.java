package abady.com.jokespresenter;

import android.os.StrictMode;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesPresenterActivity extends AppCompatActivity {
    public static final String EXTRA ="JOKE";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_presenter);
        textView = (TextView) findViewById(R.id.joke_view);
        textView.setText((String) getIntent().getExtras().get(EXTRA));
    }
}
