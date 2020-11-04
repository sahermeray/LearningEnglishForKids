package com.saher.learningenglishforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LetterAndWord extends AppCompatActivity {
    ImageView iv;
    TextView tv;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_and_word);
        iv=findViewById(R.id.letter_and_word_iv);
        tv=findViewById(R.id.letter_and_word_tv);
        Intent x=getIntent();
        int i=x.getIntExtra("image",0);
        final int v=x.getIntExtra("voice",0);
        String t=x.getStringExtra("word");
        iv.setImageResource(i);
        tv.setText(t);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMP();
                mp=MediaPlayer.create(getBaseContext(),v);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releaseMP();
                    }
                });
            }
        });
    }
    private void releaseMP(){
        if(mp!=null){
            mp.release();
            mp=null;
        }
    }
}