package com.example.ml3t;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class isivideotutorial extends AppCompatActivity {

    VideoView videoView;
    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isivideotutorial);

        videoView = (VideoView)findViewById(R.id.videoView);
        play = (Button) findViewById(R.id.play);
    }

    public void VideoPlay(View view) {
    }
}