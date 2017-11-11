package abady.com.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.util.Pair;
import android.util.Log;
import android.widget.Toast;

import com.example.sayed.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 * Created by Sayed on 11/10/2017.
 */
class EndPointsAsyncTask extends AsyncTask<Void, Void, String> {
    private static MyApi myApiService = null;
    JokeListener jokeListener;
    public EndPointsAsyncTask(JokeListener jokeListener){
        this.jokeListener = jokeListener;
    }
    @Override
    protected String doInBackground(Void... params) {
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    // options for running against local devappserver
                    // - 10.0.2.2 is localhost's IP address in Android emulator
                    // - turn off compression when running against local devappserver
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });

            myApiService = builder.build();
        }




        try {

            return myApiService.getRandomJoke().execute().getData();
        } catch (IOException e) {
            e.printStackTrace();
            return"there was an error in the backend.";
        }
    }

    @Override
    protected void onPostExecute(String result) {
        Log.d("resultReturned" , result);
        jokeListener.onJokeFetched(result);
    }
}

