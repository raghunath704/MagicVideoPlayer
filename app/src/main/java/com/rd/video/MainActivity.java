package com.rd.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {
    private LookAtMe lookAtMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        lookAtMe = findViewById(R.id.lookme);
        lookAtMe.init(this);
        //lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
        lookAtMe.setVideoPath("https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4"); //to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}