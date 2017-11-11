package abady.com.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import abady.com.jokespresenter.JokesPresenterActivity;

public class MainActivity extends AppCompatActivity implements JokeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        new EndPointsAsyncTask(this).execute();

    }

    @Override
    public void onJokeFetched(String joke) {
        Intent intent = new Intent(MainActivity.this , JokesPresenterActivity.class);
        intent.putExtra(JokesPresenterActivity.EXTRA , joke);
        startActivity(intent);
    }
}
