package com.example.mamdouh.site_html;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHome = (Button)findViewById(R.id.btnHome);
        Button btnApp = (Button)findViewById(R.id.btnApps);
        Button btnLucky = (Button)findViewById(R.id.btnLucky);
        Button btnVideos = (Button)findViewById(R.id.btnVideos);
        ImageButton imgLogo = (ImageButton)findViewById(R.id.imgLogo);

        imgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home();
            }
        });


        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)

            {
                home();

            }
        });

        btnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apps();
            }
        });

        btnLucky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Lucky();
            }
        });

        btnVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videos();
            }
        });
    }

    protected void home (){
        setContentView(R.layout.activity_main);
        WebView wvPage;
        wvPage = (WebView) findViewById(R.id.wvPage);
        wvPage.loadUrl("file:///android_asset/home.html");

    }

    protected void apps (){
        setContentView(R.layout.activity_main);
        WebView wvPage;
        wvPage = (WebView) findViewById(R.id.wvPage);
        wvPage.loadUrl("file:///android_asset/app.html");
    }

    protected void Lucky(){
        setContentView(R.layout.activity_main);
        WebView wvPage;
        wvPage = (WebView)findViewById(R.id.wvPage);
        wvPage.loadUrl("file:///android_asset/lucky_winners.html");
    }


    protected void videos (){
        setContentView(R.layout.activity_main);
        WebView wvPages;
        wvPages = (WebView)findViewById(R.id.wvPage);
        wvPages.loadUrl("file:///android_asset/videos.html");


    }

}

