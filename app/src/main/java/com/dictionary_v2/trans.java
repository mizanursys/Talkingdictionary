package com.dictionary_v2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class trans extends Activity {
   WebView web;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans);
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        android.net.NetworkInfo wifi = cm
                .getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        android.net.NetworkInfo datac = cm
                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        if ((wifi != null & datac != null)
                && (wifi.isConnected() | datac.isConnected())) {
            web=(WebView) findViewById(R.id.web);
            web.loadUrl("https://translate.google.com");
            WebSettings webSettings=web.getSettings();
            webSettings.setJavaScriptEnabled(true);
            web.setWebViewClient(new WebViewClient());
            //connection is avlilable
        }else{
            //no connection
            Toast toast = Toast.makeText(this, "No Internet Connection",
                    Toast.LENGTH_LONG);
            toast.show();
        }





        }


    }

