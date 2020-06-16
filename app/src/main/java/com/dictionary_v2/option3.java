package com.dictionary_v2;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.SeekBar;

public class option3 extends Activity {
     TextToSpeech textToSpeech;

    private SeekBar mSeekBarPitch;
    private SeekBar mSeekBarSpeed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.dictionary_v2.R.layout.activity_option2);



        mSeekBarPitch = findViewById(com.dictionary_v2.R.id.seek_bar_pitch);
        mSeekBarSpeed = findViewById(com.dictionary_v2.R.id.seek_bar_speed);

        float pitch = (float) mSeekBarPitch.getProgress() / 50;
        if (pitch < 0.1) pitch = 0.1f;

        float speed = (float) mSeekBarSpeed.getProgress() / 50;
        if (speed < 0.1) speed = 0.1f;

        textToSpeech.setPitch(pitch);
        textToSpeech.setSpeechRate(speed);
    }






//    @Override
//    protected void onDestroy() {
//        if (mTTS != null) {
//            mTTS.stop();
//            mTTS.shutdown();

// /        }
//
//        super.onDestroy();
//    }
}

