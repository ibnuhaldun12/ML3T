package com.example.ml3t;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class isivideotutorial extends AppCompatActivity {

    VideoView videoView;
    Button play;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isivideotutorial);

        videoView = (VideoView)findViewById(R.id.videoView);
        play = (Button) findViewById(R.id.play);
        mediaController = new MediaController(this);
    }

    public void VideoPlay(View view) {
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.video);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
    }
}