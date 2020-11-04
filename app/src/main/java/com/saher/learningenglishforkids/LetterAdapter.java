package com.saher.learningenglishforkids;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class LetterAdapter extends BaseAdapter {
    private Context c;
    private ArrayList<Integer> letters;

    public LetterAdapter(Context c,ArrayList<Integer>letters){
        this.c=c;
        this.letters=letters;
    }

    @Override
    public int getCount() {
        return letters.size();
    }

    @Override
    public Integer getItem(int i) {
        return letters.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v=view;
        if(v==null){
            v= LayoutInflater.from(c).inflate(R.layout.letter_layout,null,false);
        }
        ImageView iv=v.findViewById(R.id.letter_layout_iv);
        Integer ll=getItem(i);
        iv.setImageResource(ll);
        return v;
    }
}
