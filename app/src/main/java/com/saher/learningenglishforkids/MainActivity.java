package com.saher.learningenglishforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gv;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=findViewById(R.id.main_activity_gv);
        ArrayList<Integer>al=new ArrayList<>();
        al.add(R.drawable.ic_a);
        al.add(R.drawable.ic_b);
        al.add(R.drawable.ic_c);
        al.add(R.drawable.ic_d);
        al.add(R.drawable.ic_e);
        al.add(R.drawable.ic_f);
        al.add(R.drawable.ic_g);
        al.add(R.drawable.ic_h);
        al.add(R.drawable.ic_i);
        al.add(R.drawable.ic_j);
        al.add(R.drawable.ic_k);
        al.add(R.drawable.ic_l);
        al.add(R.drawable.ic_m);
        al.add(R.drawable.ic_n);
        al.add(R.drawable.ic_o);
        al.add(R.drawable.ic_p);
        al.add(R.drawable.ic_q);
        al.add(R.drawable.ic_r);
        al.add(R.drawable.ic_s);
        al.add(R.drawable.ic_t);
        al.add(R.drawable.ic_u);
        al.add(R.drawable.ic_v);
        al.add(R.drawable.ic_w);
        al.add(R.drawable.ic_x);
        al.add(R.drawable.ic_y);
        al.add(R.drawable.ic_z);
        LetterAdapter la=new LetterAdapter(this,al);
        gv.setAdapter(la);


        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getBaseContext(),LetterAndWord.class);
                switch (i){
                    case 0:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.a);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.apple);
                        intent.putExtra("image",R.drawable.ic_apple);
                        intent.putExtra("word","APPLE");
                        break;
                    case 1:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.b);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.banana);
                        intent.putExtra("image",R.drawable.ic_banana);
                        intent.putExtra("word","BANANA");
                        break;
                    case 2:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.c);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.car);
                        intent.putExtra("image",R.drawable.ic_car);
                        intent.putExtra("word","CAR");
                        break;
                    case 3:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.d);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.duck);
                        intent.putExtra("image",R.drawable.ic_duck);
                        intent.putExtra("word","DUCK");
                        break;
                    case 4:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.e);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.elephant);
                        intent.putExtra("image",R.drawable.ic_elephant);
                        intent.putExtra("word","ELEPHANT");
                        break;
                    case 5:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.f);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.frog);
                        intent.putExtra("image",R.drawable.ic_frog);
                        intent.putExtra("word","FROG");
                        break;
                    case 6:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.g);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.girl);
                        intent.putExtra("image",R.drawable.ic_girl);
                        intent.putExtra("word","GIRL");
                        break;
                    case 7:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.h);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.home);
                        intent.putExtra("image",R.drawable.ic_home);
                        intent.putExtra("word","HOME");
                        break;
                    case 8:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.i);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.icecream);
                        intent.putExtra("image",R.drawable.ic_ice_cream);
                        intent.putExtra("word","ICE CREAM");
                        break;
                    case 9:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.j);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.juice);
                        intent.putExtra("image",R.drawable.ic_juice);
                        intent.putExtra("word","JUICE");
                        break;
                    case 10:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.k);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.key);
                        intent.putExtra("image",R.drawable.ic_key);
                        intent.putExtra("word","KEY");
                        break;
                    case 11:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.l);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.lion);
                        intent.putExtra("image",R.drawable.ic_lion);
                        intent.putExtra("word","LION");
                        break;
                    case 12:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.m);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.milk);
                        intent.putExtra("image",R.drawable.ic_milk);
                        intent.putExtra("word","MILK");
                        break;
                    case 13:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.n);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.nurse);
                        intent.putExtra("image",R.drawable.ic_nurse);
                        intent.putExtra("word","NURSE");
                        break;
                    case 14:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.o);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.orange);
                        intent.putExtra("image",R.drawable.ic_orange);
                        intent.putExtra("word","ORANGE");
                        break;
                    case 15:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.p);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.pencil);
                        intent.putExtra("image",R.drawable.ic_pencil);
                        intent.putExtra("word","PENCIL");
                        break;
                    case 16:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.q);
                        mediaPlayer.start();
                        intent.putExtra("voice",R.raw.quiestion);
                        intent.putExtra("image",R.drawable.ic_quiestion_mark);
                        intent.putExtra("word","QUIESTION");
                        break;
                    case 17:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.r);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.rain);
                        intent.putExtra("image",R.drawable.ic_rain);
                        intent.putExtra("word","RAIN");
                        break;
                    case 18:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.s);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.star);
                        intent.putExtra("image",R.drawable.ic_star);
                        intent.putExtra("word","STAR");
                        break;
                    case 19:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.t);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.tea);
                        intent.putExtra("image",R.drawable.ic_tea);
                        intent.putExtra("word","TEA");
                        break;
                    case 20:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.u);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.umbrella);
                        intent.putExtra("image",R.drawable.ic_umbrella);
                        intent.putExtra("word","UMBRELLA");
                        break;
                    case 21:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.v);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.vest);
                        intent.putExtra("image",R.drawable.ic_vest);
                        intent.putExtra("word","VEST");
                        break;
                    case 22:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.w);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.wolf);
                        intent.putExtra("image",R.drawable.ic_wolf);
                        intent.putExtra("word","WOLF");
                        break;
                    case 23:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.x);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.xylophone);
                        intent.putExtra("image",R.drawable.ic_xylophone);
                        intent.putExtra("word","XYLOPHONE");
                        break;
                    case 24:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.y);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.young);
                        intent.putExtra("image",R.drawable.ic_young);
                        intent.putExtra("word","YOUNG");
                        break;
                    case 25:
                        releaseMediaPlayer();
                        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.z);
                        mediaPlayer.start();
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releaseMediaPlayer();
                            }
                        });
                        intent.putExtra("voice",R.raw.zero);
                        intent.putExtra("image",R.drawable.ic_zero);
                        intent.putExtra("word","ZERO");
                        break;
                }
                startActivity(intent);
            }
        });

    }
    private void releaseMediaPlayer(){
        if(mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer=null;
        }
    }
}