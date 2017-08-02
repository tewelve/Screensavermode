package com.thecreative.screensavermode;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;



public class MainActivity extends AppCompatActivity {

    WebView webView;
    private java.lang.String file;
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        webView = (WebView) findViewById ( R.id.webView );

        webView.loadUrl ( "file:///android_asset/vinayagar.gif" );

    }

    public void Tap(View view) {
        music  = MediaPlayer.create ( MainActivity.this, R.raw.dev );
        {
           if(music.isPlaying()){ music.pause ();}
            else{
               music.start();
           }
        }

           // super.onStop();
        }
    }














