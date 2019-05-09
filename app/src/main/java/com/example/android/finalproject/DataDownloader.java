package com.example.android.finalproject;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DataDownloader extends AsyncTaskLoader {

    String TAG = "DataDownloader Class";
    String searchUrl = null;

    public DataDownloader(Context context, String url) {
        super(context);
        searchUrl = url;
    }

    public String fetchData(String urlString) {
        StringBuilder result = null;
        BufferedReader reader = null;
        InputStream stream = null;
        InputStreamReader streamReader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //connection.setRequestProperty("X-Auth-Token", getContext().getResources().getString(R.string.api_key));
            connection.connect();

            result = new StringBuilder();
            stream = connection.getInputStream();
            streamReader = new InputStreamReader(stream);
            reader = new BufferedReader(streamReader);

            String line = reader.readLine();
            while (line != null) {
                result.append(line);
                line = reader.readLine();
            }

        } catch (MalformedURLException e) {
            Log.e(TAG, e.toString());
        } catch (IOException e) {
            Log.e(TAG, e.toString());
        } catch (SecurityException e) {
            Log.e(TAG, e.toString());
        }

        return result.toString();
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public String loadInBackground() {
        return fetchData(searchUrl);
    }
}
